abstract class ArbolAbstracto<T extends Comparable<T>> implements EstructuraDatos<T> {
    protected NodoArbol<T> raiz;

    protected static class NodoArbol<T> {
        T valor;
        NodoArbol<T> izquierdo, derecho;
        NodoArbol(T valor) {
            this.valor = valor;
        }
    }

    @Override
    public abstract void agregar(T valor);
    @Override
    public abstract void eliminar(T valor);

    public void recorridoEnOrden() {
        enOrden(raiz);
        System.out.println();
    }

    private void enOrden(NodoArbol<T> nodo) {
        if (nodo == null) return;
        enOrden(nodo.izquierdo);
        System.out.print(nodo.valor + " ");
        enOrden(nodo.derecho);
    }

    public void recorridoPreOrden() {
        preOrden(raiz);
        System.out.println();
    }

    private void preOrden(NodoArbol<T> nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        preOrden(nodo.izquierdo);
        preOrden(nodo.derecho);
    }

    public void recorridoPostOrden() {
        postOrden(raiz);
        System.out.println();
    }

    private void postOrden(NodoArbol<T> nodo) {
        if (nodo == null) return;
        postOrden(nodo.izquierdo);
        postOrden(nodo.derecho);
        System.out.print(nodo.valor + " ");
    }
}
