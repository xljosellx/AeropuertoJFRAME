package sistemadevuelo;

import javax.swing.*;
import java.awt.*;

public class TipoAeropuertoFrame extends JFrame {
    public TipoAeropuertoFrame() {
        setTitle("Seleccionar Tipo de Aeropuerto");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione el tipo de aeropuerto:");
        add(label);

        JButton privadoButton = new JButton("Privado");
        JButton publicoButton = new JButton("Público");

        privadoButton.addActionListener(e -> {
            new AeropuertoFrame(true).setVisible(true);
            dispose();
        });

        publicoButton.addActionListener(e -> {
            new AeropuertoFrame(false).setVisible(true);
            dispose();
        });

        add(privadoButton);
        add(publicoButton);
    }
}
