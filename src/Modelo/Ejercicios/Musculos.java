package Modelo.Ejercicios;

public class Musculos {

    private int id;
    private String name;
    private String name_en;
    private boolean is_front;
    private String image_url_main;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getName_en() {
        return name_en;
    }

    public boolean isIs_front() {
        return is_front;
    }

    public String getImage_url_main() {
        return image_url_main;
    }

    public String getImage_url_secondary() {
        return image_url_secondary;
    }

}
