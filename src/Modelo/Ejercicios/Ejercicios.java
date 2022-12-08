package Modelo.Ejercicios;

import java.util.ArrayList;
import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Functions;

public class Ejercicios extends Functions {

    @Getter
    private int count;

    @Getter
    private String next;

    @Getter
    private Object previous;

    @Getter
    private JSONArray results;

    public Ejercicios() {
    }

    public Ejercicios(int count, String next, Object previous, JSONArray results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public ArrayList<Informacion> getResults() {
        ArrayList<Informacion> resultados = new ArrayList<>();

        for (int i = 0; i < results.length(); ++i) {
            int id = toJson(i, results).getInt("id");
            String uuid = toJson(i, results).getString("uuid");
            String creation_date = toJson(i, results).getString("creation_date");
            JSONObject category = toJson(i, results).getJSONObject("category");
            JSONArray muscles = toJson(i, results).getJSONArray("muscles");
            JSONArray muscles_secondary = toJson(i, results).getJSONArray("muscles_secondary");
            JSONArray equipment = toJson(i, results).getJSONArray("equipment");
            JSONObject license = toJson(i, results).getJSONObject("license");
            JSONArray images = toJson(i, results).getJSONArray("images");
            JSONArray exercises = toJson(i, results).getJSONArray("exercises");
            Object variations = toJson(i, results).get("variations");
            JSONArray videos = toJson(i, results).getJSONArray("videos");
            JSONArray author_history = toJson(i, results).getJSONArray("author_history");
            JSONArray total_authors_history = toJson(i, results).getJSONArray("total_authors_history");

            resultados.add(new Informacion(id, uuid, creation_date, category, muscles, muscles_secondary, equipment, license, images, exercises, variations, videos, author_history, total_authors_history));
        }
        return resultados;
    }

}
