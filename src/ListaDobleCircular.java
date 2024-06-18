class ListaDoblementeCircular<T> extends ListaDobleEnlazada<T> {
    @Override
    public void agregar(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        NodoDoble<T> cola = null;
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
        NodoDoble<T> cola = null;
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
            ((NodoDoble<T>) actual.siguiente).anterior = actual.anterior;
        } else if (actual.valor.equals(valor)) {
            cola = cola.anterior;
            cola.siguiente = cabeza;
            cabeza.anterior = cola;
        }
    }

    @Override
    public void recorrer() {
        if (cabeza == null) return;
        NodoDoble<T> actual = (NodoDoble<T>) cabeza;
        do {
            System.out.print(actual.valor + " <-> ");
            actual = (NodoDoble<T>) actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(vuelta a cabeza)");
    }
}
