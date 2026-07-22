package principal;

import tadLista.Lista;
import tadLista.TadLista;

public class ListaComparable<T> extends TadLista<T> implements Comparable<ListaComparable<T>> {

    public ListaComparable(String nombre) {
        super(nombre);
    }

    @Override
    public int compareTo(ListaComparable<T> elem) {
        return this.getNombre().compareTo(elem.getNombre());
    }

    @Override
    public String toString() {
        return "\n" + verLista();
    }

    private String verLista() {
        Lista<T> aux = new TadLista<T>();
        aux.asignarReferencia(this.devolverReferencia());
        return "Lista [" + this.getNombre() + "]: " + verListaR(aux);
    }

    private String verListaR(Lista<T> aux) {
        StringBuilder sb = new StringBuilder();
        if (!aux.esNulo()) {
            T elem = aux.devolverClave();
            aux.asignarReferencia(aux.devolverSiguiente());
            sb.append(elem.toString());
            sb.append(verListaR(aux));
        }

        return sb.toString();
    }

}
