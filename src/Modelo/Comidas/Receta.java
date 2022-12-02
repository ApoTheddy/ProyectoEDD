package Modelo.Comidas;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class Receta {
    
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean veryHealthy;
    private boolean cheap;
    private boolean veryPopular;
    private boolean sustainable;
    private boolean lowFodmap;
    private double weightWatcherSmartPoints;
    private String gaps;
    private double preparationMinutes;
    private double cookingMinutes;
    private int aggregateLikes;
    private int healthScore;
    private String creditsText;
    private String sourceName;
    private double pricePerServing;
    private JSONArray extendedIngredients;
    private long id;
    private String title;
    private int readyInMinutes;
    private int servings;
    private String sourceUrl;
    private String image;
    private String imageType;
    private String summary;
    private JSONArray cuisines;
    private JSONArray dishTypes;
    private JSONArray diets;
    private JSONArray occasions;
    private String instructions;
    private JSONArray analyzedInstructions;
    private Object originalId;
    private String spoonacularSourceUrl;
    
    public Receta() {
    }
    
    ;
    
    public Receta(boolean vegetarian, boolean vegan, boolean glutenFree, boolean dairyFree, boolean veryHealthy, boolean cheap, boolean veryPopular, boolean sustainable, boolean lowFodmap, double weightWatcherSmartPoints, String gaps, double preparationMinutes, double cookingMinutes, int aggregateLikes, int healthScore, String creditsText, String sourceName, double pricePerServing, JSONArray extendedIngredients, long id, String title, int readyInMinutes, int servings, String sourceUrl, String image, String imageType, String summary, JSONArray cuisines, JSONArray dishTypes, JSONArray diets, JSONArray occasions, String instructions, JSONArray analyzedInstructions, Object originalId, String spoonacularSourceUrl) {
        this.vegetarian = vegetarian;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
        this.dairyFree = dairyFree;
        this.veryHealthy = veryHealthy;
        this.cheap = cheap;
        this.veryPopular = veryPopular;
        this.sustainable = sustainable;
        this.lowFodmap = lowFodmap;
        this.weightWatcherSmartPoints = weightWatcherSmartPoints;
        this.gaps = gaps;
        this.preparationMinutes = preparationMinutes;
        this.cookingMinutes = cookingMinutes;
        this.aggregateLikes = aggregateLikes;
        this.healthScore = healthScore;
        this.creditsText = creditsText;
        this.sourceName = sourceName;
        this.pricePerServing = pricePerServing;
        this.extendedIngredients = extendedIngredients;
        this.id = id;
        this.title = title;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.sourceUrl = sourceUrl;
        this.image = image;
        this.imageType = imageType;
        this.summary = summary;
        this.cuisines = cuisines;
        this.dishTypes = dishTypes;
        this.diets = diets;
        this.occasions = occasions;
        this.instructions = instructions;
        this.analyzedInstructions = analyzedInstructions;
        this.originalId = originalId;
        this.spoonacularSourceUrl = spoonacularSourceUrl;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public boolean isVegan() {
        return vegan;
    }
    
    public boolean isGlutenFree() {
        return glutenFree;
    }
    
    public boolean isDairyFree() {
        return dairyFree;
    }
    
    public boolean isVeryHealthy() {
        return veryHealthy;
    }
    
    public boolean isCheap() {
        return cheap;
    }
    
    public boolean isVeryPopular() {
        return veryPopular;
    }
    
    public boolean isSustainable() {
        return sustainable;
    }
    
    public boolean isLowFodmap() {
        return lowFodmap;
    }
    
    public double getWeightWatcherSmartPoints() {
        return weightWatcherSmartPoints;
    }
    
    public String getGaps() {
        return gaps;
    }
    
    public double getPreparationMinutes() {
        return preparationMinutes;
    }
    
    public double getCookingMinutes() {
        return cookingMinutes;
    }
    
    public int getAggregateLikes() {
        return aggregateLikes;
    }
    
    public int getHealthScore() {
        return healthScore;
    }
    
    public String getCreditsText() {
        return creditsText;
    }
    
    public String getSourceName() {
        return sourceName;
    }
    
    public double getPricePerServing() {
        return pricePerServing;
    }
    
    public ArrayList<Ingredientes> getExtendedIngredients() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<>();        
        for (int i = 0; i < extendedIngredients.length(); ++i) {
            
            long id = getData(i).getLong("id");
            String aisle = getData(i).getString("aisle");
            String image = getData(i).getString("image");
            String consistency = getData(i).getString("consistency");
            String name = getData(i).getString("name");
            String nameClean = getData(i).getString("nameClean");
            String original = getData(i).getString("original");
            String originalName = getData(i).getString("originalName");
            double amount = getData(i).getDouble("amount");
            String unit = getData(i).getString("unit");
            JSONArray meta = getData(i).getJSONArray("meta");
            JSONObject measures = getData(i).getJSONObject("measures");

            ingredientes.add(new Ingredientes(id, aisle, image, consistency, name, nameClean, original, originalName, amount, unit, meta, measures));
        }
        return ingredientes;
    }
    
    private JSONObject getData(int index) {
        return (JSONObject) extendedIngredients.get(index);
    }
    
    public long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getReadyInMinutes() {
        return readyInMinutes;
    }
    
    public int getServings() {
        return servings;
    }
    
    public String getSourceUrl() {
        return sourceUrl;
    }
    
    public String getImage() {
        return image;
    }
    
    public String getImageType() {
        return imageType;
    }
    
    public String getSummary() {
        return summary;
    }
    
    public JSONArray getCuisines() {
        return cuisines;
    }
    
    public JSONArray getDishTypes() {
        return dishTypes;
    }
    
    public JSONArray getDiets() {
        return diets;
    }
    
    public JSONArray getOccasions() {
        return occasions;
    }
    
    public String getInstructions() {
        return instructions;
    }
    
    public JSONArray getAnalyzedInstructions() {
        return analyzedInstructions;
    }
    
    public Object getOriginalId() {
        return originalId;
    }
    
    public String getSpoonacularSourceUrl() {
        return spoonacularSourceUrl;
    }
    
}
