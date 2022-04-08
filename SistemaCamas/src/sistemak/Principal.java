/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemak;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario 1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src/Imagenes/1.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel1.getWidth(),  this.jLabel1.getHeight(), Image.SCALE_DEFAULT));
        this.jLabel1.setIcon(icono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fSButtonMD1 = new LIB.FSButtonMD();
        fSButtonMD2 = new LIB.FSButtonMD();
        fSButtonMD3 = new LIB.FSButtonMD();
        fSButtonMD4 = new LIB.FSButtonMD();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(229, 228, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSButtonMD1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fSButtonMD1.setText("X");
        fSButtonMD1.setColorHover(new java.awt.Color(153, 204, 255));
        fSButtonMD1.setColorNormal(new java.awt.Color(102, 153, 255));
        fSButtonMD1.setColorPressed(new java.awt.Color(102, 153, 255));
        fSButtonMD1.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD1.setColorTextPressed(new java.awt.Color(0, 0, 0));
        fSButtonMD1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        fSButtonMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD1ActionPerformed(evt);
            }
        });
        jPanel1.add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        fSButtonMD2.setBackground(new java.awt.Color(255, 255, 255));
        fSButtonMD2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fSButtonMD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono2.png"))); // NOI18N
        fSButtonMD2.setText("Ver Inventario");
        fSButtonMD2.setColorHover(new java.awt.Color(102, 153, 255));
        fSButtonMD2.setColorNormal(new java.awt.Color(255, 255, 255));
        fSButtonMD2.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD2.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD2.setColorTextPressed(new java.awt.Color(0, 0, 0));
        fSButtonMD2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fSButtonMD2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fSButtonMD2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fSButtonMD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD2ActionPerformed(evt);
            }
        });
        jPanel1.add(fSButtonMD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 100));

        fSButtonMD3.setBackground(new java.awt.Color(255, 255, 255));
        fSButtonMD3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fSButtonMD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono1.png"))); // NOI18N
        fSButtonMD3.setText("Ingresar Materiales");
        fSButtonMD3.setColorHover(new java.awt.Color(102, 153, 255));
        fSButtonMD3.setColorNormal(new java.awt.Color(255, 255, 255));
        fSButtonMD3.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD3.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD3.setColorTextPressed(new java.awt.Color(0, 0, 0));
        fSButtonMD3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fSButtonMD3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fSButtonMD3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fSButtonMD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD3ActionPerformed(evt);
            }
        });
        jPanel1.add(fSButtonMD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, 100));

        fSButtonMD4.setBackground(new java.awt.Color(255, 255, 255));
        fSButtonMD4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fSButtonMD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono3.png"))); // NOI18N
        fSButtonMD4.setText("Ingresar Productos");
        fSButtonMD4.setColorHover(new java.awt.Color(102, 153, 255));
        fSButtonMD4.setColorNormal(new java.awt.Color(255, 255, 255));
        fSButtonMD4.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD4.setColorTextNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD4.setColorTextPressed(new java.awt.Color(0, 0, 0));
        fSButtonMD4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fSButtonMD4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fSButtonMD4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fSButtonMD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD4ActionPerformed(evt);
            }
        });
        jPanel1.add(fSButtonMD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 150, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ PRINCIPAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 510, 180));

        jLabel1.setText("Logo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -108, 310, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSButtonMD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD2ActionPerformed
        // TODO add your handling code here:
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fSButtonMD2ActionPerformed

    private void fSButtonMD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD3ActionPerformed
        // TODO add your handling code here:
        IngresoMaterial ingresoMaterial = new IngresoMaterial();
        ingresoMaterial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fSButtonMD3ActionPerformed

    private void fSButtonMD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD4ActionPerformed
        // TODO add your handling code here:
        IngresoProducto ingresoProducto = new IngresoProducto();
        ingresoProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fSButtonMD4ActionPerformed

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD fSButtonMD1;
    private LIB.FSButtonMD fSButtonMD2;
    private LIB.FSButtonMD fSButtonMD3;
    private LIB.FSButtonMD fSButtonMD4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
