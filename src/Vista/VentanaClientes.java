package Vista;

import Controlador.AccionesLabel;
import Controlador.ConfiguracionVentanas;
import Controlador.Utils;
import Estructuras.ListaDoble.ListaDoble;
import Modelo.Cliente;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.util.function.Function;
import javax.swing.JOptionPane;

public class VentanaClientes extends javax.swing.JDialog {

    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();

    private final String[][] data = {};
    private final String[] cabecera = {"N", "NOMBRES", "APELLIDOS", "PESO", "FECHA INSCRIPCION"};
    private final ListaDoble lista = new ListaDoble();
    private DefaultTableModel modelo;
    private Function<Cliente, Cliente> refrescarTabla;
    private final Utils util = new Utils();

    public VentanaClientes() {
        super(new JFrame(), false);
        initComponents();

        ventana.configuracionInicial(this, "CLIENTES");

        establecerConfiguracionTabla();

        rellenarTabla();

        escucharCallbacks();

        // test
        lista.agregarInicio(new Cliente("Juan", "Esquives", 19, "12345678", 80.0, 1.75, "12/12/2002", "12/12/2002"));
        lista.agregarInicio(new Cliente("Jesus", "Zapata", 19, "12345678", 80.0, 1.75, "12/12/2002", "12/12/2002"));
        lista.agregarInicio(new Cliente("Victoria", "Esquivel", 19, "12345678", 80.0, 1.75, "12/12/2002", "12/12/2002"));
        rellenarTabla();
        // test

        deshabilitarBotones();

    }

    public void rellenarTabla() {
        setearTabla();

        for (int i = 0; i < lista.obtenerTamanio(); ++i) {
            Object[] fila = {(i + 1), lista.getCliente(i).getNombres(), lista.getCliente(i).getApellidos(), lista.getCliente(i).getPeso(), lista.getCliente(i).getFechaInscripcion()};
            modelo.addRow(fila);
        }

    }

    public void escucharCallbacks() {
        refrescarTabla = (x) -> {
            lista.agregarInicio(x);
            rellenarTabla();
            return x;
        };
    }

    public void setearTabla() {
        modelo.setDataVector(new Object[][]{}, cabecera);
    }

    public void establecerConfiguracionTabla() {
        tblClientes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                util.habilitarBotones(btnEditarCliente, btnEliminarCliente, btnVerMas);
            }
        });

        modelo = new DefaultTableModel(data, cabecera) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblClientes.setRowHeight(30);
        tblClientes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnVerMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_smart_fit60x60.png"))); // NOI18N

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblClientes);

        btnAgregarCliente.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarCliente.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCliente.setText("AGREGAR CLIENTE");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(102, 153, 255));
        btnEditarCliente.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarCliente.setText("EDITAR CLIENTE");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarCliente.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarCliente.setText("ELIMINAR CLIENTE");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnVerMas.setBackground(new java.awt.Color(255, 204, 204));
        btnVerMas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnVerMas.setForeground(new java.awt.Color(0, 0, 0));
        btnVerMas.setText("VER MAS");
        btnVerMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                        .addComponent(btnVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        tblClientes.clearSelection();
        deshabilitarBotones();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        new AgregarCliente(refrescarTabla).setVisible(true);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();

        if (filaSeleccionada != -1) {
            JOptionPane.showConfirmDialog(null, "xdd");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();

        if (filaSeleccionada != -1) {
            String nombreClienteElimnado = lista.eliminar(filaSeleccionada);

            if (!nombreClienteElimnado.isEmpty()) {
                JOptionPane.showMessageDialog(null, nombreClienteElimnado + " Eliminado");
                deshabilitarBotones();
            }
            modelo.removeRow(filaSeleccionada);
            rellenarTabla();
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMasActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();

        if (filaSeleccionada != -1) {
            Cliente cliente = lista.getCliente(filaSeleccionada);
            new VerMas(cliente).setVisible(true);
            deshabilitarBotones();
        }
    }//GEN-LAST:event_btnVerMasActionPerformed

    public void deshabilitarBotones() {
        util.deshabilitarBotones(btnEditarCliente, btnEliminarCliente, btnVerMas);
    }

    public void habilitarBotones() {
        util.habilitarBotones(btnEditarCliente, btnEliminarCliente, btnVerMas);
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
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            VentanaClientes dialog = new VentanaClientes();
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
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnVerMas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
