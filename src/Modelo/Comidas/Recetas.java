package Modelo.Comidas;

import org.json.JSONArray;

public class Recetas {

    private JSONArray recipes;

    public Recetas() {
    }

    public Recetas(JSONArray recipes) {
        this.recipes = recipes;
    }

    public JSONArray getRecipes() {
        return recipes;
    }

}
