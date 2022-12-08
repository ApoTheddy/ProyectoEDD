package Modelo.Ejercicios;

import lombok.Getter;

public class Equipamento {

    @Getter
    private int id;

    @Getter
    private String name;

    public Equipamento() {
    }

    public Equipamento(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
