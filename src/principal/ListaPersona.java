package principal;

import tadLista.Lista;
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
        return "\n" + verLista();
    }

    private String verLista() {
        Lista<Persona> aux = new TadLista<Persona>();
        aux.asignarReferencia(this.devolverReferencia());
        return "Lista [" + cedula + "]: " + verListaR(aux);
    }

    private String verListaR(Lista<Persona> aux) {
        StringBuilder sb = new StringBuilder();
        if (!aux.esNulo()) {
            Persona p = aux.devolverClave();
            aux.asignarReferencia(aux.devolverSiguiente());
            sb.append(p.toString());
            sb.append(verListaR(aux));
        }

        return sb.toString();
    }

}
