import java.util.ArrayList;
import java.util.List;


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

    @Override
    public List<Integer> recorridoEnOrden() {
        List<Integer> elementos = new ArrayList<>();
        recorridoEnOrden(raiz, elementos);
        return elementos;
    }

    private void recorridoEnOrden(NodoArbol<T> nodo, List<Integer> elementos) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo, elementos);
            elementos.add((Integer) nodo.valor); // Aquí asumes que el valor es Integer
            recorridoEnOrden(nodo.derecho, elementos);
        }
    }

    @Override
    public List<Integer> recorridoPreOrden() {
        List<Integer> elementos = new ArrayList<>();
        recorridoPreOrden(raiz, elementos);
        return elementos;
    }

    private void recorridoPreOrden(NodoArbol<T> nodo, List<Integer> elementos) {
        if (nodo != null) {
            elementos.add((Integer) nodo.valor); // Aquí asumes que el valor es Integer
            recorridoPreOrden(nodo.izquierdo, elementos);
            recorridoPreOrden(nodo.derecho, elementos);
        }
    }

    @Override
    public List<Integer> recorridoPostOrden() {
        List<Integer> elementos = new ArrayList<>();
        recorridoPostOrden(raiz, elementos);
        return elementos;
    }

    private void recorridoPostOrden(NodoArbol<T> nodo, List<Integer> elementos) {
        if (nodo != null) {
            recorridoPostOrden(nodo.izquierdo, elementos);
            recorridoPostOrden(nodo.derecho, elementos);
            elementos.add((Integer) nodo.valor); // Aquí asumes que el valor es Integer
        }
    }
}