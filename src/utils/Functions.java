package utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class Functions {

    static public JSONObject toJson(int indice, JSONArray type) {
        return (JSONObject) type.get(indice);
    }

}
