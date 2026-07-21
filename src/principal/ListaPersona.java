package principal;

import tadLista.TadLista;

public class ListaPersona extends TadLista<Persona> implements Comparable<ListaPersona> {

    private String cedula; // referencia

    public String getCedula() {
        return cedula;
    }

    public ListaPersona(String cedula) {
        super(cedula);
        this.cedula = cedula;
    }

    @Override
    public int compareTo(ListaPersona p) {
        return this.getCedula().compareTo(p.getCedula());
    }

    @Override
    public String toString() {
        return "Lista De Personas: " + this.getCedula() + "\n" + super.toString();
    }

}
