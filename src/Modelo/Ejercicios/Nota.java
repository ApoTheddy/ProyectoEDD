package Modelo.Ejercicios;

public class Nota {

    private int id;
    private int exercise;
    private String comment;

    public Nota() {
    }

    public Nota(int id, int exercise, String comment) {
        this.id = id;
        this.exercise = exercise;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public int getExercise() {
        return exercise;
    }

    public String getComment() {
        return comment;
    }

}
