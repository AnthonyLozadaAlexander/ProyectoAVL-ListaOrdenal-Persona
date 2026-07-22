package principal;

import tadLista.Lista;
import tadLista.TadLista;

public class ListaComparable extends TadLista<Persona> implements Comparable<ListaComparable> {

    public ListaComparable(String nombre) {
        super(nombre);
    }

    @Override
    public int compareTo(ListaComparable p) {
        return this.getNombre().compareTo(p.getNombre());
    }

    @Override
    public String toString() {
        return "\n" + verLista();
    }

    private String verLista() {
        Lista<Persona> aux = new TadLista<Persona>();
        aux.asignarReferencia(this.devolverReferencia());
        return "Lista [" + this.getNombre() + "]: " + verListaR(aux);
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
