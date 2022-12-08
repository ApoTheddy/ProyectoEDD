package Vista.Empleado;

import Modelo.Empleado.Empleado;
import Controlador.ConfiguracionVentanas;
import Controlador.ManejadorArchivo;
import Controlador.Utils;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.function.Function;
import javax.swing.JFrame;

public class AgregarEmpleado extends javax.swing.JDialog {

    private final Utils util = new Utils();
    private final ConfiguracionVentanas ventana = new ConfiguracionVentanas();
    Function<Empleado, Empleado> refrescarTabla;
    private ManejadorArchivo archivo = new ManejadorArchivo();

    public AgregarEmpleado(Function<Empleado, Empleado> refrescarTabla) {
        super(new JFrame(), false);
        initComponents();

        this.refrescarTabla = refrescarTabla;

        ventana.configuracionInicial(this, "AGREGAR EMPLEADO");
        inputTest();

    }

    public void limpiarEntradas() {
        JTextField[] campos = {txtNombres, txtApellidos, txtEdad, txtDni, txtNumeroInscritos, txtSueldoBase};
        util.setearCampos(campos, "");
    }

    public void inputTest() {
        JTextField[] campos = {txtNombres, txtApellidos, txtEdad, txtDni, txtNumeroInscritos, txtSueldoBase};
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
        txtNumeroInscritos = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        mniLimpiarCampos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
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

        txtNombres.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N

        txtEdad.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N

        txtDni.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N

        txtNumeroInscritos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtNumeroInscritos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO INSCRITOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N
        txtNumeroInscritos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtSueldoBase.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txtSueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUELDO BASE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14))); // NOI18N

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
                                .addComponent(txtNumeroInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
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
                    .addComponent(txtNumeroInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
        int numeroInscritos = 0;
        double sueldoBase = 0d;

        try {
            edad = Integer.parseInt(txtEdad.getText());
        } catch (NumberFormatException niex) {
            mensaje += "Ingrese un valor valido en el campo 'edad' \n";
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

        if (!txtSueldoBase.getText().trim().isEmpty()) {
            sueldoBase = Double.parseDouble(txtSueldoBase.getText().trim());
        }

        if (!txtNumeroInscritos.getText().trim().isEmpty()) {
            numeroInscritos = Integer.parseInt(txtNumeroInscritos.getText().trim());
        }

        if (!mensaje.isEmpty()) {
            txtArea.setText(mensaje);
            JOptionPane.showMessageDialog(null, txtArea);
            txtArea.setText("");
        };

        if (mensaje.trim().isEmpty()) {
            Empleado empleado = new Empleado(nombres, apellidos, edad, dni, "empleado", numeroInscritos, sueldoBase);
            limpiarEntradas();
            refrescarTabla.apply(empleado);
            archivo.guardarDatosEmpleado(empleado);
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
            java.util.logging.Logger.getLogger(AgregarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            AgregarEmpleado dialog = new AgregarEmpleado(null);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mniLimpiarCampos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroInscritos;
    private javax.swing.JTextField txtSueldoBase;
    // End of variables declaration//GEN-END:variables
}
