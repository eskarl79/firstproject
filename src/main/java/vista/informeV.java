/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Imagic1
 */
public class informeV extends javax.swing.JFrame {

    /**
     * Creates new form informeV
     */
    public informeV() {
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

        labelMayor = new javax.swing.JLabel();
        labelMenor = new javax.swing.JLabel();
        labelPromedio = new javax.swing.JLabel();
        labelInventario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title_windowInforme = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelMayor.setFont(new java.awt.Font("Encode Sans Condensed Light", 0, 18)); // NOI18N
        labelMayor.setForeground(new java.awt.Color(0, 0, 0));
        labelMayor.setText("Producto precio mayor:  >> ");

        labelMenor.setFont(new java.awt.Font("Encode Sans Condensed Light", 0, 18)); // NOI18N
        labelMenor.setForeground(new java.awt.Color(0, 0, 0));
        labelMenor.setText("Producto precio menor:  >> ");

        labelPromedio.setFont(new java.awt.Font("Encode Sans Condensed Light", 0, 18)); // NOI18N
        labelPromedio.setForeground(new java.awt.Color(0, 0, 0));
        labelPromedio.setText("Promedio de precios:  >>  ");

        labelInventario.setFont(new java.awt.Font("Encode Sans Condensed Light", 0, 18)); // NOI18N
        labelInventario.setForeground(new java.awt.Color(0, 0, 0));
        labelInventario.setText("Valor de Inventario:  >>  ");

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        title_windowInforme.setAlignment(java.awt.Label.CENTER);
        title_windowInforme.setFont(new java.awt.Font("Encode Sans Condensed SemiBold", 0, 14)); // NOI18N
        title_windowInforme.setForeground(new java.awt.Color(255, 255, 255));
        title_windowInforme.setText("INFORME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 171, Short.MAX_VALUE)
                .addComponent(title_windowInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(title_windowInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInventario)
                    .addComponent(labelPromedio)
                    .addComponent(labelMenor)
                    .addComponent(labelMayor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(labelMayor)
                .addGap(18, 18, 18)
                .addComponent(labelMenor)
                .addGap(18, 18, 18)
                .addComponent(labelPromedio)
                .addGap(18, 18, 18)
                .addComponent(labelInventario)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(informeV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informeV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informeV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informeV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informeV().setVisible(true);
            }
        });
    }

    
    public String getLabelInventario() {
        return labelInventario.getText();
    }
        public void setLabelInventario(String inventario) {
        labelInventario.setText(inventario);
    }
        
        

    public String getLabelMayor() {
        return labelMayor.getText();
    }
    public void setLabelMayor(String mayor) {
        labelMayor.setText(mayor);
    }
    
    
    
    public String getLabelMenor() {
        return labelMenor.getText();
    }
    public void setLabelMenor(String menor) {
        labelMenor.setText(menor);
    }
    
    

    public String getLabelPromedio() {
        return labelPromedio.getText();
    }
    public void setLabelPromedio(String promedio) {
        labelPromedio.setText(promedio);
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelInventario;
    private javax.swing.JLabel labelMayor;
    private javax.swing.JLabel labelMenor;
    private javax.swing.JLabel labelPromedio;
    private java.awt.Label title_windowInforme;
    // End of variables declaration//GEN-END:variables

    
}
