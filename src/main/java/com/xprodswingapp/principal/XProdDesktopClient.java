/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.xprodswingapp.principal;

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
 * @author Priska DELORME
 */
public class XProdDesktopClient extends javax.swing.JFrame {

    /**
     * Creates new form XProdDesktopClient
     */
    public XProdDesktopClient() {
        initComponents();
        this.setTitle("XPROD: Gestion des produits");
        setLocationRelativeTo(null);//pour centre le contenu dans la page
        tableUpdate();
    }

    
    //Afficher l'utilisateur
    public void afficherUser(String user){
    lblUSER.setText(user);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        txtDESCRIPTIONPRODUIT = new javax.swing.JTextField();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnNOUVEAU = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblUSER = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePRODUIT = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATA"));

        jLabel3.setText("Ref:");

        txtDESIGNATIONPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESIGNATIONPRODUITActionPerformed(evt);
            }
        });

        jLabel4.setText("Designation:");

        txtREFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREFPRODUITActionPerformed(evt);
            }
        });

        jLabel5.setText("Description:");

        jLabel7.setText("Prix UHT:");

        txtPRIXUHTPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRIXUHTPRODUITActionPerformed(evt);
            }
        });

        txtDESCRIPTIONPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESCRIPTIONPRODUITActionPerformed(evt);
            }
        });

        btnAJOUTER.setText("Ajouter");
        btnAJOUTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAJOUTERMouseClicked(evt);
            }
        });
        btnAJOUTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAJOUTERActionPerformed(evt);
            }
        });

        btnMODIFIER.setText("Modifier");
        btnMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERActionPerformed(evt);
            }
        });

        btnNOUVEAU.setText("Nouveau");
        btnNOUVEAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOUVEAUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDESCRIPTIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAJOUTER)
                        .addGap(61, 61, 61)
                        .addComponent(btnMODIFIER)
                        .addGap(66, 66, 66)
                        .addComponent(btnNOUVEAU)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(txtDESCRIPTIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAJOUTER)
                    .addComponent(btnMODIFIER)
                    .addComponent(btnNOUVEAU))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(115, 164, 209));
        jLabel12.setText("XPROD");

        lblUSER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSER.setText("Client");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("LISTE DES PRODUITS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(lblUSER))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUSER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des produits", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tablePRODUIT.setBackground(new java.awt.Color(250, 250, 250));
        tablePRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Produit", "R??f??rence", "Designation", "Description", "Prix UHT"
            }
        ));
        tablePRODUIT.setGridColor(new java.awt.Color(204, 204, 204));
        tablePRODUIT.setSelectionBackground(new java.awt.Color(115, 164, 209));
        tablePRODUIT.setShowGrid(true);
        tablePRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePRODUIT);
        if (tablePRODUIT.getColumnModel().getColumnCount() > 0) {
            tablePRODUIT.getColumnModel().getColumn(2).setResizable(false);
            tablePRODUIT.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDESIGNATIONPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESIGNATIONPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESIGNATIONPRODUITActionPerformed

    private void txtREFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtREFPRODUITActionPerformed

    private void txtPRIXUHTPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRIXUHTPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRIXUHTPRODUITActionPerformed

    private void txtDESCRIPTIONPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESCRIPTIONPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESCRIPTIONPRODUITActionPerformed

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
 try {
            DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
            int selectedIndex = tablePRODUIT.getSelectedRow();
            
            int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            String refProduit = txtREFPRODUIT.getText();
            String designationProduit = txtDESIGNATIONPRODUIT.getText();
            String descriptionProduit = txtDESCRIPTIONPRODUIT.getText();
            String prixUHTProduit = txtPRIXUHTPRODUIT.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            
            pst = con.prepareStatement("update produits set REF=?, DESIGNATION=?,DESCRIPTION=?,PRIXUHT=? where IDPRODUIT=?");
            pst.setString(1, refProduit);
            pst.setString(2, designationProduit);
            pst.setString(3, descriptionProduit);
            pst.setString(4, prixUHTProduit);
            pst.setInt(5, idProduit);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Donn??es misent ?? jour");
            
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIONPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            tableUpdate();
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnAJOUTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAJOUTERMouseClicked

    }//GEN-LAST:event_btnAJOUTERMouseClicked

    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
              // Je recupere les infos des champs de texte

        String refProduit = txtREFPRODUIT.getText();
        String designationProduit = txtDESIGNATIONPRODUIT.getText();
        String descriptionProduit = txtDESCRIPTIONPRODUIT.getText();
        String prixUHTProduit = txtPRIXUHTPRODUIT.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Enregistrer le driver JDBC
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("INSERT into produits (REF,DESIGNATION,DESCRIPTION,PRIXUHT) VALUES (?,?,?,?)");
            pst.setString(1, refProduit);
            pst.setString(2, designationProduit);
            pst.setString(3, descriptionProduit);
            pst.setString(4, prixUHTProduit);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Donn??es enregistr??es");

            //Je vide le contenu des champs remplis
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIONPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");

            //Actualise ma Table
            tableUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAJOUTERActionPerformed

    private void btnNOUVEAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOUVEAUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOUVEAUActionPerformed

    private void tablePRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePRODUITMouseClicked
           DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();

        txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHTPRODUIT.setText(dtm.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tablePRODUITMouseClicked

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
            java.util.logging.Logger.getLogger(XProdDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XProdDesktopClient().setVisible(true);
            }
        });
    }
   //Connection
    Connection con;
    PreparedStatement pst;
    
    private void tableUpdate(){
       
        int cpt;
        
        try {
  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("SELECT * FROM produits");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
            Vector vect = new Vector();
            
            for(int i=1;i<=cpt;i++){
            vect.add(rs.getString("IDPRODUIT"));
            vect.add(rs.getString("REF"));
            vect.add(rs.getString("DESIGNATION"));
            vect.add(rs.getString("DESCRIPTION"));
            vect.add(rs.getString("PRIXUHT"));
       
            }
            dtm.addRow(vect);
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XProdDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(XProdDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTER;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JButton btnNOUVEAU;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUSER;
    private javax.swing.JTable tablePRODUIT;
    private javax.swing.JTextField txtDESCRIPTIONPRODUIT;
    private javax.swing.JTextField txtDESIGNATIONPRODUIT;
    private javax.swing.JTextField txtPRIXUHTPRODUIT;
    private javax.swing.JTextField txtREFPRODUIT;
    // End of variables declaration//GEN-END:variables
}
