package Modelo.Ejercicios;

import java.util.ArrayList;
import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.Functions;

public class Informacion extends Functions {

    @Getter
    private int id;

    @Getter
    private String uuid;

    @Getter
    private String creation_date;

    private JSONObject category;
    private JSONArray muscles;
    private JSONArray equipment;
    private JSONArray images;
    private JSONArray exercises;

    @Getter
    private JSONArray muscles_secondary;

    @Getter
    private JSONObject license;

    @Getter
    private Object variations;

    @Getter
    private JSONArray videos;

    @Getter
    private JSONArray author_history;

    @Getter
    private JSONArray total_authors_history;

    public Informacion() {

    }

    public Informacion(int id, String uuid, String creation_date, JSONObject category, JSONArray muscles, JSONArray muscles_secondary, JSONArray equipment, JSONObject license, JSONArray images, JSONArray exercises, Object variations, JSONArray videos, JSONArray author_history, JSONArray total_authors_history) {
        this.id = id;
        this.uuid = uuid;
        this.creation_date = creation_date;
        this.category = category;
        this.muscles = muscles;
        this.muscles_secondary = muscles_secondary;
        this.equipment = equipment;
        this.license = license;
        this.images = images;
        this.exercises = exercises;
        this.variations = variations;
        this.videos = videos;
        this.author_history = author_history;
        this.total_authors_history = total_authors_history;
    }

    public Categoria getCategory() {
        Categoria categoriaClass = new Categoria(category.getInt("id"), category.getString("name"));
        return categoriaClass;
    }

    public ArrayList<Musculos> getMuscles() {
        ArrayList<Musculos> musculos = new ArrayList<>();

        for (int i = 0; i < muscles.length(); ++i) {
            int id = toJson(i, muscles).getInt("id");
            String name = toJson(i, muscles).getString("name");
            String name_en = toJson(i, muscles).getString("name_en");
            boolean is_front = toJson(i, muscles).getBoolean("is_front");
            String image_url_main = toJson(i, muscles).getString("image_url_main");
            String image_url_secondary = toJson(i, muscles).getString("image_url_secondary");

            musculos.add(new Musculos(id, name, name_en, is_front, image_url_main, image_url_secondary));
        }
        return musculos;
    }

    public ArrayList<MusculosSecundarios> getMuscles_secondary() {
        ArrayList<MusculosSecundarios> musculosSecundarios = new ArrayList<>();

        for (int i = 0; i < muscles_secondary.length(); ++i) {
            int id = toJson(i, muscles).getInt("id");
            String name = toJson(i, muscles).getString("name");
            String name_en = toJson(i, muscles).getString("name_en");
            boolean is_front = toJson(i, muscles).getBoolean("is_front");
            String image_url_main = toJson(i, muscles).getString("image_url_main");
            String image_url_secondary = toJson(i, muscles).getString("image_url_secondary");

            musculosSecundarios.add(new MusculosSecundarios(id, name, name_en, is_front, image_url_main, image_url_secondary));
        }

        return musculosSecundarios;
    }

    public ArrayList<Equipamento> getEquipment() {
        ArrayList<Equipamento> equipamiento = new ArrayList<>();

        for (int i = 0; i < equipment.length(); ++i) {
            int id = toJson(i, equipment).getInt("id");
            String name = toJson(i, equipment).getString("name");

            equipamiento.add(new Equipamento(id, name));
        }
        return equipamiento;
    }

    public JSONObject getLicense() {
        return license;
    }

    public ArrayList<Imagen> getImages() {
        ArrayList<Imagen> imagenes = new ArrayList<>();

        for (int i = 0; i < images.length(); ++i) {
            int id = toJson(i, images).getInt("id");
            String uuid = toJson(i, images).getString("uuid");
            int exercise_base = toJson(i, images).getInt("exercise_base");
            String image = toJson(i, images).getString("image");
            boolean is_main = toJson(i, images).getBoolean("is_main");
            String style = toJson(i, images).getString("style");
            int license = toJson(i, images).getInt("license");
            String license_author = toJson(i, images).getString("license_author");
            JSONArray author_history = toJson(i, images).getJSONArray("author_history");

            imagenes.add(new Imagen(id, uuid, exercise_base, image, is_main, style, license, license_author, author_history));
        }

        return imagenes;
    }

    public ArrayList<Ejercicio> getExercises() {
        ArrayList<Ejercicio> ejercicios = new ArrayList<>();
        for (int i = 0; i < exercises.length(); ++i) {
            int id = toJson(i, exercises).getInt("id");
            String uuid = toJson(i, exercises).getString("uuid");
            String name = toJson(i, exercises).getString("name");
            int exercise_base = toJson(i, exercises).getInt("exercise_base");
            String description = toJson(i, exercises).getString("description");
            String creation_date = toJson(i, exercises).getString("creation_date");
            int language = toJson(i, exercises).getInt("language");
            JSONArray aliases = toJson(i, exercises).getJSONArray("aliases");
            JSONArray notes = toJson(i, exercises).getJSONArray("notes");
            JSONArray author_history = toJson(i, exercises).getJSONArray("author_history");

            ejercicios.add(new Ejercicio(id, uuid, name, exercise_base, description, creation_date, language, aliases, notes, author_history));
        }

        return ejercicios;
    }
}
