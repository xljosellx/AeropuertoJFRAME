package sistemadevuelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AeropuertoFrame extends JFrame {
    private boolean esPrivado;

    public AeropuertoFrame(boolean esPrivado) {
        this.esPrivado = esPrivado;
        setTitle("Seleccionar Aeropuerto");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione un aeropuerto:");
        add(label);

        ArrayList<String> aeropuertos = obtenerAeropuertos();

        JComboBox<String> aeropuertoBox = new JComboBox<>(aeropuertos.toArray(new String[0]));
        add(aeropuertoBox);

        JButton siguienteButton = new JButton("Siguiente");
        siguienteButton.addActionListener(e -> {
            String seleccionado = (String) aeropuertoBox.getSelectedItem();
            new CompaniaFrame(seleccionado, esPrivado).setVisible(true);
            dispose();
        });
        add(siguienteButton);
    }

    private ArrayList<String> obtenerAeropuertos() {
        ArrayList<String> aeropuertos = new ArrayList<>();
        if (esPrivado) {
            aeropuertos.add("Aeropuerto Privado Lima");
            aeropuertos.add("Aeropuerto Privado Medellín");
            aeropuertos.add("Aeropuerto Privado Santiago");
        } else {
            aeropuertos.add("Aeropuerto El Dorado Bogotá");
            aeropuertos.add("Aeropuerto Jorge Chávez Lima");
            aeropuertos.add("Aeropuerto Arturo Merino Santiago");
        }
        return aeropuertos;
    }
}
