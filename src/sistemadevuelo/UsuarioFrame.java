package sistemadevuelo;

import javax.swing.*;
import java.awt.*;

public class UsuarioFrame extends JFrame {
    public UsuarioFrame(String aeropuerto, String compania, String vuelo) {
        setTitle("Ingresar Datos del Usuario");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField(15);

        JLabel pasaporteLabel = new JLabel("Pasaporte:");
        JTextField pasaporteField = new JTextField(15);

        JLabel asientoLabel = new JLabel("Seleccione asiento:");
        JComboBox<String> asientoBox = new JComboBox<>(new String[]{"1A", "2B", "3C", "4D", "5E", "6F", "7G"});

        JButton generarFacturaButton = new JButton("Generar Factura");
        generarFacturaButton.addActionListener(e -> {
            String factura = String.format(
                "Factura:\nAeropuerto: %s\nCompañía: %s\nVuelo: %s\nUsuario: %s\nAsiento: %s",
                aeropuerto, compania, vuelo, nombreField.getText(), asientoBox.getSelectedItem()
            );
            JOptionPane.showMessageDialog(this, factura, "Factura Generada", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        });

        add(nombreLabel);
        add(nombreField);
        add(pasaporteLabel);
        add(pasaporteField);
        add(asientoLabel);
        add(asientoBox);
        add(generarFacturaButton);
    }
}
