package principal;

import algoritmos.AlgoritmosListas;
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
    }

}
