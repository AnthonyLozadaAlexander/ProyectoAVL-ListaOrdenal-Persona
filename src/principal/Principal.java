package principal;

import algoritmos.AlgoritmosListas;
import algoritmosCRUD.Algoritmos;
import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import tadLista.*;

public class Principal {
    public static void main(String[] args) {
        ArbolAVL<ListaOrdenalPersonas> arbolAVL = new ArbolAVL<>("Arbol AVL - Listas De Personas");
        Algoritmos.insertar(arbolAVL, new Persona("0034", "Juan"));
        listar(arbolAVL);
        arbolAVL.info();
    }

    public static void listar(ArbolAVL<ListaOrdenalPersonas> arbol) {
        System.out.println("Listado Del Arbol AVL");
        listarR(arbol.getRaiz());
    }

    private static void listarR(NodoArbol<ListaOrdenalPersonas> raiz) {
        if (raiz != null) {
            listarR(raiz.getIz());
            raiz.getClave().imprimirLista();
            listarR(raiz.getDe());
        }
    }

}
