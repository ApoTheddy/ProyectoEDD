package Modelo.Ejercicios;

import lombok.Getter;
import org.json.JSONArray;

public class Imagen {

    @Getter
    private int id;

    @Getter
    private String uuid;

    @Getter
    private int exercise_base;

    @Getter
    private String image;

    @Getter
    private boolean is_main;

    @Getter
    private String style;

    @Getter
    private int license;

    @Getter
    private String license_author;

    @Getter
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

}
