package principal;

import algoritmos.AlgoritmosListas;
import algoritmosCRUD.OperacionCrud;
import arbolBinario.Arbol;
import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import tadLista.*;

public class Principal {
    public static void main(String[] args) {

        ArbolAVL<ListaComparable<Persona>> arbol = new ArbolAVL<>("Arbol De Listas Personas");
        arbol.insertar(new ListaComparable("A"));
        arbol.insertar(new ListaComparable("B"));
        arbol.insertar(new ListaComparable("C"));

        Persona ana = new Persona("001", "Ana");
        Persona kevo = new Persona("005", "Kevo");
        Persona mario = new Persona("0004", "Mario");
        OperacionCrud.insertar(arbol, "A", ana);
        OperacionCrud.insertar(arbol, "B", kevo);

        arbol.info();

        System.out.println("\nBuscar Mario: " + (OperacionCrud.buscar(arbol, mario) ? "Encontrado" : "No encontrado"));

    }

}
