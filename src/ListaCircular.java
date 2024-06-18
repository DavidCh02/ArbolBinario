class ListaCircular<T> extends ListaAbstracta<T> {
    @Override
    public void agregar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }

    @Override
    public void eliminar(T valor) {
        if (cabeza == null) return;
        if (cabeza.valor.equals(valor) && cabeza.siguiente == cabeza) {
            cabeza = null;
            return;
        }
        if (cabeza.valor.equals(valor)) {
            Nodo<T> cola = cabeza;
            while (cola.siguiente != cabeza) {
                cola = cola.siguiente;
            }
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != cabeza && !actual.siguiente.valor.equals(valor)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != cabeza) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    @Override
    public void recorrer() {
        if (cabeza == null) return;
        Nodo<T> actual = cabeza;
        do {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(vuelta a cabeza)");
    }
}
