package Vista.Ejercicios;

import java.awt.Image;
import Modelo.Ejercicios.Informacion;
import Vista.Ejercicios.InformacionEjercicio;
import Vista.Ejercicios.VentanaEjercicios;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.function.Function;

public class CardEjercicio extends javax.swing.JPanel {

    private Informacion informacion;
    private boolean esFavorito;
    private Function<String, String> refrescarFavoritos;

    public CardEjercicio(Informacion informacion, boolean esFavorito, Function<String, String> refrescarFavoritos) {
        this.informacion = informacion;
        this.esFavorito = esFavorito;
        initComponents();
        this.refrescarFavoritos = refrescarFavoritos;

        establecerValores();

        if (esFavorito) {
            jMenuItem1.setText("Eliminar de Favorito");
            jMenuItem1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/remove_favorite24px.png")));
        }
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
                    BufferedImage img = ImageIO.read(url.openStream());
                    lblImagen.setIcon(new ImageIcon(img.getScaledInstance(200, 200, 0)));
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

        ppmFavoritos = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblEquipamiento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favorito24px.png"))); // NOI18N
        jMenuItem1.setText("Agregar Favorito");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ppmFavoritos.add(jMenuItem1);

        setComponentPopupMenu(ppmFavoritos);
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
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 355));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categoria:");

        lblCategoria.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("default");

        lblEquipamiento.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblEquipamiento.setForeground(new java.awt.Color(0, 0, 0));
        lblEquipamiento.setText("none");

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        boolean existe = false;
        if (VentanaEjercicios.favoritos.isEmpty()) {
            VentanaEjercicios.favoritos.add(informacion);
        } else if (esFavorito) {
            for (int i = 0; i < VentanaEjercicios.favoritos.size(); ++i) {
                if (VentanaEjercicios.favoritos.get(i).getId() == informacion.getId()) {
                    VentanaEjercicios.favoritos.remove(i);
                    refrescarFavoritos.apply("-");
                    break;
                }
            }
        } else {
            for (int i = 0; i < VentanaEjercicios.favoritos.size(); ++i) {
                if (VentanaEjercicios.favoritos.get(i).getId() == informacion.getId()) {
                    existe = true;
                }
            }
            if (!existe) {
                VentanaEjercicios.favoritos.add(informacion);
            } else {
                JOptionPane.showMessageDialog(null, "EL ejercicio ya se encuentra en sus favoritos");
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEquipamiento;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPopupMenu ppmFavoritos;
    // End of variables declaration//GEN-END:variables
}
