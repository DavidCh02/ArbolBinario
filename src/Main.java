import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazadaSimple<Integer> listaEnlazada = new ListaEnlazadaSimple<>();
        ListaDoblementeEnlazada<Integer> listaDoblementeEnlazada = new ListaDoblementeEnlazada<>();
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        ListaDoblementeCircular<Integer> listaDoblementeCircular = new ListaDoblementeCircular<>();
        ArbolAVL<Integer> arbolAVL = new ArbolAVL<>();
        ArbolRojoNegro<Integer> arbolRojoNegro = new ArbolRojoNegro<>();
        Grafo<Integer> grafo = new Grafo<>();

        while (true) {
            System.out.println("=== Menú de Estructuras de Datos ===");
            System.out.println("1. Lista Enlazada Simple");
            System.out.println("2. Lista Doblemente Enlazada");
            System.out.println("3. Lista Circular");
            System.out.println("4. Lista Doblemente Circular");
            System.out.println("5. Árbol AVL");
            System.out.println("6. Árbol Rojo-Negro");
            System.out.println("7. Grafo");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    menuListaEnlazada(listaEnlazada, scanner);
                    break;
                case 2:
                    menuListaDoblementeEnlazada(listaDoblementeEnlazada, scanner);
                    break;
                case 3:
                    menuListaCircular(listaCircular, scanner);
                    break;
                case 4:
                    menuListaDoblementeCircular(listaDoblementeCircular, scanner);
                    break;
                case 5:
                    menuArbolAVL(arbolAVL, scanner);
                    break;
                case 6:
                    menuArbolRojoNegro(arbolRojoNegro, scanner);
                    break;
                case 7:
                    menuGrafo(grafo, scanner);
                    break;
                case 8:
                    System.out.println("¡Adiós!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuListaEnlazada(ListaEnlazadaSimple<Integer> lista, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Lista Enlazada Simple ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.print("Lista Enlazada Simple: ");
                    lista.recorrer();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuListaDoblementeEnlazada(ListaDoblementeEnlazada<Integer> lista, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Lista Doblemente Enlazada ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.print("Lista Doblemente Enlazada: ");
                    lista.recorrer();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuListaCircular(ListaCircular<Integer> lista, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Lista Circular ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.print("Lista Circular: ");
                    lista.recorrer();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuListaDoblementeCircular(ListaDoblementeCircular<Integer> lista, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Lista Doblemente Circular ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.print("Lista Doblemente Circular: ");
                    lista.recorrer();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuArbolAVL(ArbolAVL<Integer> arbol, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Árbol AVL ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar recorridos");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    arbol.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    arbol.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.println("Recorrido en Inorden:");
                    arbol.recorridoEnOrden();
                    System.out.println("Recorrido en Preorden:");
                    arbol.recorridoPreOrden();
                    System.out.println("Recorrido en Postorden:");
                    arbol.recorridoPostOrden();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuArbolRojoNegro(ArbolRojoNegro<Integer> arbol, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Árbol Rojo-Negro ===");
            System.out.println("1. Agregar elemento (se agrega elemento por elemento a la vez)");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar recorridos");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int valorAgregar = scanner.nextInt();
                    arbol.agregar(valorAgregar);
                    System.out.println("Elemento " + valorAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    arbol.eliminar(valorEliminar);
                    System.out.println("Elemento " + valorEliminar + " eliminado correctamente.");
                    break;
                case 3:
                    System.out.println("Recorrido en Inorden:");
                    arbol.recorridoEnOrden();
                    System.out.println("Recorrido en Preorden:");
                    arbol.recorridoPreOrden();
                    System.out.println("Recorrido en Postorden:");
                    arbol.recorridoPostOrden();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }

    private static void menuGrafo(Grafo<Integer> grafo, Scanner scanner) {
        while (true) {
            System.out.println("=== Menú Grafo ===");
            System.out.println("1. Agregar nodo (se agrega nodo por nodo a la vez)");
            System.out.println("2. Agregar arista");
            System.out.println("3. Mostrar grafo");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número del nodo a agregar: ");
                    int nodoAgregar = scanner.nextInt();
                    grafo.agregar(nodoAgregar);
                    System.out.println("Nodo " + nodoAgregar + " agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el número del nodo origen: ");
                    int origen = scanner.nextInt();
                    System.out.print("Ingrese el número del nodo destino: ");
                    int destino = scanner.nextInt();
                    grafo.agregarArista(origen, destino);
                    System.out.println("Arista agregada correctamente de " + origen + " a " + destino + ".");
                    break;
                case 3:
                    System.out.println("Representación del Grafo:");
                    grafo.recorrer();
                    break;
                case 4:
                    return;  // Regresar al menú principal
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();  // Separación visual entre ejecuciones del menú
        }
    }
}
