package principal;

import algoritmos.AlgoritmosListas;
import algoritmosCRUD.OperacionCrud;
import arbolBinario.Arbol;
import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import tadLista.*;

public class Principal {
    public static void main(String[] args) {
        // Crear un árbol AVL de listas comparables
        ArbolAVL<ListaComparable<Persona>> arbol = new ArbolAVL<>("Arbol De Listas Personas");
        arbol.insertar(new ListaComparable("A"));
        arbol.insertar(new ListaComparable("B"));
        arbol.insertar(new ListaComparable("C"));

        Persona ana = new Persona("001", "Ana");
        Persona kevo = new Persona("005", "Kevo");

        OperacionCrud.insertar(arbol, "A", ana);
        OperacionCrud.insertar(arbol, "B", kevo);

        arbol.info();

    }

}
