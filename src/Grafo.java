import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo<T> implements EstructuraDatos<T> {
    private Map<T, List<T>> listaAdyacencia = new HashMap<>();

    @Override
    public void agregar(T valor) {
        listaAdyacencia.putIfAbsent(valor, new ArrayList<>());
    }

    public void agregarArista(T origen, T destino) {
        listaAdyacencia.get(origen).add(destino);
    }

    @Override
    public void eliminar(T valor) {
        listaAdyacencia.values().forEach(e -> e.remove(valor));
        listaAdyacencia.remove(valor);
    }

    @Override
    public void recorrer() {
        for (T clave : listaAdyacencia.keySet()) {
            System.out.print(clave + ": ");
            for (T valor : listaAdyacencia.get(clave)) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
