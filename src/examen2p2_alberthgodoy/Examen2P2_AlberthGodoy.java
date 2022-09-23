/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_alberthgodoy;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author godoy
 */
public class Examen2P2_AlberthGodoy extends javax.swing.JFrame {

    private ArrayList<Empleado> listaEmpleado = new ArrayList();
    private ArrayList<Carros> listaCarros = new ArrayList();

    /**
     * Creates new form Examen2P2_AlberthGodoy
     */
    public Examen2P2_AlberthGodoy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_NumIdentidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_Edad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jTextField_NombreEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane_Empleados = new javax.swing.JScrollPane();
        jTable_Empleados = new javax.swing.JTable();
        jButton_CrearEmpleado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Crear Empleados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 106, -1));
        jPanel1.add(jTextField_NumIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, 30));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("Edad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, -1));

        jSpinner_Edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jPanel1.add(jSpinner_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 60, -1));

        jLabel4.setText("Numero Identidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, -1));
        jPanel1.add(jTextField_NombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 30));

        jLabel5.setText("Eliminar Empleados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTable_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Num Identidad", "Carros Reparados"
            }
        ));
        jScrollPane_Empleados.setViewportView(jTable_Empleados);

        jPanel1.add(jScrollPane_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 770, 330));

        jButton_CrearEmpleado.setText("Crear Empleado");
        jButton_CrearEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CrearEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_CrearEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 100, 30));

        jTabbedPane.addTab("Crear / Eliminar Empleados", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane.addTab("Crear/Eliminar Carros", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane.addTab("tab3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CrearEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CrearEmpleadoMouseClicked
        //Crear Empleados

        try {
            //Cargar archivos
            administrarEmpleado admin = new administrarEmpleado("./Nube/empleado.alex");
            String nombre = jTextField_NombreEmpleado.getText();
            int edad = (int) jSpinner_Edad.getValue();
            String numID = jTextField_NumIdentidad.getText();
            int carrosExitos = 0;
            //Validar
            for (Empleado empleado : listaEmpleado) {
                if (empleado.getNumID().equals(numID)) {
                    throw new Exception("Ya esta ese id");
                }

            }
            //Crear Empleaod
            listaEmpleado.add(new Empleado(nombre, edad, numID, carrosExitos));
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(rootPane, e, title, HEIGHT);
        }
    }//GEN-LAST:event_jButton_CrearEmpleadoMouseClicked
    public void cargarJtableEmpleado(JTable jTable, ArrayList<Empleado> listaEmpleados){
        //Agarrar el modelo
        listaEmpleados = new ArrayList();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado empleadoSelected = listaEmpleados.get(i);
            Object[] newRow = {
            empleadoSelected.getNombre(),
            empleadoSelected.getEdad(),
            empleadoSelected.getNumID(),
            empleadoSelected.getCantCarrosreparadoExito()
            };
            model.addRow(newRow);
        }
        jTable.setModel(model);
        jTable.repaint();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Examen2P2_AlberthGodoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen2P2_AlberthGodoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen2P2_AlberthGodoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen2P2_AlberthGodoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen2P2_AlberthGodoy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CrearEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane_Empleados;
    private javax.swing.JSpinner jSpinner_Edad;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable_Empleados;
    private javax.swing.JTextField jTextField_NombreEmpleado;
    private javax.swing.JTextField jTextField_NumIdentidad;
    // End of variables declaration//GEN-END:variables
}
