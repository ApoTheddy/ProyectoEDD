package Vista;

import Componentes.CardEjercicio;
import Controlador.Api;
import Controlador.ConfiguracionVentanas;
import Modelo.Ejercicios.Ejercicios;
import Modelo.Ejercicios.Informacion;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaEjercicios extends javax.swing.JDialog {

    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();
    private Api api = new Api();
    private Ejercicios ejercicios;
    private ArrayList<Informacion> resultados;

    public VentanaEjercicios() {
        super(new JFrame(), true);
        initComponents();
        ventana.configuracionInicial(this, "EJERCICIOS");

        ejercicios = api.getExercises(null);
        resultados = ejercicios.getResults();

        rellenarEjercicios(null);
    }

    public void rellenarEjercicios(String categoria) {
        pnlEjercicos.removeAll();

        if (categoria != null) {
            for (int i = 0; i < resultados.size(); ++i) {
                if (resultados.get(i).getCategory().getName().equals(categoria)) {
                    pnlEjercicos.add(new CardEjercicio(resultados.get(i)));
                }
            }
        } else {
            for (int i = 0; i < resultados.size(); ++i) {
                pnlEjercicos.add(new CardEjercicio(resultados.get(i)));
            }
        }
        pnlEjercicos.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlEjercicos = new javax.swing.JPanel();
        btnBorrarFiltro = new javax.swing.JButton();
        lblSiguiente = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 563, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(522, 522, 522))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarFiltro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblAnterior)
                                .addGap(31, 31, 31)
                                .addComponent(lblSiguiente)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBorrarFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSiguiente)
                    .addComponent(lblAnterior))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JPanel pnlEjercicos;
    // End of variables declaration//GEN-END:variables
}
