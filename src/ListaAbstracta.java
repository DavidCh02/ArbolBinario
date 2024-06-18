abstract class ListaAbstracta<T> implements EstructuraDatos<T> {
    protected Nodo<T> cabeza;

    // Clase anidada para los nodos de la lista
    protected static class Nodo<T> {
        public Nodo<T> anterior;
        T valor;
        Nodo<T> siguiente;
        Nodo(T valor) {
            this.valor = valor;
        }
    }
}