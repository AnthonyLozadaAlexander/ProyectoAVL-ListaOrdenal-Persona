package principal;

import arbolBinario.ArbolAVL;
import tadCola.*;
import tadLista.*;

class ListaOrdinalPersonas extends TadLista<Persona> implements Comparable<ListaOrdinalPersonas> {
    private String cedula;

    public ListaOrdinalPersonas(String cedula) {
        super(cedula);
        this.cedula = cedula;
    }

    public String getCedula() {
        return this.cedula;
    }

    @Override
    public int compareTo(ListaOrdinalPersonas p) {
        if (getCedula().compareTo(p.getCedula()) > 0) {
            return 1;
        } else if (getCedula().compareTo(p.getCedula()) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Cedula: " + this.getCedula() + "\n" + super.toString();
    }

}

public class Principal {
    public static void main(String[] args) {

    }

}
