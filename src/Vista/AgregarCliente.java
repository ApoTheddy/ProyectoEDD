package Vista;

import Controlador.ConfiguracionVentanas;
import Controlador.Utils;
import Modelo.Cliente;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.function.Function;
import javax.swing.JFrame;

public class AgregarCliente extends javax.swing.JDialog {

    private final Utils util = new Utils();
    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();
    Function<Cliente, Cliente> refrescarTabla;

    public AgregarCliente(Function<Cliente, Cliente> refrescarTabla) {
        super(new JFrame(), false);
        initComponents();

        this.refrescarTabla = refrescarTabla;

        ventana.configuracionInicial(this, "AGREGAR CLIENTE");
        inputTest();
    }

    public void limpiarEntradas() {
        JTextField[] campos = {txtNombres, txtApellidos, txtEdad, txtDni, txtPeso, txtAltura};

        dtFechaInscripcion.setDate(null);
        dtFechaFinalizacion.setDate(null);

        util.setearCampos(campos, "");
    }

    public void inputTest() {
        JTextField[] campos = {txtNombres, txtApellidos, txtEdad, txtDni, txtPeso, txtAltura};
        util.setearCampos(campos, "Test");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mniLimpiarCampos = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        dtFechaInscripcion = new com.toedter.calendar.JDateChooser();
        dtFechaFinalizacion = new com.toedter.calendar.JDateChooser();
        btnAgregar = new javax.swing.JButton();

        mniLimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        mniLimpiarCampos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        mniLimpiarCampos.setForeground(new java.awt.Color(0, 0, 0));
        mniLimpiarCampos.setText("Limpiar Campos");
        mniLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLimpiarCamposActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mniLimpiarCampos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        txtAltura.setBackground(new java.awt.Color(255, 255, 255));
        txtAltura.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(0, 0, 0));
        txtAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        dtFechaInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        dtFechaInscripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA INSCRIPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        dtFechaInscripcion.setForeground(new java.awt.Color(0, 0, 0));

        dtFechaFinalizacion.setBackground(new java.awt.Color(255, 255, 255));
        dtFechaFinalizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA FINALIZACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        dtFechaFinalizacion.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(dtFechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtFechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLimpiarCamposActionPerformed
        limpiarEntradas();
    }//GEN-LAST:event_mniLimpiarCamposActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        String mensaje = "";

        String nombres = " ";
        String apellidos = " ";
        int edad = 0;
        String dni = " ";
        double altura = 0d;
        double peso = 0d;
        String fechaInscripcion = " ";
        String fechaFinalizacion = " ";

        try {
            edad = Integer.parseInt(txtEdad.getText());
        } catch (NumberFormatException niex) {
            mensaje += "Ingrese un valor valido en el campo 'edad' \n";
        }

        try {
            altura = Double.parseDouble(txtAltura.getText());
        } catch (NumberFormatException niex) {
            mensaje += "Ingrese un valor valido en el campo 'altura' \n";
        }

        try {
            peso = Double.parseDouble(txtPeso.getText());
        } catch (NumberFormatException niex) {
            mensaje += "Ingrese un valor valido en el campo 'peso' \n";
        }

        if (!txtNombres.getText().trim().isEmpty()) {
            nombres = txtNombres.getText().trim();
        }

        if (!txtApellidos.getText().trim().isEmpty()) {
            apellidos = txtApellidos.getText().trim();

        }

        if (!txtDni.getText().trim().isEmpty()) {
            dni = txtDni.getText().trim();
        }

        if (dtFechaInscripcion.getDate() != null) {
            fechaInscripcion = new SimpleDateFormat("dd MMM yyyy").format(dtFechaInscripcion.getDate());
        }

        if (dtFechaFinalizacion.getDate() != null) {
            fechaFinalizacion = new SimpleDateFormat("dd MMM yyyy").format(dtFechaFinalizacion.getDate());
        }

        if (!mensaje.isEmpty()) {
            txtArea.setText(mensaje);
            JOptionPane.showMessageDialog(null, txtArea);
            txtArea.setText("");
        };

        if (mensaje.trim().isEmpty()) {
            Cliente cliente = new Cliente(nombres, apellidos, edad, dni, peso, altura, fechaInscripcion, fechaFinalizacion);
            limpiarEntradas();
            refrescarTabla.apply(cliente);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            AgregarCliente dialog = new AgregarCliente(null);
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
    private javax.swing.JButton btnAgregar;
    private com.toedter.calendar.JDateChooser dtFechaFinalizacion;
    private com.toedter.calendar.JDateChooser dtFechaInscripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mniLimpiarCampos;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}