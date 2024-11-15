package sistemadevuelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VueloFrame extends JFrame {
    private String aeropuerto;
    private String compania;

    public VueloFrame(String aeropuerto, String compania) {
        this.aeropuerto = aeropuerto;
        this.compania = compania;
        setTitle("Seleccionar Vuelo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione un vuelo:");
        add(label);

        ArrayList<String> vuelos = obtenerVuelos();

        JComboBox<String> vueloBox = new JComboBox<>(vuelos.toArray(new String[0]));
        add(vueloBox);

        JButton siguienteButton = new JButton("Siguiente");
        siguienteButton.addActionListener(e -> {
            String vueloSeleccionado = (String) vueloBox.getSelectedItem();
            new UsuarioFrame(aeropuerto, compania, vueloSeleccionado).setVisible(true);
            dispose();
        });
        add(siguienteButton);
    }

    private ArrayList<String> obtenerVuelos() {
        ArrayList<String> vuelos = new ArrayList<>();
        vuelos.add("Vuelo 101: Bogotá -> Lima | Hora: 08:00 | Precio: $200");
        vuelos.add("Vuelo 202: Lima -> Santiago | Hora: 12:00 | Precio: $300");
        vuelos.add("Vuelo 303: Santiago -> Medellín | Hora: 18:00 | Precio: $250");
        return vuelos;
    }
}
