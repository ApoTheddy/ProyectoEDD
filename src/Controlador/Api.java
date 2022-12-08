package Controlador;

import Modelo.Ejercicios.Ejercicios;
import Modelo.Comidas.Receta;
import Modelo.Comidas.Recetas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class Api {

    private HttpURLConnection con;

    private final String apiKey = "9d6df40d88594d93ba8a37471d86702c";
    private final String urlRandomRecipe = "https://api.spoonacular.com/recipes/random?apiKey=" + apiKey;
    private String urlEjercicios = "https://wger.de/api/v2/exercisebaseinfo/";

    public Receta getRandomRecipe() {
        try {
            URL url = new URL(urlRandomRecipe);
            con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));

            JSONObject objetoRecetas = new JSONObject(bf.readLine());

            Recetas recetas = new Recetas(objetoRecetas.getJSONArray("recipes"));

            boolean vegetarian = getData(recetas).getBoolean("vegetarian");
            boolean vegan = getData(recetas).getBoolean("vegan");
            boolean glutenFree = getData(recetas).getBoolean("glutenFree");
            boolean dairyFree = getData(recetas).getBoolean("dairyFree");
            boolean veryHealthy = getData(recetas).getBoolean("veryHealthy");
            boolean cheap = getData(recetas).getBoolean("cheap");
            boolean veryPopular = getData(recetas).getBoolean("veryPopular");
            boolean sustainable = getData(recetas).getBoolean("sustainable");
            boolean lowFodmap = getData(recetas).getBoolean("lowFodmap");
            double weightWatcherSmartPoints = getData(recetas).getDouble("weightWatcherSmartPoints");
            String gaps = getData(recetas).getString("gaps");
            double preparationMinutes = getData(recetas).getDouble("preparationMinutes");
            double cookingMinutes = getData(recetas).getDouble("cookingMinutes");
            int aggregateLikes = getData(recetas).getInt("aggregateLikes");
            int healthScore = getData(recetas).getInt("healthScore");
            String creditsText = getData(recetas).getString("creditsText");
            String sourceName = getData(recetas).getString("sourceName");
            double pricePerServing = getData(recetas).getDouble("pricePerServing");
            JSONArray extendedIngredients = getData(recetas).getJSONArray("extendedIngredients");
            long id = getData(recetas).getLong("id");
            String title = getData(recetas).getString("title");
            int readyInMinutes = getData(recetas).getInt("readyInMinutes");
            int servings = getData(recetas).getInt("servings");
            String sourceUrl = getData(recetas).getString("sourceUrl");
            String image = getData(recetas).getString("image");
            String imageType = getData(recetas).getString("imageType");
            String summary = getData(recetas).getString("summary");
            JSONArray cuisines = getData(recetas).getJSONArray("cuisines");
            JSONArray dishTypes = getData(recetas).getJSONArray("dishTypes");
            JSONArray diets = getData(recetas).getJSONArray("diets");
            JSONArray occasions = getData(recetas).getJSONArray("occasions");
            String instructions = getData(recetas).getString("instructions");
            JSONArray analyzedInstructions = getData(recetas).getJSONArray("analyzedInstructions");
            Object originalId = getData(recetas).get("originalId");
            String spoonacularSourceUrl = getData(recetas).getString("spoonacularSourceUrl");

            Receta receta = new Receta(vegetarian, vegan, glutenFree, dairyFree, veryHealthy, cheap, veryPopular, sustainable, lowFodmap, weightWatcherSmartPoints, gaps, preparationMinutes, cookingMinutes, aggregateLikes, healthScore, creditsText, sourceName, pricePerServing, extendedIngredients, id, title, readyInMinutes, servings, sourceUrl, image, imageType, summary, cuisines, dishTypes, diets, occasions, instructions, analyzedInstructions, originalId, spoonacularSourceUrl);
            return receta;

        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Error: " + ioex.getMessage());
        }

        return null;
    }

    private JSONObject getData(Recetas recetas) {
        return ((JSONObject) recetas.getRecipes().get(0));
    }

    public Ejercicios getExercises(String page) {
        Ejercicios ejercicios = null;

        try {
            URL url;
            if (page!=null) {
                url = new URL(page);
            } else {
                url = new URL(urlEjercicios);
            }
            
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
            JSONObject arrayEjercicios = new JSONObject(bf.readLine());

            int count = arrayEjercicios.getInt("count");
            String next = arrayEjercicios.getString("next");
            Object previous = arrayEjercicios.get("previous");
            JSONArray results = arrayEjercicios.getJSONArray("results");

            ejercicios = new Ejercicios(count, next, previous, results);
        } catch (IOException ioex) {
            JOptionPane.showMessageDialog(null, "Error: " + ioex.getMessage());
        }finally{
            con.disconnect();
        }
        
        
        return ejercicios;
    }

}
