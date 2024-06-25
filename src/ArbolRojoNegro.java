import javax.swing.*;

class ArbolRojoNegro<T extends Comparable<T>> extends ArbolAbstracto<T> {
    private static final boolean ROJO = true;
    private static final boolean NEGRO = false;

    private class NodoRB extends NodoArbol<T> {
        boolean color;
        NodoRB(T valor) {
            super(valor);
            this.color = ROJO;
        }
    }

    @Override
    public void agregar(T valor) {
        raiz = agregar((NodoRB) raiz, valor);
        ((NodoRB) raiz).color = NEGRO;
    }

    private NodoRB agregar(NodoRB nodo, T valor) {
        if (nodo == null) return new NodoRB(valor);
        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = agregar((NodoRB) nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = agregar((NodoRB) nodo.derecho, valor);
        }
        if (esRojo((NodoRB) nodo.derecho) && !esRojo((NodoRB) nodo.izquierdo)) nodo = rotarIzquierda(nodo);
        if (esRojo((NodoRB) nodo.izquierdo) && esRojo((NodoRB) nodo.izquierdo.izquierdo)) nodo = rotarDerecha(nodo);
        if (esRojo((NodoRB) nodo.izquierdo) && esRojo((NodoRB) nodo.derecho)) cambiarColores(nodo);
        return nodo;
    }

    private boolean esRojo(NodoRB nodo) {
        if (nodo == null) return false;
        return nodo.color == ROJO;
    }

    private NodoRB rotarIzquierda(NodoRB nodo) {
        NodoRB nuevaRaiz = (NodoRB) nodo.derecho;
        nodo.derecho = nuevaRaiz.izquierdo;
        nuevaRaiz.izquierdo = nodo;
        nuevaRaiz.color = nodo.color;
        nodo.color = ROJO;
        return nuevaRaiz;
    }

    private NodoRB rotarDerecha(NodoRB nodo) {
        NodoRB nuevaRaiz = (NodoRB) nodo.izquierdo;
        nodo.izquierdo = nuevaRaiz.derecho;
        nuevaRaiz.derecho = nodo;
        nuevaRaiz.color = nodo.color;
        nodo.color = ROJO;
        return nuevaRaiz;
    }

    private void cambiarColores(NodoRB nodo) {
        nodo.color = ROJO;
        ((NodoRB) nodo.izquierdo).color = NEGRO;
        ((NodoRB) nodo.derecho).color = NEGRO;
    }

    @Override
    public void eliminar(T valor) {
        // Implementación de borrado en árbol Rojo-Negro es compleja y se omite por simplicidad
        throw new UnsupportedOperationException("Borrado no implementado para el árbol Rojo-Negro");
    }

    @Override
    public void recorrer(JTextArea outputArea) {

    }
}