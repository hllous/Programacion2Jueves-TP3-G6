package tests;

import models.Nodo;
import interfaces.INodo;

public class TestNodo {
    public static void main(String[] args) {


        System.out.println("--- TestNodo ---");
        System.out.println();
        System.out.println("1) Creo nodos y agrego vecinos a dos nodos diferentes, luego imprimo");

        INodo<Integer> nodo1 = new Nodo<>(1);
        INodo<Integer> nodo2 = new Nodo<>(2);
        INodo<Integer> nodo3 = new Nodo<>(3);
        INodo<Integer> nodo4 = new Nodo<>(4);

        nodo1.agregarVecino(nodo2, 3);
        nodo1.agregarVecino(nodo3,7);

        System.out.println("Vecinos de nodo1: "+ nodo1.getVecinos());

        nodo2.agregarVecino(nodo4,7);
        nodo2.agregarVecino(nodo3,1);
        nodo2.agregarVecino(nodo2,0);

        System.out.println("Vecinos nodo2: "+ nodo2.getVecinos());
        System.out.println("Vecinos nodo3: "+ nodo3.getVecinos());
        System.out.println("Vecinos nodo4: "+ nodo4.getVecinos());

        System.out.println();
        System.out.println("2) Imprimo todos los pesos de todos los nodos");
        System.out.println("Peso nodo1: " + nodo1.getPesos());
        System.out.println("Peso nodo2: " + nodo2.getPesos());
        System.out.println("Peso nodo3: " + nodo3.getPesos());
        System.out.println("Peso nodo4: " + nodo4.getPesos());

        System.out.println();
        System.out.println("--- FinTestNodo ---");

    }
}
