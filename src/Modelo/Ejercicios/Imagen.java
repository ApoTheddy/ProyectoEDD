package Modelo.Ejercicios;

import org.json.JSONArray;

public class Imagen {

    private int id;
    private String uuid;
    private int exercise_base;
    private String image;
    private boolean is_main;
    private String style;
    private int license;
    private String license_author;
    private JSONArray author_history;

    public Imagen() {
    }

    public Imagen(int id, String uuid, int exercise_base, String image, boolean is_main, String style, int license, String license_author, JSONArray author_history) {
        this.id = id;
        this.uuid = uuid;
        this.exercise_base = exercise_base;
        this.image = image;
        this.is_main = is_main;
        this.style = style;
        this.license = license;
        this.license_author = license_author;
        this.author_history = author_history;
    }

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public int getExercise_base() {
        return exercise_base;
    }

    public String getImage() {
        return image;
    }

    public boolean isIs_main() {
        return is_main;
    }

    public String getStyle() {
        return style;
    }

    public int getLicense() {
        return license;
    }

    public String getLicense_author() {
        return license_author;
    }

    public JSONArray getAuthor_history() {
        return author_history;
    }

}
