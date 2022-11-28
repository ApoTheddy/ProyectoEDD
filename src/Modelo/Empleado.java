package Modelo;

public class Empleado extends Persona implements IEmpleado {

    private String rol;
    private int numeroInscritos;
    private double sueldoBase;

    public Empleado() {
    }

    public Empleado(String nombres, String apellidos, byte edad, String DNI,String rol, int numeroInscritos, double sueldoBase) {
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
