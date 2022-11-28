package Estructuras.ListaDoble;

import Modelo.Cliente;
import javax.swing.JOptionPane;

public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    private int tamanio;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregarInicio(Cliente dato) {

        if (!estaVacia()) {
            inicio.anterior = new Nodo(dato, null, inicio);
            inicio = inicio.anterior;
        } else {
            inicio = fin = new Nodo(dato);
        }
        ++tamanio;
    }

    public void agregarFin(Cliente dato) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(dato, fin, null);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
        ++tamanio;
    }

    public String eliminarInicio() {
        String nombreClienteEliminado = "";

        if (!estaVacia()) {
            nombreClienteEliminado = inicio.dato.getNombres() + " " + inicio.dato.getApellidos();
            inicio = inicio.siguiente;
            --tamanio;
        }

        return nombreClienteEliminado;
    }

    public String eliminarFin() {
        String nombreClienteEliminado = "";

        if (!estaVacia()) {
            nombreClienteEliminado = fin.dato.getNombres() + " " + fin.dato.getApellidos();
            fin = fin.anterior;
            fin.siguiente = null;
            --tamanio;
        }

        return nombreClienteEliminado;
    }

    public String eliminar(String dni) {
        String nombreClienteEliminado = "";

        if (!estaVacia()) {
            Nodo aux = inicio;

            while (aux != null) {
                if (aux.dato.getDNI().equals(dni)) {
                    nombreClienteEliminado = aux.dato.getNombres() + " " + aux.dato.getApellidos();
                }
                aux = aux.siguiente;
            }
        }
        return nombreClienteEliminado;
    }

    public String eliminar(int indice) {
        String nombreClienteEliminado = "";

        if (!estaVacia()) {
            if (indice == 0) {
                nombreClienteEliminado = eliminarInicio();
            } else if (indice == tamanio) {
                nombreClienteEliminado = eliminarFin();
            } else {
                Nodo aux = inicio;
                Nodo temp = inicio.siguiente;
                int iterador = 1;

                while (temp != null) {
                    if(iterador == indice) break;
                    ++iterador;
                    temp = temp.siguiente;
                    aux = aux.siguiente;
                }

                if (temp != null) {
                    nombreClienteEliminado = temp.dato.getNombres() + " " + temp.dato.getApellidos();
                    aux.siguiente = temp.siguiente;
                    temp.anterior = aux.siguiente;
                    --tamanio;
                }
            }
        }

        return nombreClienteEliminado;
    }

    public Cliente buscar(String dni) {
        if (!estaVacia()) {
            Nodo aux = inicio;

            while (aux != null) {
                if (aux.dato.getDNI().equals(dni)) {
                    return aux.dato;
                }
                aux = aux.siguiente;
            }
        }
        return null;
    }

    public Cliente getCliente(int indice) {
        if (!estaVacia()) {
            Nodo aux = inicio;
            int iterador = 0;

            while (aux != null) {
                if (iterador == indice) {
                    return aux.dato;
                }
                aux = aux.siguiente;
                ++iterador;
            }
        }

        return null;
    }

    public int obtenerTamanio() {
        return tamanio;
    }

}
