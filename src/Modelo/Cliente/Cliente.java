package Modelo.Cliente;

import Modelo.Persona;
import lombok.*;

public class Cliente extends Persona implements ICliente {

    @Getter
    private double peso;

    @Getter
    private double altura;

    @Getter
    private String fechaInscripcion;

    @Getter
    private String fechaFinalizacion;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, int edad, String DNI, double peso, double altura, String fechaInscripcion, String fechaFinalizacion) {
        super(nombres, apellidos, edad, DNI);
        this.peso = peso;
        this.altura = altura;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public double calcularIMC() {
        return peso / Math.pow(altura, 2);
    }
}

interface ICliente {

    double calcularIMC();
}
