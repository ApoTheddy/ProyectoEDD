package Modelo.Cliente;

import Modelo.Cliente.Cliente;

public class Nodo {

    Cliente dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Cliente dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(Cliente dato) {
        this(dato, null, null);
    }
}
