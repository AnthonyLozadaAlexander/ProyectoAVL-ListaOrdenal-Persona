package principal;

import tadLista.TadLista;

public class ListaOrdenalPersonas extends TadLista<Persona> implements Comparable<ListaOrdenalPersonas> {
    private String cedula; // identificador de cedula para el nodo avl

    public ListaOrdenalPersonas(String cedula) {
        super(cedula); // nombre del tadList (cedula) para el nodo
        this.cedula = cedula; // guardamos la cedula
    }

    public String getCedula() {
        return this.cedula;
    }

    // el avl toma como referencia la cedula del nodo para ordenar los nodos
    @Override
    public int compareTo(ListaOrdenalPersonas p) {
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
        return "Cedula: " + this.getCedula() + "\n";
    }
}
