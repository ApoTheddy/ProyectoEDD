package Modelo.Comidas;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ingredientes {

    private long id;
    private String aisle;
    private String image;
    private String consistency;
    private String name;
    private String nameClean;
    private String original;
    private String originalName;
    private double amount;
    private String unit;
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

    public long getId() {
        return id;
    }

    public String getAisle() {
        return aisle;
    }

    public String getImage() {
        return image;
    }

    public String getConsistency() {
        return consistency;
    }

    public String getName() {
        return name;
    }

    public String getNameClean() {
        return nameClean;
    }

    public String getOriginal() {
        return original;
    }

    public String getOriginalName() {
        return originalName;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public JSONArray getMeta() {
        return meta;
    }

    public Medidas getMeasures() {
        Medidas medidas = new Medidas(measures.getJSONObject("us"), measures.getJSONObject("metric"));
        return medidas;
    }

}
