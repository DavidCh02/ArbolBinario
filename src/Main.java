import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Cambiar el look and feel al look and feel del sistema operativo
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            // Aquí inicializas tu JFrame y otros componentes
            JFrame frame = new JFrame("Mi Aplicación");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Añade aquí tus componentes (JComboBox, JTextField, JButton, JTextArea, etc.)
            // Asegúrate de establecer correctamente los layouts y disposiciones

            // Finalmente, muestra el JFrame
            frame.setVisible(true);
        });
    }
}
