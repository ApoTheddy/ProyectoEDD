package Modelo.Comidas;

import lombok.Getter;
import org.json.JSONArray;

public class Recetas {

    @Getter
    private JSONArray recipes;

    public Recetas() {
    }

    public Recetas(JSONArray recipes) {
        this.recipes = recipes;
    }
}
