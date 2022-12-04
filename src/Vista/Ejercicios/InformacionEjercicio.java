package Vista.Ejercicios;

import Controlador.ConfiguracionVentanas;
import Modelo.Ejercicios.*;
import javax.swing.JFrame;

public class InformacionEjercicio extends javax.swing.JDialog {

    private final Informacion informacion;
    private ConfiguracionVentanas ventana = new ConfiguracionVentanas();

    public InformacionEjercicio(Informacion informacion) {
        super(new JFrame(), true);
        this.informacion = informacion;
        ventana.configuracionInicial(this, informacion.getCategory().getName());

        initComponents();

        establecerDatos();
    }

    public void establecerDatos() {
        for (Ejercicio ejercicio : informacion.getExercises()) {
            pnlEjercicios.add(new ContenedorEjercicio(ejercicio, informacion.getImages()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlEjercicios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlEjercicios.setBackground(new java.awt.Color(255, 255, 255));
        pnlEjercicios.setForeground(new java.awt.Color(0, 0, 0));
        pnlEjercicios.setLayout(new java.awt.GridLayout(0, 1, 0, 20));
        jScrollPane1.setViewportView(pnlEjercicios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEjercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InformacionEjercicio dialog = new InformacionEjercicio(null);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEjercicios;
    // End of variables declaration//GEN-END:variables
}
