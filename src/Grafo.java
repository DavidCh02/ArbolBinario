import javax.swing.*;
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
    public void recorrer(JTextArea outputArea) {
        for (T clave : listaAdyacencia.keySet()) {
            outputArea.append(clave + ": ");
            for (T valor : listaAdyacencia.get(clave)) {
                outputArea.append(valor + " ");
            }
            outputArea.append("\n");
        }
    }

    @Override
    public List<Integer> recorridoEnOrden() {
        return List.of();
    }

    @Override
    public List<Integer> recorridoPreOrden() {
        return List.of();
    }

    @Override
    public List<Integer> recorridoPostOrden() {
        return List.of();
    }
}
