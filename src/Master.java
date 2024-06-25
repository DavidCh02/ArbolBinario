import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Master extends JFrame {

    private JComboBox<String> estructuraComboBox;
    private JTextField inputField;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton mostrarButton;
    private JTextArea outputArea;
    private JPanel panel1;

    // Declaración de estructuras de datos
    private ListaEnlazadaSimple<Integer> listaEnlazada;
    private ListaDoblementeEnlazada<Integer> listaDoblementeEnlazada;
    private ListaCircular<Integer> listaCircular;
    private ListaDoblementeCircular<Integer> listaDoblementeCircular;
    private ArbolAVL<Integer> arbolAVL;
    private ArbolRojoNegro<Integer> arbolRojoNegro;
    private Grafo<Integer> grafo;

    public Master() {

        super("Estructuras de Datos"); // Título de la ventana
        inicializarEstructuras();     // Inicialización de las estructuras de datos
        initComponents();             // Inicialización de componentes de la interfaz gráfica
        configurarVentana();          // Configuración de la ventana principal
    }

    private void inicializarEstructuras() {
        // Inicialización de las estructuras de datos
        listaEnlazada = new ListaEnlazadaSimple<>();
        listaDoblementeEnlazada = new ListaDoblementeEnlazada<>();
        listaCircular = new ListaCircular<>();
        listaDoblementeCircular = new ListaDoblementeCircular<>();
        arbolAVL = new ArbolAVL<>();
        arbolRojoNegro = new ArbolRojoNegro<>();
        grafo = new Grafo<>();
    }

    private void initComponents() {
        // Configuración de los componentes de la interfaz gráfica
        estructuraComboBox = new JComboBox<>(new String[]{
                "Lista Enlazada Simple", "Lista Doblemente Enlazada",
                "Lista Circular", "Lista Doblemente Circular",
                "Árbol AVL", "Árbol Rojo-Negro", "Grafo"
        });
        inputField = new JTextField(10);
        agregarButton = new JButton("Agregar");
        eliminarButton = new JButton("Eliminar");
        mostrarButton = new JButton("Mostrar");
        outputArea = new JTextArea(20, 20);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1, 10, 10)); // Distribución de botones en columnas
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen exterior
        panelBotones.setBackground(Color.decode("#E8E8E8")); // Color de fondo para botones

        // Estilización de botones
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        agregarButton.setFont(buttonFont);
        eliminarButton.setFont(buttonFont);
        mostrarButton.setFont(buttonFont);

        panelBotones.add(agregarButton);
        panelBotones.add(eliminarButton);
        panelBotones.add(mostrarButton);

        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new FlowLayout());
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen exterior
        panelEntrada.setBackground(Color.decode("#B3E5FC")); // Color de fondo para panel de entrada
        panelEntrada.add(new JLabel("Estructura:"));
        panelEntrada.add(estructuraComboBox);
        panelEntrada.add(new JLabel("Valor:"));
        panelEntrada.add(inputField);

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        panelCentral.add(panelEntrada, BorderLayout.NORTH);
        panelCentral.add(scrollPane, BorderLayout.CENTER);
        panelCentral.setBackground(Color.WHITE); // Color de fondo para el panel central

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelBotones, BorderLayout.EAST);
        getContentPane().add(panelCentral, BorderLayout.CENTER);

        // Configuración de acciones de botones
        agregarButton.addActionListener(e -> agregarElemento());
        eliminarButton.addActionListener(e -> eliminarElemento());
        mostrarButton.addActionListener(e -> mostrarEstructura());
    }

    private void configurarVentana() {
        setSize(800, 600);               // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamiento al cerrar la ventana
        setLocationRelativeTo(null);    // Centrar la ventana en la pantalla
        setVisible(true);               // Hacer visible la ventana
    }

    private void agregarElemento() {
        try {
            int valor = Integer.parseInt(inputField.getText());
            String estructuraSeleccionada = (String) estructuraComboBox.getSelectedItem();
            switch (estructuraSeleccionada) {
                case "Lista Enlazada Simple":
                    listaEnlazada.agregar(valor);
                    outputArea.append("Agregado a Lista Enlazada Simple: " + valor + "\n");
                    break;
                case "Lista Doblemente Enlazada":
                    listaDoblementeEnlazada.agregar(valor);
                    outputArea.append("Agregado a Lista Doblemente Enlazada: " + valor + "\n");
                    break;
                case "Lista Circular":
                    listaCircular.agregar(valor);
                    outputArea.append("Agregado a Lista Circular: " + valor + "\n");
                    break;
                case "Lista Doblemente Circular":
                    listaDoblementeCircular.agregar(valor);
                    outputArea.append("Agregado a Lista Doblemente Circular: " + valor + "\n");
                    break;
                case "Árbol AVL":
                    arbolAVL.agregar(valor);
                    outputArea.append("Agregado a Árbol AVL: " + valor + "\n");
                    break;
                case "Árbol Rojo-Negro":
                    arbolRojoNegro.agregar(valor);
                    outputArea.append("Agregado a Árbol Rojo-Negro: " + valor + "\n");
                    break;
                case "Grafo":
                    grafo.agregar(valor);
                    outputArea.append("Nodo agregado al Grafo: " + valor + "\n");
                    break;
                default:
                    outputArea.append("Estructura no reconocida.\n");
            }
        } catch (NumberFormatException ex) {
            outputArea.append("Entrada inválida. Por favor, ingrese un número.\n");
        }
    }

    private void eliminarElemento() {
        try {
            int valor = Integer.parseInt(inputField.getText());
            String estructuraSeleccionada = (String) estructuraComboBox.getSelectedItem();
            switch (estructuraSeleccionada) {
                case "Lista Enlazada Simple":
                    listaEnlazada.eliminar(valor);
                    outputArea.append("Eliminado de Lista Enlazada Simple: " + valor + "\n");
                    break;
                case "Lista Doblemente Enlazada":
                    listaDoblementeEnlazada.eliminar(valor);
                    outputArea.append("Eliminado de Lista Doblemente Enlazada: " + valor + "\n");
                    break;
                case "Lista Circular":
                    listaCircular.eliminar(valor);
                    outputArea.append("Eliminado de Lista Circular: " + valor + "\n");
                    break;
                case "Lista Doblemente Circular":
                    listaDoblementeCircular.eliminar(valor);
                    outputArea.append("Eliminado de Lista Doblemente Circular: " + valor + "\n");
                    break;
                case "Árbol AVL":
                    arbolAVL.eliminar(valor);
                    outputArea.append("Eliminado de Árbol AVL: " + valor + "\n");
                    break;
                case "Árbol Rojo-Negro":
                    arbolRojoNegro.eliminar(valor);
                    outputArea.append("Eliminado de Árbol Rojo-Negro: " + valor + "\n");
                    break;
                case "Grafo":
                    grafo.eliminar(valor);
                    outputArea.append("Nodo eliminado del Grafo: " + valor + "\n");
                    break;
                default:
                    outputArea.append("Estructura no reconocida.\n");
            }
        } catch (NumberFormatException ex) {
            outputArea.append("Entrada inválida. Por favor, ingrese un número.\n");
        }
    }

    private void mostrarEstructura() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String estructuraSeleccionada = (String) estructuraComboBox.getSelectedItem();
                outputArea.append("Contenido de " + estructuraSeleccionada + ":\n");
                switch (estructuraSeleccionada) {
                    case "Lista Enlazada Simple":
                        listaEnlazada.recorrer(outputArea);
                        break;
                    case "Lista Doblemente Enlazada":
                        listaDoblementeEnlazada.recorrer(outputArea);
                        break;
                    case "Lista Circular":
                        listaCircular.recorrer(outputArea);
                        break;
                    case "Lista Doblemente Circular":
                        listaDoblementeCircular.recorrer(outputArea);
                        break;
                    case "Árbol AVL":
                        outputArea.append("Recorrido en Inorden: ");
                        List<Integer> inordenAVL = arbolAVL.recorridoEnOrden();
                        for (Integer valor : inordenAVL) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");

                        outputArea.append("Recorrido en Preorden: ");
                        List<Integer> preordenAVL = arbolAVL.recorridoPreOrden();
                        for (Integer valor : preordenAVL) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");

                        outputArea.append("Recorrido en Postorden: ");
                        List<Integer> postordenAVL = arbolAVL.recorridoPostOrden();
                        for (Integer valor : postordenAVL) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");
                        break;
                    case "Árbol Rojo-Negro":
                        outputArea.append("Recorrido en Inorden: ");
                        List<Integer> inordenRN = arbolRojoNegro.recorridoEnOrden();
                        for (Integer valor : inordenRN) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");

                        outputArea.append("Recorrido en Preorden: ");
                        List<Integer> preordenRN = arbolRojoNegro.recorridoPreOrden();
                        for (Integer valor : preordenRN) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");

                        outputArea.append("Recorrido en Postorden: ");
                        List<Integer> postordenRN = arbolRojoNegro.recorridoPostOrden();
                        for (Integer valor : postordenRN) {
                            outputArea.append(valor + " ");
                        }
                        outputArea.append("\n");
                        break;
                    case "Grafo":
                        grafo.recorrer(outputArea);
                        break;
                    default:
                        outputArea.append("Estructura no reconocida.\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Master();
            }
        });
    }
}

