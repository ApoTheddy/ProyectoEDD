package Controlador;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class ConfiguracionVentanas {

    public ConfiguracionVentanas() {

    }

    // Establece los valores iniciales que tendra mi ventana
    public void configuracionInicial(JFrame ventana,String titulo) {
        ventana.setTitle(titulo);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

    public void configuracionInicial(JDialog ventana,String titulo) {
        ventana.setTitle(titulo);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

}
