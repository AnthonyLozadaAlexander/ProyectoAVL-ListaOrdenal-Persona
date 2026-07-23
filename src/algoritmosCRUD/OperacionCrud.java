package algoritmosCRUD;

import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import principal.ListaComparable;

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
            resul = buscarR(arbol.getRaiz(), elem);
        }

        return resul;
    }

    private static <T extends Comparable<T>> boolean buscarR(NodoArbol<ListaComparable<T>> nodo, T elem) {
        boolean resul = false;
    }

}
