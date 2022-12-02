package Modelo.Ejercicios;

import org.json.JSONArray;

public class Ejercicio {

    private int id;
    private String uuid;
    private String name;
    private int exercise_base;
    private String description;
    private String creation_date;
    private int language;
    private JSONArray aliases;
    private JSONArray notes;
    private JSONArray author_history;

    public Ejercicio() {
    }

    public Ejercicio(int id, String uuid, String name, int exercise_base, String description, String creation_date, int language, JSONArray aliases, JSONArray notes, JSONArray author_history) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.exercise_base = exercise_base;
        this.description = description;
        this.creation_date = creation_date;
        this.language = language;
        this.aliases = aliases;
        this.notes = notes;
        this.author_history = author_history;
    }

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getExercise_base() {
        return exercise_base;
    }

    public String getDescripcion() {
        return description;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public int getLanguage() {
        return language;
    }

    public JSONArray getAliases() {
        return aliases;
    }

    public JSONArray getNotes() {
        return notes;
    }

    public JSONArray getAuthor_history() {
        return author_history;
    }

}
