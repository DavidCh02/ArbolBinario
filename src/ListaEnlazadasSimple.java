import javax.swing.*;
import java.util.List;

class ListaEnlazadaSimple<T> extends ListaAbstracta<T> {
    private Nodo<T> cabeza;

    @Override
    public void agregar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    @Override
    public void eliminar(T valor) {
        if (cabeza == null) return;
        if (cabeza.valor.equals(valor)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.valor.equals(valor)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void recorrer(JTextArea outputArea) {
        Nodo<T> actual = cabeza;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append(actual.valor).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        outputArea.append(sb.toString() + "\n"); // Agregar el recorrido al outputArea
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
