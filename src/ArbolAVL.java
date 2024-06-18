class ArbolAVL<T extends Comparable<T>> extends ArbolAbstracto<T> {
    private NodoArbol<T> agregar(NodoArbol<T> nodo, T valor) {
        if (nodo == null) return new NodoArbol<>(valor);
        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = agregar(nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = agregar(nodo.derecho, valor);
        } else {
            return nodo;
        }
        return balancear(nodo);
    }

    private NodoArbol<T> balancear(NodoArbol<T> nodo) {
        int balance = altura(nodo.izquierdo) - altura(nodo.derecho);
        if (balance > 1) {
            if (altura(nodo.izquierdo.izquierdo) >= altura(nodo.izquierdo.derecho)) {
                nodo = rotarDerecha(nodo);
            } else {
                nodo.izquierdo = rotarIzquierda(nodo.izquierdo);
                nodo = rotarDerecha(nodo);
            }
        } else if (balance < -1) {
            if (altura(nodo.derecho.derecho) >= altura(nodo.derecho.izquierdo)) {
                nodo = rotarIzquierda(nodo);
            } else {
                nodo.derecho = rotarDerecha(nodo.derecho);
                nodo = rotarIzquierda(nodo);
            }
        }
        return nodo;
    }

    private int altura(NodoArbol<T> nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    private NodoArbol<T> rotarDerecha(NodoArbol<T> nodo) {
        NodoArbol<T> nuevaRaiz = nodo.izquierdo;
        nodo.izquierdo = nuevaRaiz.derecho;
        nuevaRaiz.derecho = nodo;
        return nuevaRaiz;
    }

    private NodoArbol<T> rotarIzquierda(NodoArbol<T> nodo) {
        NodoArbol<T> nuevaRaiz = nodo.derecho;
        nodo.derecho = nuevaRaiz.izquierdo;
        nuevaRaiz.izquierdo = nodo;
        return nuevaRaiz;
    }

    @Override
    public void agregar(T valor) {
        raiz = agregar(raiz, valor);
    }

    @Override
    public void eliminar(T valor) {
        raiz = eliminar(raiz, valor);
    }

    @Override
    public void recorrer() {

    }

    private NodoArbol<T> eliminar(NodoArbol<T> nodo, T valor) {
        if (nodo == null) return null;
        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = eliminar(nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = eliminar(nodo.derecho, valor);
        } else {
            if (nodo.izquierdo == null || nodo.derecho == null) {
                nodo = (nodo.izquierdo == null) ? nodo.derecho : nodo.izquierdo;
            } else {
                NodoArbol<T> hijoMasIzquierdo = hijoMasIzquierdo(nodo.derecho);
                nodo.valor = hijoMasIzquierdo.valor;
                nodo.derecho = eliminar(nodo.derecho, hijoMasIzquierdo.valor);
            }
        }
        if (nodo != null) {
            nodo = balancear(nodo);
        }
        return nodo;
    }

    private NodoArbol<T> hijoMasIzquierdo(NodoArbol<T> nodo) {
        NodoArbol<T> actual = nodo;
        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }
        return actual;
    }
}