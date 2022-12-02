package Controlador;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AccionesLabel {

    public AccionesLabel() {

    }

    // Establece las acciones de los labels que le pasemos por parametros
    public void establecerAccion(JLabel label, JDialog ventana, JFrame ventanaActual) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                ventana.setVisible(true);
                ventanaActual.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                label.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                label.setCursor(Cursor.getDefaultCursor());
            }

        });
    }
    
      public void establecerAccion(JLabel label, JFrame ventana, JDialog ventanaActual) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                ventana.setVisible(true);
                ventanaActual.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                label.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                label.setCursor(Cursor.getDefaultCursor());
            }

        });
    }
}
