Respuesta 4:
Para que el grafo sea dirigido, debería modificarse el método agregar arista.
Este debería settear nodoDestino como vecino del origen, y viceversa, settear el nodoOrgien como vecino del Destino.
Si quisiéramos que vaya a una sola dirección, podríamos pasar un boolean de si es dirigido solo de ida, o si es ida y vuelta.
Estos se podrían recorrer como están.
