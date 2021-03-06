/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemak;

import java.awt.Image;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
// para la base de datos
import Conex.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario 1
 */
public class IngresoProducto extends javax.swing.JFrame {
Conexion c= new Conexion();
PreparedStatement ps;
ResultSet rs;
ResultSetMetaData rsm;
DefaultTableModel dtm = new DefaultTableModel();
String ruta="";
    /**
     * Creates new form IngresoMaterial
     */
    
    public IngresoProducto() {
        initComponents();
        c.conector();
        jTextField1.setText("");
        jTextField2.setText("");
        this.setLocationRelativeTo(null);
        this.jLabel2.setText(" ");
        ImageIcon imagen = new ImageIcon("src/Imagenes/2.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(this.jLabel2.getWidth(), this.jLabel2.getHeight(), Image.SCALE_DEFAULT));
        this.jLabel2.setIcon(icono);
        this.jComboBox1.setModel(c.Obt_Pro());
        this.jComboBox2.setModel(c.Obt_Color());
        this.jComboBox3.setModel(c.Obt_Estilo());
        this.jComboBox4.setModel(c.Obt_Mat());
        dtm.addColumn("Nombre");
        dtm.addColumn("Cantidad");
        this.jTable1.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void ActualizaBox(JComboBox box, DefaultComboBoxModel boxModel){
        boolean existe=false;
        for (int i = 0; i < boxModel.getSize(); i++) {
            if(boxModel.getElementAt(i).equals(box.getEditor().getItem())){
            existe=true;
            }
        }
        if(!existe){
            boxModel.addElement(box.getEditor().getItem());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fSButtonMD1 = new LIB.FSButtonMD();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("MiniLogo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 230, 70));

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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Especificaciones Producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 270, 30));

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 160));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Materiales del producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, 30));

        jButton1.setText("Agregar a la lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        jButton2.setText("Ingresar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jSpinner1.setBorder(null);
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 70, -1));

        jLabel1.setText("Cantidad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel3.setText("Tama??o");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 160, -1));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 160, -1));

        jButton3.setText("Seleccionar Foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] info = new String[2];
        info[0] = (String) jComboBox4.getSelectedItem();
        try {
            jSpinner1.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(IngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer value = (Integer) jSpinner1.getValue();
        info[1] = value.toString();
        if ((!"Seleccione el Material".equals(info[0])) && (!"0".equals(info[1]))) {
            this.dtm.addRow(info);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.validar()) {
            // prueba para saber que se le va a mandar
            String nombre = (String) jComboBox1.getSelectedItem();
            String color = (String) jComboBox2.getSelectedItem();
            String estilo = (String) jComboBox3.getSelectedItem();
            String query="INSERT INTO producto (nombre,color,tama??o,estilo,fotografia,cantidad,precio) values ('"+nombre+"',"+"'"+color+"',"+jTextField1.getText()+",'"+estilo+"','"+ruta+"',1,"+jTextField2.getText()+");";
            Statement stmt;
//            System.out.println(query);
            try {
                stmt = c.con.createStatement();
                stmt.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(IngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            ruta = "";
            for (int i = 0; i < dtm.getRowCount(); i++) {
                for (int j = 0; j < c.listaMat.size(); j++) {
                    if (c.listaMat.get(j).equals((String) dtm.getValueAt(i, 0))) {
                        Integer pedido = Integer.parseInt((String) dtm.getValueAt(i, 1));
                        if (c.listaExistencia.get(j) > pedido) {
                            Integer nuevaExistencia = c.listaExistencia.get(j) - pedido;
                            Integer id = j+1;
                            String query2 = "UPDATE material set existencia=" + nuevaExistencia.toString() + " where idMaterial=" + id.toString() + ";";
                            try {
//                                System.out.println(query2);
                                stmt = c.con.createStatement();
                                stmt.executeUpdate(query2);
                                c.listaExistencia.set(j, nuevaExistencia);
                                jTextField1.setText("");
                                jTextField2.setText("");
                            } catch (SQLException ex) {
                                Logger.getLogger(IngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & PNG Images", "jpg", "png");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(jPanel1);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
        ruta=chooser.getSelectedFile().getPath();
    }
    }//GEN-LAST:event_jButton3ActionPerformed
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        //cargaTicket();
    }
    public boolean validar() {
        boolean valido = true;
        //hay que tratar de ver si no es valido
        if ((jComboBox1.getSelectedIndex() == 0) || (jComboBox2.getSelectedIndex() == 0) || (jComboBox4.getSelectedIndex() == 0)) {
            valido = false;
        }
        String prueba = this.jTextField1.getText();
        String prueba2 = this.jTextField1.getText();
        if (("".equals(prueba)) || ("".equals(prueba2)) || ("".equals(ruta))) {
            valido = false;
        }
        if (dtm.getRowCount() == 0) {
            valido = false;
        } else {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                for (int j = 0; j < c.listaMat.size(); j++) {
                    if (c.listaMat.get(j).equals((String) dtm.getValueAt(i, 0))) {
                        Integer pedido = Integer.parseInt((String) dtm.getValueAt(i, 1));
                        if (c.listaExistencia.get(j) < pedido) {
                            valido = false;
                            System.out.println("No Valido "+c.listaMat.get(j));
                        }else{
                            System.out.println("Valido");
                        }
                    }
                }
//                System.out.println(i + ". " + dtm.getValueAt(i, 0) + " " + dtm.getValueAt(i, 1));
            }
        }

        return valido;
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
            java.util.logging.Logger.getLogger(IngresoMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD fSButtonMD1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
