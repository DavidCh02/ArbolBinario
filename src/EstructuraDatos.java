import javax.swing.*;
import java.util.*;

// Definimos una interfaz genérica para las operaciones básicas
public interface EstructuraDatos<T> {
    void agregar(T valor);
    void eliminar(T valor);
    void recorrer(JTextArea outputArea);

    List<Integer> recorridoEnOrden();

    List<Integer> recorridoPreOrden();

    List<Integer> recorridoPostOrden();
}