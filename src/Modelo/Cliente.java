package Modelo;


public class Cliente extends Persona implements ICliente {

    private double peso;
    private double altura;
    private String fechaInscripcion;
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

    // Getters
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    // Setters
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
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
