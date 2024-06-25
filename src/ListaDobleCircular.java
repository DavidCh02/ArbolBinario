import javax.swing.*;

class ListaDoblementeCircular<T> extends ListaDoblementeEnlazada<T> {
    @Override
    public void agregar(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    @Override
    public void eliminar(T valor) {
        if (cabeza == null) return;
        if (cabeza.valor.equals(valor) && cabeza.siguiente == cabeza) {
            cabeza = null;
            cola = null;
            return;
        }
        if (cabeza.valor.equals(valor)) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = cola;
            cola.siguiente = cabeza;
            return;
        }
        NodoDoble<T> actual = (NodoDoble<T>) cabeza;
        while (actual != cola && !actual.valor.equals(valor)) {
            actual = (NodoDoble<T>) actual.siguiente;
        }
        if (actual != cola) {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        } else if (actual.valor.equals(valor)) {
            cola = cola.anterior;
            cola.siguiente = cabeza;
            cabeza.anterior = cola;
        }
    }

    @Override
    public void recorrer(JTextArea outputArea) {
        if (cabeza == null) return;
        NodoDoble<T> actual = (NodoDoble<T>) cabeza;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(actual.valor).append(" <-> ");
            actual = (NodoDoble<T>) actual.siguiente;
        } while (actual != cabeza);
        sb.append("(vuelta a cabeza)");
        outputArea.append(sb.toString() + "\n");
    }
}
