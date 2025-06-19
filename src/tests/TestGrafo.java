package tests;

import models.Grafo;
import models.Persona;

public class TestGrafo {
    public static void main(String[] args) {
        Grafo<Persona> grafo = new Grafo<>();

        /// Creo 8 personas
        Persona[] personas = new Persona[8];
        personas[0] = new Persona(1, "Ana");
        personas[1] = new Persona(2, "Beto");
        personas[2] = new Persona(3, "Carla");
        personas[3] = new Persona(4, "Diego");
        personas[4] = new Persona(5, "Elena");
        personas[5] = new Persona(6, "Facundo");
        personas[6] = new Persona(7, "Gisela");
        personas[7] = new Persona(8, "Hugo");


        // Agregar nodos al grafo
        for (Persona p : personas) {
            grafo.agregarNodo(p);
        }

        // Agrego aristas

        /// Conexiones Nodo 1
        grafo.agregarArista(personas[0], personas[0], 0);
        grafo.agregarArista(personas[0], personas[1], 2);
        grafo.agregarArista(personas[0], personas[3], 1);
        /// Conexiones Nodo 2
        grafo.agregarArista(personas[1], personas[6], 5);
        grafo.agregarArista(personas[1], personas[2], 2);
        /// Conexiones Nodo 3
        grafo.agregarArista(personas[2], personas[4], 3);
        grafo.agregarArista(personas[2], personas[5], 4);
        /// Conexiones Nodo 4
        grafo.agregarArista(personas[3], personas[4], 7);
        grafo.agregarArista(personas[3], personas[6], 2);
        /// Conexiones Nodo 5
        grafo.agregarArista(personas[4], personas[6], 1);
        /// Conexiones Nodo 6
        grafo.agregarArista(personas[5], personas[7], 1);
        /// Conexiones Nodo 7
        grafo.agregarArista(personas[6], personas[7], 6);
        /// Conexiones Nodo 8


        /// Recorro el grafo con DFS y BFS desde Ana (persona 0)
        System.out.println("----- Recorrido DFS desde Ana -----");
        grafo.dfs(personas[0]);
        System.out.println("----- Recorrido BFS desde Ana -----");
        grafo.bfs(personas[0]);
        System.out.println("----- Matriz de Adyacencia -----");
        grafo.matrizDeAdyacencia();
    }
}