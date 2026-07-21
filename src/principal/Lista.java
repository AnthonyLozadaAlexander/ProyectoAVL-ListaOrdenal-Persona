package principal;

import tadLista.TadLista;

public class Lista<T> extends TadLista<T> implements Comparable<Lista<T>> {

    private String cedula; // referencia

    public String getCedula() {
        return cedula;
    }

    public Lista(String cedula) {
        super(cedula);
        this.cedula = cedula;
    }

    @Override
    public int compareTo(Lista<T> p) {
        return this.getCedula().compareTo(p.getCedula());
    }

    @Override
    public String toString() {
        return "Lista De Personas: " + this.getCedula() + "\n" + super.toString();
    }

}
