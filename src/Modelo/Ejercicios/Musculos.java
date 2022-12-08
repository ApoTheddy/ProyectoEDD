package Modelo.Ejercicios;

import lombok.Getter;

public class Musculos {

    @Getter
    private int id;

    @Getter
    private String name;

    @Getter
    private String name_en;

    @Getter
    private boolean is_front;

    @Getter
    private String image_url_main;

    @Getter
    private String image_url_secondary;

    public Musculos() {
    }

    public Musculos(int id, String name, String name_en, boolean is_front, String image_url_main, String image_url_secondary) {
        this.id = id;
        this.name = name;
        this.name_en = name_en;
        this.is_front = is_front;
        this.image_url_main = image_url_main;
        this.image_url_secondary = image_url_secondary;
    }
}
