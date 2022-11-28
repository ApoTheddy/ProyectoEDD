package Controlador;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Utils {
    
    public void setearCampos(JTextField[] campos,String contenido) {
        for (int i = 0; i < campos.length; ++i) {
            campos[i].setText(contenido);
        }
    }
    
    public void deshabilitarBotones(JButton... botones){
        for(JButton boton : botones){
            boton.setEnabled(false);
        }
    }
    
        public void habilitarBotones(JButton... botones){
        for(JButton boton : botones){
            boton.setEnabled(true);
        }
    }
    
}
