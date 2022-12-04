package Vista.Ejercicios;

import Modelo.Ejercicios.Ejercicio;
import Modelo.Ejercicios.Imagen;
import Modelo.Ejercicios.Nota;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ContenedorEjercicio extends javax.swing.JPanel {

    private Ejercicio ejercicio;
    private ArrayList<Imagen> imagenes;

    public ContenedorEjercicio(Ejercicio ejercicio, ArrayList<Imagen> imagenes) {
        initComponents();
        this.ejercicio = ejercicio;
        this.imagenes = imagenes;

        establecerDatos();
    }

    public void establecerDatos() {
        lblTituloEjercicio6.setText(ejercicio.getName());
        txaDescripcion.setText("\t" + ejercicio.getDescripcion());
        JLabel lblImg;

        if (!imagenes.isEmpty()) {
            for (Imagen imagen : imagenes) {
                try {
                    lblImg = new JLabel();
                    URL url = new URL(imagen.getImage());
                    lblImg.setIcon(new ImageIcon(ImageIO.read(url).getScaledInstance(270, 270, 100)));
                    pnlImagenes.add(lblImg);
                } catch (IOException ioex) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al obtener la imagen, " + ioex.getMessage());
                }

            }
        } else {
            try {
                lblImg = new JLabel();
                lblImg.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Imagenes/image_default.png")).getScaledInstance(300, 280, 100)));
                pnlImagenes.add(lblImg);
            } catch (IOException ioex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al obtener la imagen, " + ioex.getMessage());
            }
        }

        if (!ejercicio.getNotes().isEmpty()) {
            for (Nota nota : ejercicio.getNotes()) {
                txaNotas.append(" > " + nota.getComment() + "\n");
            }
        } else {
            txaNotas.setText("Sin ninguna anotacion");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lblTituloEjercicio6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlImagenes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaNotas = new javax.swing.JTextArea();

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(0, 0, 0));

        jPanel14.setBackground(new java.awt.Color(248, 248, 248));

        lblTituloEjercicio6.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        lblTituloEjercicio6.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloEjercicio6.setText("TITLE EXERCISE");

        jScrollPane2.setHorizontalScrollBar(null);

        pnlImagenes.setBackground(new java.awt.Color(255, 255, 255));
        pnlImagenes.setLayout(new java.awt.GridLayout(1, 2, 10, 0));
        jScrollPane2.setViewportView(pnlImagenes);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloEjercicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloEjercicio6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Description");

        txaDescripcion.setEditable(false);
        txaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txaDescripcion.setColumns(20);
        txaDescripcion.setFont(new java.awt.Font("Victor Mono Oblique", 0, 18)); // NOI18N
        txaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txaDescripcion.setLineWrap(true);
        txaDescripcion.setRows(5);
        txaDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txaDescripcion);

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Notas");

        txaNotas.setEditable(false);
        txaNotas.setBackground(new java.awt.Color(255, 255, 255));
        txaNotas.setColumns(20);
        txaNotas.setFont(new java.awt.Font("Victor Mono Oblique", 0, 18)); // NOI18N
        txaNotas.setForeground(new java.awt.Color(0, 0, 0));
        txaNotas.setLineWrap(true);
        txaNotas.setRows(5);
        txaNotas.setBorder(null);
        jScrollPane3.setViewportView(txaNotas);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTituloEjercicio6;
    private javax.swing.JPanel pnlImagenes;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextArea txaNotas;
    // End of variables declaration//GEN-END:variables
}
