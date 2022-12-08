package Vista.Cliente;

import Controlador.ConfiguracionVentanas;
import Controlador.ManejadorArchivo;
import Modelo.Cliente.Cliente;
import Modelo.Progreso;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class VerMasCliente extends javax.swing.JDialog {

    private final Cliente cliente;
    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();
    private final String[][] data = {};
    private final String[] cabecera = {"PESO", "IMC", "FECHA"};
    private DefaultTableModel modelo;
    private String nombre;
    private ArrayList<Progreso> progresos = new ArrayList<>();
    private ManejadorArchivo archivo = new ManejadorArchivo();

    public VerMasCliente(Cliente cliente) {
        super(new JFrame(), true);
        this.cliente = cliente;

        initComponents();
        nombre = cliente.getNombres() + " " + cliente.getApellidos() + ".txt";
        modelo = new DefaultTableModel(data, cabecera);
        tblProgresos.setModel(modelo);
        ventana.configuracionInicial(this, "Informacion de " + cliente.getNombres() + " " + cliente.getApellidos());

        establecerValores();

        crearTxtProgreso();

        progresos = archivo.obtenerProgresos(new File("progresos/" + nombre));
        rellenarProgresos();

    }

    public void crearTxtProgreso() {
        File carpetaProgresos = new File("progresos");

        if (!carpetaProgresos.exists()) {
            carpetaProgresos.mkdir();

        }

        if (!new File(carpetaProgresos.getName() + "/" + nombre).exists()) {
            try {
                new FileWriter(carpetaProgresos.getName() + "/" + nombre, true).close();
            } catch (IOException ioex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error: " + ioex.getMessage());
            }
        }
    }

    public void configuracionDeTabla() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

    }

    public void establecerValores() {
        lblNombres.setText(cliente.getNombres());
        lblApellidos.setText(cliente.getApellidos());
        lblEdad.setText("" + cliente.getEdad());
        lblDni.setText(cliente.getDNI());
        lblPeso.setText("" + cliente.getPeso());
        lblAltura.setText("" + cliente.getAltura());
        lblFechaInscripcion.setText(cliente.getFechaInscripcion());
        lblFechaFinalizacion.setText(cliente.getFechaFinalizacion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblFechaInscripcion = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblFechaFinalizacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProgresos = new javax.swing.JTable();
        btnAgregarProgreso = new javax.swing.JButton();
        btnEliminarProgreso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPesoBajado = new javax.swing.JTextField();
        txtImc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRES:");

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDOS:");

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("EDAD:");

        jLabel4.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PESO:");

        jLabel6.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ALTURA:");

        jLabel7.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FECHA DE INSCRIPCION:");

        jLabel8.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA DE FINALIZACION:");

        lblNombres.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("DEFAULT");

        lblApellidos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("DEFAULT");

        lblEdad.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 0, 0));
        lblEdad.setText("DEFAULT");

        lblPeso.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 0, 0));
        lblPeso.setText("DEFAULT");

        lblDni.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setText("DEFAULT");

        lblFechaInscripcion.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblFechaInscripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInscripcion.setText("DEFAULT");

        lblAltura.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblAltura.setForeground(new java.awt.Color(0, 0, 0));
        lblAltura.setText("DEFAULT");

        lblFechaFinalizacion.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblFechaFinalizacion.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaFinalizacion.setText("DEFAULT");

        tblProgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProgresos);

        btnAgregarProgreso.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregarProgreso.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnAgregarProgreso.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarProgreso.setText("AGREGAR PROGRESO");
        btnAgregarProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProgresoActionPerformed(evt);
            }
        });

        btnEliminarProgreso.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarProgreso.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnEliminarProgreso.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProgreso.setText("ELIMINAR PROGRESO");
        btnEliminarProgreso.setToolTipText("");
        btnEliminarProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProgresoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estadisticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtPesoBajado.setBackground(new java.awt.Color(255, 255, 255));
        txtPesoBajado.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        txtPesoBajado.setForeground(new java.awt.Color(0, 0, 0));
        txtPesoBajado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso Bajado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        txtPesoBajado.setEnabled(false);

        txtImc.setBackground(new java.awt.Color(255, 255, 255));
        txtImc.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        txtImc.setForeground(new java.awt.Color(0, 0, 0));
        txtImc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        txtImc.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesoBajado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtImc, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesoBajado)
                    .addComponent(txtImc))
                .addContainerGap())
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("OBTENER ESTADISTICAS");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFechaInscripcion))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNombres))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblEdad))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblPeso))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnAgregarProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFechaFinalizacion))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblDni))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblApellidos))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblAltura)))
                                        .addGap(22, 22, 22))
                                    .addComponent(btnEliminarProgreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombres)
                    .addComponent(jLabel2)
                    .addComponent(lblApellidos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEdad)
                    .addComponent(jLabel4)
                    .addComponent(lblDni))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPeso)
                    .addComponent(jLabel6)
                    .addComponent(lblAltura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblFechaInscripcion)
                    .addComponent(jLabel8)
                    .addComponent(lblFechaFinalizacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rellenarProgresos() {
        modelo.setDataVector(new Object[][]{}, cabecera);

        for (int i = 0; i < progresos.size(); ++i) {
            DecimalFormat df = new DecimalFormat("00.00");

            modelo.addRow(new Object[]{progresos.get(i).getPeso(), df.format(progresos.get(i).getImc()), progresos.get(i).getFecha()});
        }
    }

    private void btnAgregarProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProgresoActionPerformed
        File clienteTxt = new File("progresos/" + nombre);

        if (clienteTxt.exists()) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso actual"));
            double imc = peso / Math.pow(cliente.getAltura(), 2);
            String sdf = new SimpleDateFormat("dd MMM yyyy").format(new Date().getTime());

            Progreso progreso = new Progreso(peso, imc, sdf);
            archivo.agregarProgreso(clienteTxt, progreso);
            progresos.add(progreso);
            rellenarProgresos();
        }
    }//GEN-LAST:event_btnAgregarProgresoActionPerformed

    private void btnEliminarProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProgresoActionPerformed
        File clienteTxt = new File("progresos/" + nombre);

        int filaSeleccionada = tblProgresos.getSelectedRow();

        if (filaSeleccionada != -1) {
            progresos.remove(filaSeleccionada);
            archivo.eliminarProgreso(clienteTxt, progresos);
            rellenarProgresos();
        }else{
        JOptionPane.showMessageDialog(null, "No hay fila seleccionada");
        }

    }//GEN-LAST:event_btnEliminarProgresoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        double peso = cliente.getPeso() - progresos.get(progresos.size() - 1).getPeso();

        if (peso < 0) {
            txtPesoBajado.setText("Usted subio " + (-(peso)) + "kg");
        } else {
            txtPesoBajado.setText("" + peso + "kg");
        }

        txtImc.setText("" + progresos.get(progresos.size() - 1).getImc());
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            VerMasCliente dialog = new VerMasCliente(new Cliente());
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProgreso;
    private javax.swing.JButton btnEliminarProgreso;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFechaFinalizacion;
    private javax.swing.JLabel lblFechaInscripcion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JTable tblProgresos;
    private javax.swing.JTextField txtImc;
    private javax.swing.JTextField txtPesoBajado;
    // End of variables declaration//GEN-END:variables
}
