package Modelo.Comidas;

public class Us {

    private double amount;
    private String unitShort;
    private String unitLong;

    public Us() {

    }

    public Us(double amount, String unitShort, String unitLong) {
        this.amount = amount;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public String getUnitLong() {
        return unitLong;
    }

   
}
