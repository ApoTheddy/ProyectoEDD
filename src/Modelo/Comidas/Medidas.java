package Modelo.Comidas;

import lombok.Getter;
import org.json.JSONObject;

public class Medidas {

    private JSONObject us;
    private JSONObject metric;

    public Medidas() {

    }

    public Medidas(JSONObject us, JSONObject metric) {
        this.us = us;
        this.metric = metric;
    }

    public Us getUs() {
        double amount = us.getDouble("amount");
        String unitShort = us.getString("unitShort");
        String unitLong = us.getString("unitLong");
        return new Us(amount, unitShort, unitLong);
    }

    public Metric getMetric() {
        double amount = metric.getDouble("amount");
        String unitShort = metric.getString("unitShort");
        String unitLong = metric.getString("unitLong");
        return new Metric(amount, unitShort, unitLong);
    }

};
