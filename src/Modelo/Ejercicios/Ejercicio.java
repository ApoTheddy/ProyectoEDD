package Modelo.Ejercicios;

import java.util.ArrayList;
import org.json.JSONArray;
import utils.Functions;

public class Ejercicio extends Functions {

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

    public ArrayList<Nota> getNotes() {
        ArrayList<Nota> notas = new ArrayList<>();

        for (int i = 0; i < notes.length(); ++i) {
            int id = toJson(i, notes).getInt("id");
            int exercise = toJson(i, notes).getInt("exercise");
            String comment = toJson(i, notes).getString("comment");
            notas.add(new Nota(id, exercise, comment));
        }
        return notas;
    }

    public JSONArray getAuthor_history() {
        return author_history;
    }

}
