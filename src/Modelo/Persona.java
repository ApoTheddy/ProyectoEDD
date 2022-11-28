package Modelo;

public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private String DNI;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad, String DNI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
    }

    // Getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    // Setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}
