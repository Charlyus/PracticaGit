/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practicagit.Reporte;

import com.mycompany.practicagit.Reportes;
import static com.mycompany.practicagit.cargarDatos.listaPrestamo;
import com.mycompany.practicagit.fecha;
import com.mycompany.practicagit.prestamo;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana
 */
public class ReporteDevolucionActual extends javax.swing.JFrame {

    /**
     * Creates new form ReporteDevolucionActual
     */
    public ReporteDevolucionActual() {
        initComponents();
    }
    
    public void DevolucionReportes(){
        LocalDate fechaActual = LocalDate.now();
         String[] arr = { "CARNET ESTUDIANTE", "CODIGO DE LIBRO", "FECHA PRESTAMO", "FECHA DEVOLUCION" };
         DefaultTableModel dtm = new DefaultTableModel(null, arr);
        for(int  i= 0; i<listaPrestamo.size(); i++){
            prestamo prestamoTemporal = listaPrestamo.get(i);
           fecha fechaTemporal = prestamoTemporal.getFechaPrestamo();
            LocalDate fechaPrestamo = LocalDate.of(fechaTemporal.getAnio(), fechaTemporal.getMes(), fechaTemporal.getDia());
            LocalDate fechadeDevolucion = fechaPrestamo.plusDays(3);
            Period diasDeDiferencia = fechaActual.until(fechadeDevolucion);
            int diasTotal = diasDeDiferencia.getDays();
           if(diasTotal== 0){
               String [] nombreColumnas = new String[4];
                       nombreColumnas[0]=prestamoTemporal.getCarnetEstudiante()+"  ";
                       nombreColumnas[1]=prestamoTemporal.getCodigoLibro();
                       nombreColumnas[2]=prestamoTemporal.getFechaPrestamo().toString();
                       nombreColumnas[3]=fechadeDevolucion.toString();
                       dtm.addRow(nombreColumnas);
               
                  }

                       
        }
        jTable1.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CARNET ESTUD.", "CODIGO LIBRO", "FECHA  PRESTAMO", "FECHA DEVOLUCION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 510, 220));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LISTADO DE LIBROS  QUE TIENEN QUE SER DEVUELTOS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 550, 294));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Reportes regresoaReportes = new Reportes();
        this.setVisible(false);
        regresoaReportes.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ReporteDevolucionActual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteDevolucionActual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteDevolucionActual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteDevolucionActual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteDevolucionActual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
