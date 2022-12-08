package Modelo.Empleado;

import Modelo.Persona;
import lombok.Getter;

public class Empleado extends Persona implements IEmpleado {

    @Getter
    private String rol;

    @Getter
    private int numeroInscritos;
    
    @Getter
    private double sueldoBase;

    public Empleado() {
    }

    public Empleado(String nombres, String apellidos, int edad, String DNI,String rol, int numeroInscritos, double sueldoBase) {
        super(nombres, apellidos, edad, DNI);
        this.rol = rol;
        this.numeroInscritos = numeroInscritos;
        this.sueldoBase = sueldoBase;
    }

    // Calculos
    @Override
    public double calcularAdicional() {
        return numeroInscritos * 20;
    }

    @Override
    public double calcularSueldoNeto() {
        return sueldoBase + calcularAdicional();
    }

}

interface IEmpleado {

    double calcularAdicional();

    double calcularSueldoNeto();
}
