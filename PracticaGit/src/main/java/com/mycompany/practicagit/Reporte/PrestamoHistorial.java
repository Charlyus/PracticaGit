/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practicagit.Reporte;

import com.mycompany.practicagit.Reportes;
import static com.mycompany.practicagit.cargarDatos.listaPrestamo;
import com.mycompany.practicagit.prestamo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana
 */
public class PrestamoHistorial extends javax.swing.JFrame {

    /**
     * Creates new form PrestamoActual
     */
    public PrestamoHistorial() {
        initComponents();
    }
    
    
    public void PrestamosDeUnEstudiante  (int carnetEstudiante){
        String prestamoActual[]= {"Carnet", "Codigo LIbro",  "Fecha de Prestamo","Fecha Devolucion"};
        DefaultTableModel  dtmDos = new DefaultTableModel(null, prestamoActual);
        for (int i= 0;  i<listaPrestamo.size(); i++){
          prestamo Historial = listaPrestamo.get(i);
          if (Historial.getCarnetEstudiante()==carnetEstudiante && Historial.isFinalizado()== true){
              String [] historialLibros = new String [4];
               historialLibros[0]=Historial.getCarnetEstudiante()+"";
                 historialLibros[1]=Historial.getCodigoLibro();
                 historialLibros[2]=Historial.getFechaPrestamo().toString();
                if (Historial.getFechaDevolucion()== null){
                    historialLibros[3]= "el libro aun no ha sido devuelto";
                    
               }else {
                    historialLibros[3]=Historial.getFechaDevolucion().toString();
                }
                dtmDos .addRow(prestamoActual);
                
          }
              
        }
        
        historialPrestaciones.setModel(dtmDos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ingresoCarnet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialPrestaciones = new javax.swing.JTable();
        fondoReporCInco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LISTADO DE PRESTAMOS ACTUAL POR UN ESTUDIANTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
        getContentPane().add(ingresoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 180, -1));

        jLabel1.setText("INGRESE SU CARNET ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, -1));

        historialPrestaciones.setBackground(new java.awt.Color(255, 255, 255));
        historialPrestaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Carnet", "Codigo De LIbros ", "Fecha Prestamo  ", "Fecha Devolucion"
            }
        ));
        jScrollPane1.setViewportView(historialPrestaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 630, 200));
        getContentPane().add(fondoReporCInco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Reportes ReporteHistorial = new Reportes();
        this.setVisible(false);
        ReporteHistorial.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String carnetIngresado = this.ingresoCarnet.getText();
                   int ingreso = Integer.valueOf(carnetIngresado);
                   PrestamosDeUnEstudiante(ingreso);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrestamoHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoReporCInco;
    private javax.swing.JTable historialPrestaciones;
    private javax.swing.JTextField ingresoCarnet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}