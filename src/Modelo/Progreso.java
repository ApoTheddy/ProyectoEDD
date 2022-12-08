package Modelo;

import lombok.Getter;

public class Progreso {

    @Getter
    private double peso;

    @Getter
    private double imc;

    @Getter
    String fecha;

    public Progreso(double peso, double imc, String fecha) {
        this.peso = peso;
        this.imc = imc;
        this.fecha = fecha;
    }

}
