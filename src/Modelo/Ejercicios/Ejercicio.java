package Modelo.Ejercicios;

import java.util.ArrayList;
import lombok.Getter;
import org.json.JSONArray;
import utils.Functions;

public class Ejercicio extends Functions {

    @Getter
    private int id;

    @Getter
    private String uuid;

    @Getter
    private String name;

    @Getter
    private int exercise_base;

    @Getter
    private String description;

    @Getter
    private String creation_date;

    @Getter
    private int language;

    @Getter
    private JSONArray aliases;

    @Getter
    private JSONArray notes;

    @Getter
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

}
