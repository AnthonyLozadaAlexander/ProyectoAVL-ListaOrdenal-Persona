package principal;

import algoritmos.AlgoritmosListas;
import algoritmosCRUD.OperacionCrud;
import arbolBinario.Arbol;
import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import tadLista.*;

public class Principal {
    public static void main(String[] args) {
        ArbolAVL<ListaPersona> arbol = new ArbolAVL<>("Arbol De Listas Personas");
        arbol.insertar(new ListaPersona("001"));
        arbol.insertar(new ListaPersona("005"));
        arbol.insertar(new ListaPersona("003"));

        Persona ana = new Persona("001", "Ana");
        Persona kevo = new Persona("005", "Kevo");

        OperacionCrud.insertar(arbol, ana);
        OperacionCrud.insertar(arbol, kevo);

        arbol.info();

    }

}
