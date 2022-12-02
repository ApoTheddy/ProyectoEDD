package Componentes;

import java.awt.Image;
import Modelo.Ejercicios.Informacion;
import Vista.InformacionEjercicio;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Cursor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CardEjercicio extends javax.swing.JPanel {

    private Informacion informacion;

    public CardEjercicio(Informacion informacion) {
        this.informacion = informacion;
        initComponents();

        establecerValores();
    }

    public void establecerValores() {
        lblImagen.setText("");

        if (!informacion.getEquipment().isEmpty()) {
            lblEquipamiento.setText(informacion.getEquipment().get(0).getName());
        }

        if (!informacion.getImages().isEmpty()) {
            for (int i = 0; i < informacion.getImages().size(); ++i) {
                try {
                    URL url = new URL(informacion.getImages().get(i).getImage());
                    Image img = ImageIO.read(url).getScaledInstance(200, 200, 109);

                    lblImagen.setIcon(new ImageIcon(img));
                } catch (IOException ioex) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al procesar la imagen, " + ioex.getMessage());
                }
            }
        }

        lblCategoria.setText(informacion.getCategory().getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblEquipamiento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(200, 300));
        setMinimumSize(new java.awt.Dimension(200, 290));
        setPreferredSize(new java.awt.Dimension(220, 350));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 355));
        jPanel1.setMinimumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 355));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoria:");

        lblCategoria.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("default");

        lblEquipamiento.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblEquipamiento.setForeground(new java.awt.Color(0, 0, 0));
        lblEquipamiento.setText("default");

        jLabel5.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Equipamento: ");

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image_default.png"))); // NOI18N
        lblImagen.setText("MuscleImage");
        lblImagen.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagen.setMaximumSize(new java.awt.Dimension(100, 100));
        lblImagen.setMinimumSize(new java.awt.Dimension(50, 50));
        lblImagen.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCategoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEquipamiento)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipamiento)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCategoria))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        new InformacionEjercicio(informacion).setVisible(true);
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setCursor(getCursor().getDefaultCursor());
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEquipamiento;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
