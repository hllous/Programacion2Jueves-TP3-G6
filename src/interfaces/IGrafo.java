package interfaces;
import java.util.Map;
import java.util.List;

public interface IGrafo<T> {
    void agregarNodo(T valor);
    void agregarArista(T origen, T destino, int peso);
    Map<T, INodo<T>> getNodos();
    void recorridoDFS(T inicio);
    void recorridoBFS(T inicio);
    void matrizDeAdyacencia();
}
