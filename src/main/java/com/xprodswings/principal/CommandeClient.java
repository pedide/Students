/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.xprodswings.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 77011-26-10
 */
public class CommandeClient extends javax.swing.JFrame {

    /**
     * Creates new form Commande
     */
    public CommandeClient() {
        initComponents();
        this.setTitle("Xprod gestion des commandes");
        setLocationRelativeTo(null);
        tableUpdate();
    }
    public void afficherUser(String User){
        lBUserCommandeClient.setText(User);
    }       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAJOUTERCOMM = new javax.swing.JButton();
        btnMODIFIERCOMM = new javax.swing.JButton();
        btnEFFACER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDATECMD = new javax.swing.JTextField();
        txtFRAISPORTCMD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCOMMANDE = new javax.swing.JTable();
        lBUserCommandeClient = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAddProduit = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemAddFournisseur = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        btnAJOUTERCOMM.setBackground(new java.awt.Color(51, 255, 0));
        btnAJOUTERCOMM.setText("AJOUTER");
        btnAJOUTERCOMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAJOUTERCOMMActionPerformed(evt);
            }
        });

        btnMODIFIERCOMM.setBackground(new java.awt.Color(51, 255, 0));
        btnMODIFIERCOMM.setText("MODIFIER");
        btnMODIFIERCOMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERCOMMActionPerformed(evt);
            }
        });

        btnEFFACER.setBackground(new java.awt.Color(51, 255, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAJOUTERCOMM, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMODIFIERCOMM, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEFFACER, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAJOUTERCOMM)
                .addGap(18, 18, 18)
                .addComponent(btnMODIFIERCOMM)
                .addGap(18, 18, 18)
                .addComponent(btnEFFACER)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Infos Commande"));

        jLabel3.setText("DateCmd");

        jLabel4.setText("fraisportCmd");

        txtFRAISPORTCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFRAISPORTCMDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDATECMD, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(txtFRAISPORTCMD, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDATECMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFRAISPORTCMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LISTE DES COMMANDES");

        tableCOMMANDE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATECMD", "FRAISPORTCMD"
            }
        ));
        tableCOMMANDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCOMMANDEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCOMMANDE);

        lBUserCommandeClient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lBUserCommandeClient.setText("CLIENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(lBUserCommandeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBUserCommandeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Produits");

        jMenuItemAddProduit.setText("Ajouter un produit");
        jMenuItemAddProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddProduitActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAddProduit);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Fournisseur");

        jMenuItemAddFournisseur.setText("Ajouter un fournisseur");
        jMenuItemAddFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddFournisseurActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemAddFournisseur);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Login");

        jMenuItemLogin.setText("Se connecter");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemLogin);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAJOUTERCOMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERCOMMActionPerformed
       // Ajout fournisseur
        String datecmd = txtDATECMD.getText();
        String fraisportcmd = txtFRAISPORTCMD.getText();
 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprod","root","");
            pst = con.prepareStatement("INSERT INTO `commande`(`DATECMD`, `FRAISPORTCMD`) VALUES (?,?)");
            pst.setString(1, datecmd);
            pst.setString(2, fraisportcmd);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"La commande a bien été ajoutée");

            txtDATECMD.setText("");
            txtFRAISPORTCMD.setText("");
            tableUpdate();

        }catch (SQLException ex) {
            Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
        }              
    }//GEN-LAST:event_btnAJOUTERCOMMActionPerformed

    private void btnMODIFIERCOMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERCOMMActionPerformed
        //Modification    
        DefaultTableModel dtm =(DefaultTableModel)tableCOMMANDE.getModel();      
        int selectedIndex = tableCOMMANDE.getSelectedRow();
        int idCmd = Integer.parseInt(dtm.getValueAt(selectedIndex,0).toString());
        String datecmd = txtDATECMD.getText();
        String fraisportcmd = txtFRAISPORTCMD.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // Enregistrer le Driver JDBC
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprod", "root", "");
            pst = con.prepareStatement("update commande set DATECMD=?,FRAISPORTCMD=?where IDCMD=?");
            pst.setString(1, datecmd);
            pst.setString(2, fraisportcmd);
            pst.setInt(3, idCmd);
            pst.executeUpdate();
                
            JOptionPane.showMessageDialog(this,"La commande a bien été modifiée");
           
            // Je vide le contenu des champs remplis 
            txtDATECMD.setText("");
            txtFRAISPORTCMD.setText("");
            tableUpdate();

        }catch (SQLException ex) {
            Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
        }                 
    }//GEN-LAST:event_btnMODIFIERCOMMActionPerformed

    private void tableCOMMANDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCOMMANDEMouseClicked
      // Pour selectionner  les informations d'un champ
        DefaultTableModel dtm =(DefaultTableModel)tableCOMMANDE.getModel();
        int selectedIndex = tableCOMMANDE.getSelectedRow();

        txtDATECMD.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtFRAISPORTCMD.setText(dtm.getValueAt(selectedIndex, 2).toString());
    }//GEN-LAST:event_tableCOMMANDEMouseClicked

    private void jMenuItemAddProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddProduitActionPerformed
        XprodDesktopClient newProd1 = new XprodDesktopClient();
        newProd1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAddProduitActionPerformed

    private void jMenuItemAddFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddFournisseurActionPerformed
        //Ajout d'un nouveau fournisseur

        FournisseurClient newFour = new FournisseurClient();
        newFour.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAddFournisseurActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
          // Se connecter
        Login log = new Login();
        log.setVisible(true);     
        dispose();
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void txtFRAISPORTCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFRAISPORTCMDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFRAISPORTCMDActionPerformed

    private void btnEFFACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEFFACERActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous effacer ces données","Attention",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
        
        txtDATECMD.setText("");
        txtFRAISPORTCMD.setText(""); 
}
    }//GEN-LAST:event_btnEFFACERActionPerformed
Connection con;
PreparedStatement pst;

// Mise a jour du niveau 
    private void tableUpdate(){
    int cpt;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/xprod", "root","");
        pst=con.prepareStatement("SELECT * FROM `commande`");
        ResultSet rs = null;
        try {
            rs = pst.executeQuery();
            }catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }      
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt= rsmd.getColumnCount();
            DefaultTableModel dtm =(DefaultTableModel)tableCOMMANDE.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector vect = new Vector();
                for (int i=1;i<= cpt; i++){
                    vect.add(rs.getString("IDCMD"));
                    vect.add(rs.getString("DATECMD"));
                    vect.add(rs.getString("FRAISPORTCMD"));
            }
        dtm.addRow(vect);
        }
             
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(CommandeClient.class.getName()).log(Level.SEVERE, null, ex);
    }
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
            java.util.logging.Logger.getLogger(CommandeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommandeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommandeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommandeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommandeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTERCOMM;
    private javax.swing.JButton btnEFFACER;
    private javax.swing.JButton btnMODIFIERCOMM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddFournisseur;
    private javax.swing.JMenuItem jMenuItemAddProduit;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBUserCommandeClient;
    private javax.swing.JTable tableCOMMANDE;
    private javax.swing.JTextField txtDATECMD;
    private javax.swing.JTextField txtFRAISPORTCMD;
    // End of variables declaration//GEN-END:variables

}