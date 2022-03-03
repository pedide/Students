/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.xprodswings.principal;

import com.xprodswing.principal.model.DataEncryption;
import com.xprodswing.principal.model.Users;
import com.xprodswings.principal.dao.UserDao;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 77011-26-10
 */
public class RegisterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public RegisterAdmin() {
        initComponents();
        this.setTitle("Xprod Register");
        setLocationRelativeTo(null); // pour Centrer le contenu de ma fenetre
        tableUpdate(); // Mettre a jour la table des produits 
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDENTIFIANTRG = new javax.swing.JTextField();
        txtMOTDEPASSERG = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnREGISTER = new javax.swing.JButton();
        btnEFFACER = new javax.swing.JButton();
        txtPROFILUTILISATEURRG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableREGISTER = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("XPROD");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("InfosPersonnelles"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("IDENTIFIANT: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("MOT DE PASSE:");

        txtIDENTIFIANTRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDENTIFIANTRGActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PROFIL UTILISATEUR :");

        btnREGISTER.setBackground(new java.awt.Color(51, 255, 0));
        btnREGISTER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnREGISTER.setText("S'INSCRIRE");
        btnREGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGISTERActionPerformed(evt);
            }
        });

        btnEFFACER.setBackground(new java.awt.Color(51, 255, 0));
        btnEFFACER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEFFACER.setText("EFFACER");
        btnEFFACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEFFACERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDENTIFIANTRG)
                            .addComponent(txtMOTDEPASSERG)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPROFILUTILISATEURRG)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnREGISTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnEFFACER)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDENTIFIANTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMOTDEPASSERG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPROFILUTILISATEURRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnREGISTER)
                    .addComponent(btnEFFACER))
                .addGap(60, 60, 60))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 730, 400));

        tableREGISTER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCLIENT", "IDENTIFIANT", "MOT DE PASSE", "PROFIL UTILISATEUR"
            }
        ));
        tableREGISTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableREGISTERMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableREGISTER);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 730, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con;
PreparedStatement pst;
    private void btnREGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGISTERActionPerformed

        String usernamerg = txtIDENTIFIANTRG.getText();
        try {
            String motdepasserg = DataEncryption.getSHA1(txtMOTDEPASSERG.getText());
            String authorizationrg = txtPROFILUTILISATEURRG.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xprod","root","");
                pst = con.prepareStatement("INSERT INTO user (USERNAME,PASSWORD,AUTHORIZATION)VALUES(?,?,?)");
                pst.setString(1, usernamerg);
                pst.setString(2, motdepasserg);
                pst.setString(3, authorizationrg);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"La personne a bien été inscrite");

                txtIDENTIFIANTRG.setText("");
                txtMOTDEPASSERG.setText("");
                txtPROFILUTILISATEURRG.setText("");
   
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        tableUpdate();

    }//GEN-LAST:event_btnREGISTERActionPerformed

    private void btnEFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEFFACERActionPerformed
             DefaultTableModel dtm =(DefaultTableModel)tableREGISTER.getModel();      
        int selectedIndex = tableREGISTER.getSelectedRow();
        
            txtIDENTIFIANTRG.setText("");
            txtMOTDEPASSERG.setText("");
            txtPROFILUTILISATEURRG.setText("");
             
    }//GEN-LAST:event_btnEFFACERActionPerformed

    private void tableREGISTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableREGISTERMouseClicked
          // Pour selectionner  les informations d'un champ
        DefaultTableModel dtm =(DefaultTableModel)tableREGISTER.getModel();
        int selectedIndex = tableREGISTER.getSelectedRow();

        txtIDENTIFIANTRG.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtMOTDEPASSERG.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtPROFILUTILISATEURRG.setText(dtm.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_tableREGISTERMouseClicked

    private void txtIDENTIFIANTRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDENTIFIANTRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDENTIFIANTRGActionPerformed
    private void tableUpdate(){
        int cpt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprod", "root","");
            pst=con.prepareStatement("SELECT * FROM `user`");
            ResultSet rs = null;
        try {
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }  
        ResultSetMetaData rsmd = rs.getMetaData();
        cpt= rsmd.getColumnCount();
        DefaultTableModel dtm =(DefaultTableModel)tableREGISTER.getModel();
        dtm.setRowCount(0);
            
            while(rs.next()){
                Vector vect = new Vector();
            
                for (int i=1;i<= cpt; i++){
                    vect.add(rs.getString("IDUSER"));
                    vect.add(rs.getString("USERNAME"));
                    vect.add(rs.getString("PASSWORD"));
                    vect.add(rs.getString("AUTHORIZATION"));
                }
            dtm.addRow(vect);
            }
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /** 
 * }
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
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEFFACER;
    private javax.swing.JButton btnREGISTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableREGISTER;
    private javax.swing.JTextField txtIDENTIFIANTRG;
    private javax.swing.JPasswordField txtMOTDEPASSERG;
    private javax.swing.JTextField txtPROFILUTILISATEURRG;
    // End of variables declaration//GEN-END:variables
List<Users> ListLogin = new ArrayList<Users>();
UserDao udao = new UserDao();
Users user = new Users();
}
