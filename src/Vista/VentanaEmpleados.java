package Vista;

import Modelo.Empleado.ListaDobleEmpleado;
import Vista.Empleado.AgregarEmpleado;
import Modelo.Empleado.Empleado;
import Vista.Empleado.VerMasEmpleado;
import Controlador.*;
import java.awt.event.*;
import java.util.function.Function;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaEmpleados extends javax.swing.JDialog {

    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();

    private final String[][] data = {};
    private final String[] cabecera = {"N", "NOMBRES", "APELLIDOS", "DNI", "NUMEROS INSCRITOS"};
    private ListaDobleEmpleado lista = new ListaDobleEmpleado();
    private DefaultTableModel modelo;
    private Function<Empleado, Empleado> refrescarTabla;
    private final Utils util = new Utils();
    private ManejadorArchivo archivo = new ManejadorArchivo();

    public VentanaEmpleados() {
        super(new JFrame(), false);
        initComponents();

        ventana.configuracionInicial(this, "EMPLEADOS");

        establecerConfiguracionTabla();
        lista = archivo.obtenerDatosEmpleados();

        rellenarTabla();

        escucharCallbacks();

        deshabilitarBotones();
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
        tblEmpleados.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                util.habilitarBotones(btnEliminarEmpleado, btnVerMas);
            }
        });

        modelo = new DefaultTableModel(data, cabecera) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblEmpleados.setRowHeight(30);
        tblEmpleados.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnVerMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_smart_fit60x60.png"))); // NOI18N

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEmpleados);

        btnAgregarEmpleado.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarEmpleado.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpleado.setText("AGREGAR EMPLEADO");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminarEmpleado.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpleado.setText("ELIMINAR EMPLEADO");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
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
                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
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
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        new AgregarEmpleado(refrescarTabla).setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        int filaSeleccionada = tblEmpleados.getSelectedRow();

        if (filaSeleccionada != -1) {
            String nombreEmpleadoEliminado = lista.eliminar(filaSeleccionada);

            if (!nombreEmpleadoEliminado.isEmpty()) {
                JOptionPane.showMessageDialog(null, nombreEmpleadoEliminado + " Eliminado");
                deshabilitarBotones();
            }
            modelo.removeRow(filaSeleccionada);
            archivo.actualizarEmpleado(lista);
            rellenarTabla();
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed
    public void deshabilitarBotones() {
        util.deshabilitarBotones(btnEliminarEmpleado, btnVerMas);
    }

    public void habilitarBotones() {
        util.habilitarBotones(btnEliminarEmpleado, btnVerMas);
    }

    public void rellenarTabla() {
        setearTabla();

        if (!lista.estaVacia()) {
            for (int i = 0; i < lista.getTamanio(); ++i) {
                Empleado emp = lista.getEmpleado(i);
                Object[] fila = {(i + 1), emp.getNombres(), emp.getApellidos(), emp.getDNI(), emp.getNumeroInscritos()};
                modelo.addRow(fila);
            }
        }

    }

    private void btnVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMasActionPerformed
        int filaSeleccionada = tblEmpleados.getSelectedRow();

        if (filaSeleccionada != -1) {
            Empleado empleado = lista.getEmpleado(filaSeleccionada);

            new VerMasEmpleado(empleado).setVisible(true);
            deshabilitarBotones();
        }
    }//GEN-LAST:event_btnVerMasActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        tblEmpleados.clearSelection();
        deshabilitarBotones();
    }//GEN-LAST:event_jPanel1MousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            VentanaEmpleados dialog = new VentanaEmpleados();
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
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnVerMas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables
}
