package algoritmosCRUD;

import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import principal.ListaComparable;
import principal.Persona;

public class OperacionCrud {
    public static <T extends Comparable<T>> boolean insertar(ArbolAVL<T> arbol, String nombreLista, Persona persona) {
        boolean resul = false;
        resul = insertaR(arbol.getRaiz(), nombreLista, persona);
        return resul;
    }

    private static <T extends Comparable<T>> boolean insertaR(NodoArbol<T> nodo, String nombreLista, Persona persona) {
        int comparacion;
        boolean resultado = false;

        // si el nodo del arbol no es nulo.
        if (nodo != null) {
            ListaComparable clave = (ListaComparable) nodo.getClave();
            comparacion = persona.getCedula().compareTo(clave.getNombre());

            // si comparacion es igual a 0, significa que la persona ya existe en el arbol
            if (comparacion == 0) {
                clave.crearNodo();
                clave.asignarClave(persona);
                resultado = true;

                // si la comparacion es menor a 0, significa que la persona es menor que la
                // clave del nodo actual.
            } else if (comparacion < 0) {
                resultado = insertaR(nodo.getIz(), nombreLista, persona);
                // si la comparacion es mayor a 0, significa que la persona es menor que la
                // clave del nodo actual.
            } else {
                resultado = insertaR(nodo.getDe(), nombreLista, persona);
            }
        }
        return resultado;
    }

}
