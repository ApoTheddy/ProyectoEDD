package Modelo.Comidas;

import lombok.Getter;

public class Us {

    @Getter
    private double amount;

    @Getter
    private String unitShort;

    @Getter
    private String unitLong;

    public Us() {

    }

    public Us(double amount, String unitShort, String unitLong) {
        this.amount = amount;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
    }
}
