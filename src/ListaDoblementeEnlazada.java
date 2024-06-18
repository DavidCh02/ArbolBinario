class ListaDoblementeEnlazada<T> extends ListaAbstracta<T> {
    private NodoDoble<T> cola;

    protected static class NodoDoble<T> extends Nodo<T> {
        NodoDoble<T> anterior;
        NodoDoble(T valor) {
            super(valor);
        }
    }

    @Override
    public void agregar(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    @Override
    public void eliminar(T valor) {
        if (cabeza == null) return;
        if (cabeza.valor.equals(valor)) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) cabeza.anterior = null;
            else cola = null;
            return;
        }
        NodoDoble<T> actual = (NodoDoble<T>) cabeza;
        while (actual != null && !actual.valor.equals(valor)) {
            actual = (NodoDoble<T>) actual.siguiente;
        }
        if (actual != null) {
            if (actual.siguiente != null) ((NodoDoble<T>) actual.siguiente).anterior = actual.anterior;
            if (actual.anterior != null) actual.anterior.siguiente = actual.siguiente;
            if (actual == cola) cola = actual.anterior;
        }
    }

    @Override
    public void recorrer() {
        NodoDoble<T> actual = (NodoDoble<T>) cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " <-> ");
            actual = (NodoDoble<T>) actual.siguiente;
        }
        System.out.println("null");
    }
}