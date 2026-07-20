package algoritmosCRUD;

import principal.Persona;
import tadLista.TadLista;

public class ListaPersonas extends TadLista<Persona> implements Comparable<ListaPersonas> {

    private String cedula; // referencia

    public String getCedula() {
        return cedula;
    }

    public ListaPersonas(String cedula) {
        super(cedula);
    }

    @Override
    public int compareTo(ListaPersonas p) {
        return this.getCedula().compareTo(p.getCedula());
    }

    @Override
    public String toString() {
        return "Lista De Personas: " + this.getCedula() + "\n" + super.toString();
    }

}
