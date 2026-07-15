package principal;

import arbolBinario.ArbolAVL;
import tadCola.*;
import tadLista.*;

class ListaOrdinalPersonas extends TadLista<Persona> implements Comparable<ListaOrdinalPersonas> {
    private String cedula; // identificador de cedula para el nodo avl

    public ListaOrdinalPersonas(String cedula) {
        super(cedula); // nombre del tadList (cedula) para el nodo
        this.cedula = cedula; // guardamos la cedula
    }

    public String getCedula() {
        return this.cedula;
    }

    // el avl toma como referencia la cedula del nodo para ordenar los nodos
    @Override
    public int compareTo(ListaOrdinalPersonas p) {
        if (getCedula().compareTo(p.getCedula()) > 0) {
            return 1;
        } else if (getCedula().compareTo(p.getCedula()) < 0) {
            return -1;
        }

        return 0;
    }

    // informacion basica del nodo
    @Override
    public String toString() {
        return "Cedula: " + this.getCedula() + "\n" + super.toString();
    }

}

public class Principal {
    public static void main(String[] args) {

    }

}
