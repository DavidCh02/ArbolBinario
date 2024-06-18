import java.util.*;

// Definimos una interfaz genérica para las operaciones básicas
interface EstructuraDatos<T> {
    void agregar(T valor);
    void eliminar(T valor);
    void recorrer();
}