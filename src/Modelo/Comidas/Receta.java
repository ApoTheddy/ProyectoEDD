package Modelo.Comidas;

import java.util.ArrayList;
import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONObject;

public class Receta {

    @Getter
    private boolean vegetarian;

    @Getter
    private boolean vegan;

    @Getter
    private boolean glutenFree;

    @Getter
    private boolean dairyFree;

    @Getter
    private boolean veryHealthy;

    @Getter
    private boolean cheap;

    @Getter
    private boolean veryPopular;

    @Getter
    private boolean sustainable;

    @Getter
    private boolean lowFodmap;

    @Getter
    private double weightWatcherSmartPoints;

    @Getter
    private String gaps;

    @Getter
    private double preparationMinutes;

    @Getter
    private double cookingMinutes;

    @Getter
    private int aggregateLikes;

    @Getter
    private int healthScore;

    @Getter
    private String creditsText;

    @Getter
    private String sourceName;

    @Getter
    private double pricePerServing;

    private JSONArray extendedIngredients;

    @Getter
    private long id;

    @Getter
    private String title;

    @Getter
    private int readyInMinutes;

    @Getter
    private int servings;

    @Getter
    private String sourceUrl;

    @Getter
    private String image;

    @Getter
    private String imageType;

    @Getter
    private String summary;

    @Getter
    private JSONArray cuisines;

    @Getter
    private JSONArray dishTypes;

    @Getter
    private JSONArray diets;

    @Getter
    private JSONArray occasions;

    @Getter
    private String instructions;

    @Getter
    private JSONArray analyzedInstructions;

    @Getter
    private Object originalId;

    @Getter
    private String spoonacularSourceUrl;

    public Receta() {
    }

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

}
