package Modelo.Empleado;

import Modelo.Cliente.Cliente;

public class Nodo {

    Empleado dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Empleado dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(Empleado dato) {
        this(dato, null, null);
    }
}
