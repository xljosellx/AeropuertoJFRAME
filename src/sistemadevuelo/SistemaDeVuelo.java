package sistemadevuelo;

import javax.swing.*;

public class SistemaDeVuelo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TipoAeropuertoFrame inicio = new TipoAeropuertoFrame();
            inicio.setVisible(true);
        });
    }
}


