package Modelo.Comidas;

import lombok.Getter;

public class Metric {

    @Getter
    private double amount;

    @Getter
    private String unitShort;

    @Getter
    private String unitLong;

    public Metric() {

    }

    public Metric(double amount, String unitShort, String unitLong) {
        this.amount = amount;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
    }
}
