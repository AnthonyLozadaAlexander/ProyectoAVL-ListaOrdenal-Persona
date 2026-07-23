package algoritmosCRUD;

import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import principal.ListaComparable;
import tadLista.Lista;

public class OperacionCrud {
    public static <T extends Comparable<T>> boolean insertar(ArbolAVL<ListaComparable<T>> arbol, String nombreLista,
            T elem) {
        boolean resul = false;
        if (arbol != null && nombreLista != null && elem != null) {
            resul = insertaR(arbol.getRaiz(), nombreLista, elem);
        }
        return resul;
    }

    private static <T extends Comparable<T>> boolean insertaR(NodoArbol<ListaComparable<T>> nodo, String nombreLista,
            T elem) {
        int comparacion;
        boolean resultado = false;

        // si el nodo del arbol no es nulo.
        if (nodo != null) {
            ListaComparable<T> listaActual = (ListaComparable<T>) nodo.getClave();
            comparacion = nombreLista.compareTo(listaActual.getNombre());

            // si comparacion es igual a 0, significa que la persona ya existe en el arbol
            if (comparacion == 0) {
                listaActual.crearNodo();
                listaActual.asignarClave(elem);
                resultado = true;

                // si la comparacion es menor a 0, significa que la persona es menor que la
                // clave del nodo actual.
            } else if (comparacion < 0) {
                resultado = insertaR(nodo.getIz(), nombreLista, elem);
                // si la comparacion es mayor a 0, significa que la persona es menor que la
                // clave del nodo actual.
            } else {
                resultado = insertaR(nodo.getDe(), nombreLista, elem);
            }
        }
        return resultado;
    }

    public static <T extends Comparable<T>> boolean buscar(ArbolAVL<ListaComparable<T>> arbol, T elem) {
        boolean resul = false;
        if (arbol != null && elem != null) {
            resul = buscaR(arbol.getRaiz(), elem);
        }

        return resul;
    }

    private static <T extends Comparable<T>> boolean buscaR(NodoArbol<ListaComparable<T>> nodo, T elem) {
        boolean resul = false;

        if (nodo != null) {
            ListaComparable<T> aux = new ListaComparable<>("aux");
            aux.asignarReferencia(nodo.getClave().devolverReferencia());

            resul = buscarEnListaR(aux, elem);
        }

        if (!resul) {
            resul = buscaR(nodo.getIz(), elem);
        }

        if (!resul) {
            resul = buscaR(nodo.getDe(), elem);
        }

        return resul;
    }

    private static <T extends Comparable<T>> boolean buscarEnListaR(Lista<T> aux, T elem) {
        boolean resul = false;

        if (!aux.esNulo()) {
            if (aux.devolverClave().compareTo(elem) == 0) {
                resul = true;
            } else {
                aux.asignarReferencia(aux.devolverSiguiente());
                resul = buscarEnListaR(aux, elem);
            }
        }

        return resul;
    }

}
