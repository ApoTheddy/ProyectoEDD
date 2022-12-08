package Modelo.Comidas;

import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONObject;

public class Ingredientes {

    @Getter
    private long id;

    @Getter
    private String aisle;

    @Getter
    private String image;

    @Getter
    private String consistency;

    @Getter
    private String name;

    @Getter
    private String nameClean;

    @Getter
    private String original;

    @Getter
    private String originalName;

    @Getter
    private double amount;
    private String unit;

    @Getter
    private JSONArray meta;

    private JSONObject measures;

    public Ingredientes() {
    }

    public Ingredientes(long id, String aisle, String image, String consistency, String name, String nameClean, String original, String originalName, double amount, String unit, JSONArray meta, JSONObject measures) {
        this.id = id;
        this.aisle = aisle;
        this.image = image;
        this.consistency = consistency;
        this.name = name;
        this.nameClean = nameClean;
        this.original = original;
        this.originalName = originalName;
        this.amount = amount;
        this.unit = unit;
        this.meta = meta;
        this.measures = measures;
    }

    public Medidas getMeasures() {
        Medidas medidas = new Medidas(measures.getJSONObject("us"), measures.getJSONObject("metric"));
        return medidas;
    }

}
