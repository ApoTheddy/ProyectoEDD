package Modelo.Empleado;

import Modelo.Empleado.Empleado;
import lombok.Getter;

public class ListaDobleEmpleado {

    private Nodo inicio;
    private Nodo fin;

    @Getter
    private int tamanio;

    public ListaDobleEmpleado() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregarInicio(Empleado dato) {

        if (!estaVacia()) {
            inicio.anterior = new Nodo(dato, null, inicio);
            inicio = inicio.anterior;
        } else {
            inicio = fin = new Nodo(dato);
        }
        ++tamanio;
    }

    public void agregarFin(Empleado dato) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(dato, fin, null);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
        ++tamanio;
    }

    public String eliminarInicio() {
        String nombreEmpleadoEliminado = "";

        if (!estaVacia()) {
            nombreEmpleadoEliminado = inicio.dato.getNombres() + " " + inicio.dato.getApellidos();
            inicio = inicio.siguiente;
            --tamanio;
        }

        return nombreEmpleadoEliminado;
    }

    public String eliminarFin() {
        String nombreEmpleadoEliminado = "";

        if (!estaVacia()) {
            nombreEmpleadoEliminado = fin.dato.getNombres() + " " + fin.dato.getApellidos();
            fin = fin.anterior;
            fin.siguiente = null;
            --tamanio;
        }

        return nombreEmpleadoEliminado;
    }

    public String eliminar(String dni) {
        String nombreEmpleadoEliminado = "";

        if (!estaVacia()) {
            Nodo aux = inicio;

            while (aux != null) {
                if (aux.dato.getDNI().equals(dni)) {
                    nombreEmpleadoEliminado = aux.dato.getNombres() + " " + aux.dato.getApellidos();
                }
                aux = aux.siguiente;
            }
        }
        return nombreEmpleadoEliminado;
    }

    public String eliminar(int indice) {
        String nombreEmpleadoEliminado = "";

        if (!estaVacia()) {
            if (indice == 0) {
                nombreEmpleadoEliminado = eliminarInicio();
            } else if (indice == tamanio) {
                nombreEmpleadoEliminado = eliminarFin();
            } else {
                Nodo aux = inicio;
                Nodo temp = inicio.siguiente;
                int iterador = 1;

                while (temp != null) {
                    if (iterador == indice) {
                        break;
                    }
                    ++iterador;
                    temp = temp.siguiente;
                    aux = aux.siguiente;
                }

                if (temp != null) {
                    nombreEmpleadoEliminado = temp.dato.getNombres() + " " + temp.dato.getApellidos();
                    aux.siguiente = temp.siguiente;
                    temp.anterior = aux.siguiente;
                    --tamanio;
                }
            }
        }

        return nombreEmpleadoEliminado;
    }

    public void editar(Empleado empleado) {
        if (!estaVacia()) {
            Nodo aux = inicio;

            while (aux != null) {
                if (aux.dato.getDNI().equals(empleado.getDNI())) {
                    aux.dato = empleado;
                    break;
                }
                aux = aux.siguiente;
            }

        }
    }

    public Empleado buscar(String dni) {
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

    public Empleado getEmpleado(int indice) {
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
