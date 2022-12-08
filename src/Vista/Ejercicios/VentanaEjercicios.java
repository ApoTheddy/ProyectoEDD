package Vista.Ejercicios;

import Controlador.Api;
import Controlador.ConfiguracionVentanas;
import Modelo.Ejercicios.Ejercicios;
import Modelo.Ejercicios.Informacion;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import java.util.function.Function;

public class VentanaEjercicios extends javax.swing.JDialog {

    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();
    private Api api = new Api();
    private Ejercicios ejercicios;
    private ArrayList<Informacion> resultados;
    public static ArrayList<Informacion> favoritos = new ArrayList<>();
    public Function<String, String> refrescarFavoritos;

    public VentanaEjercicios() {
        super(new JFrame(), true);
        initComponents();
        ventana.configuracionInicial(this, "EJERCICIOS");

        ejercicios = api.getExercises(null);
        resultados = ejercicios.getResults();

        rellenarEjercicios(null);

        refrescarFavoritos = (x) -> {
            rellenarFavoritos();
            return x;
        };
    }

    public void rellenarEjercicios(String categoria) {
        pnlEjercicos.removeAll();
        if (categoria != null) {
            for (int i = 0; i < resultados.size(); ++i) {
                if (resultados.get(i).getCategory().getName().equals(categoria)) {
                    pnlEjercicos.add(new CardEjercicio(resultados.get(i), false, refrescarFavoritos));
                }
            }
        } else {
            for (int i = 0; i < resultados.size(); ++i) {
                pnlEjercicos.add(new CardEjercicio(resultados.get(i), false, refrescarFavoritos));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlEjercicos = new javax.swing.JPanel();
        btnBorrarFiltro = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlEjerciciosFavoritos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_smart_fit60x60.png"))); // NOI18N

        cbxCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cbxCategoria.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        cbxCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccionar---", "Abs", "Arms", "Back", "Calves", "Chest", "Legs", "Shoulders" }));
        cbxCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        btnFiltro.setBackground(new java.awt.Color(153, 255, 153));
        btnFiltro.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnFiltro.setForeground(new java.awt.Color(0, 0, 0));
        btnFiltro.setText("FILTRAR");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        pnlEjercicos.setLayout(new java.awt.GridLayout(7, 10, 5, 5));
        jScrollPane1.setViewportView(pnlEjercicos);

        btnBorrarFiltro.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrarFiltro.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnBorrarFiltro.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarFiltro.setText("BORRAR");
        btnBorrarFiltro.setEnabled(false);
        btnBorrarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFiltroActionPerformed(evt);
            }
        });

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right_arrow32px.png"))); // NOI18N
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSiguienteMousePressed(evt);
            }
        });

        lblAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left_arrow32px.png"))); // NOI18N
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAnteriorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAnterior)
                        .addGap(30, 30, 30)
                        .addComponent(lblSiguiente)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrarFiltro)))
                        .addGap(0, 542, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltro)
                        .addComponent(btnBorrarFiltro))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnterior)
                    .addComponent(lblSiguiente))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel2);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        pnlEjerciciosFavoritos.setLayout(new java.awt.GridLayout(7, 10, 5, 5));
        jScrollPane2.setViewportView(pnlEjerciciosFavoritos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Favoritos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnteriorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMousePressed
        String previousPage = ejercicios.getPrevious().toString();
        if (!previousPage.equals("null")) {
            ejercicios = api.getExercises(previousPage);
            resultados = ejercicios.getResults();

            rellenarEjercicios(null);
        }
    }//GEN-LAST:event_lblAnteriorMousePressed

    private void lblSiguienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMousePressed
        String nextPage = ejercicios.getNext();

        ejercicios = api.getExercises(nextPage);
        resultados = ejercicios.getResults();

        rellenarEjercicios(null);

    }//GEN-LAST:event_lblSiguienteMousePressed

    private void btnBorrarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFiltroActionPerformed
        rellenarEjercicios(null);
    }//GEN-LAST:event_btnBorrarFiltroActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        String categoria = cbxCategoria.getSelectedItem().toString();

        if (!categoria.equals("---Seleccionar---")) {
            btnBorrarFiltro.setEnabled(true);
            rellenarEjercicios(categoria);
            cbxCategoria.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione una categoria");
        }
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void lblSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseEntered
        lblSiguiente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblSiguiente.setToolTipText("Pagina Siguiente");
    }//GEN-LAST:event_lblSiguienteMouseEntered

    private void lblAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseEntered
        lblAnterior.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblAnterior.setToolTipText("Pagina Anterior");
    }//GEN-LAST:event_lblAnteriorMouseEntered

    private void lblSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseExited
        lblSiguiente.setCursor(getCursor().getDefaultCursor());
    }//GEN-LAST:event_lblSiguienteMouseExited

    private void lblAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseExited
        lblAnterior.setCursor(getCursor().getDefaultCursor());
    }//GEN-LAST:event_lblAnteriorMouseExited

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        rellenarFavoritos();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    public void rellenarFavoritos() {
        pnlEjerciciosFavoritos.removeAll();

        for (Informacion informacion : favoritos) {
            pnlEjerciciosFavoritos.add(new CardEjercicio(informacion, true, refrescarFavoritos));
        }

        pnlEjerciciosFavoritos.updateUI();
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEjercicios dialog = new VentanaEjercicios();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarFiltro;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JPanel pnlEjerciciosFavoritos;
    private javax.swing.JPanel pnlEjercicos;
    // End of variables declaration//GEN-END:variables
}
