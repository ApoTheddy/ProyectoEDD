package Modelo.Ejercicios;

import lombok.Getter;

public class Nota {

    @Getter
    private int id;

    @Getter
    private int exercise;

    @Getter
    private String comment;

    public Nota() {
    }

    public Nota(int id, int exercise, String comment) {
        this.id = id;
        this.exercise = exercise;
        this.comment = comment;
    }
}
