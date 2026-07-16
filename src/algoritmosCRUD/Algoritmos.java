package algoritmosCRUD;

import algoritmos.AlgoritmosListas;
import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import principal.ListaOrdenalPersonas;
import principal.Persona;
import tadLista.TadLista;

public class Algoritmos {

    private static void insertarOrdenal(TadLista<Persona> lista, Persona persona) {
        if (lista.esNulo() || lista.devolverClave().compareTo(persona) > 0) {
            AlgoritmosListas.insertarAlPrincipio(lista, persona);
        } else {
            TadLista<Persona> aux = new TadLista<>();
            aux.asignarReferencia(lista.devolverReferencia());
            insertarOrdenalR(aux, persona);
        }
    }

    private static void insertarOrdenalR(TadLista<Persona> aux, Persona persona) {
        TadLista<Persona> siguiente = new TadLista<>();
        siguiente.asignarReferencia(aux.devolverSiguiente());

        if (siguiente.esNulo() || siguiente.devolverClave().compareTo(persona) > 0) {
            TadLista<Persona> nuevo = new TadLista<>();
            nuevo.crearNodo();
            nuevo.asignarClave(persona);

            nuevo.asignarReferenciaSiguiente(siguiente.devolverReferencia());
            aux.asignarReferenciaSiguiente(nuevo.devolverReferencia());
        } else {
            aux.asignarReferencia(aux.devolverSiguiente());
            insertarOrdenalR(aux, persona);
        }
    }

    // Insertar una persona en el arbol AVL
    public static ArbolAVL<ListaOrdenalPersonas> insertar(ArbolAVL<ListaOrdenalPersonas> arbol, Persona persona) {
        ListaOrdenalPersonas llave = new ListaOrdenalPersonas(persona.getCedula());

        NodoArbol<ListaOrdenalPersonas> nodo = arbol.buscarNodo(llave);

        if (nodo == null) {
            ListaOrdenalPersonas lista = new ListaOrdenalPersonas(persona.getCedula());
            insertarOrdenal(lista, persona);
            arbol.insertar(lista);
        } else {
            insertarOrdenal(nodo.getClave(), persona);
        }

        return arbol;
    }

}
