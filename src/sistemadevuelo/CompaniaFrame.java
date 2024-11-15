package sistemadevuelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CompaniaFrame extends JFrame {
    private String aeropuerto;
    private boolean esPrivado;

    public CompaniaFrame(String aeropuerto, boolean esPrivado) {
        this.aeropuerto = aeropuerto;
        this.esPrivado = esPrivado;
        setTitle("Seleccionar Compañía");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione una compañía:");
        add(label);

        ArrayList<String> companias = obtenerCompanias();

        JComboBox<String> companiaBox = new JComboBox<>(companias.toArray(new String[0]));
        add(companiaBox);

        JButton siguienteButton = new JButton("Siguiente");
        siguienteButton.addActionListener(e -> {
            String seleccionada = (String) companiaBox.getSelectedItem();
            new VueloFrame(aeropuerto, seleccionada).setVisible(true);
            dispose();
        });
        add(siguienteButton);
    }

    private ArrayList<String> obtenerCompanias() {
        ArrayList<String> companias = new ArrayList<>();
        if (esPrivado) {
            companias.add("JetSmart");
            companias.add("LATAM Privado");
            companias.add("FlySAA");
        } else {
            companias.add("Avianca");
            companias.add("LATAM");
            companias.add("Copa Airlines");
        }
        return companias;
    }
}
