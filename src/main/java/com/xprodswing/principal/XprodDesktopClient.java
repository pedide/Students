/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.xprodswing.principal;

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
 * @author 77011-26-01
 */
public class XprodDesktopClient extends javax.swing.JFrame {

    /**
     * Creates new form XprodDesktop
     */
    public XprodDesktopClient() {
        initComponents();
        this.setTitle("XProd gestions des produits - Clients");//creer un titre
        setLocationRelativeTo(null);//pour centrer le contenu de ma fenêtre
        tableUpdate();//mettre à jour ma table des produits
    }

    //Afficher l'utilisateur
    public void afficherUser(String user){
        lbUSERCLIENT.setText("Bienvenue : "+user);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePRODUIT = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDESCRIPTIFPRODUIT = new javax.swing.JTextField();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnADD = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        lbUSERCLIENT = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAddFournisseur = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAddCommande = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("LISTE DES PRODUITS");

        tablePRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUIT", "REF", "DESIGNATION", "DESCRIPTIF", "PRIXUHT"
            }
        ));
        tablePRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePRODUIT);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Infos Produits"));

        jLabel2.setText("REF");

        txtREFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREFPRODUITActionPerformed(evt);
            }
        });

        jLabel3.setText("DESIGNATION");

        jLabel4.setText("DESCRIPTIF");

        jLabel5.setText("PRIX U HT");

        txtDESCRIPTIFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESCRIPTIFPRODUITActionPerformed(evt);
            }
        });

        txtPRIXUHTPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRIXUHTPRODUITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(txtREFPRODUIT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDESCRIPTIFPRODUIT)
                            .addComponent(txtPRIXUHTPRODUIT))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDESCRIPTIFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        btnADD.setText("AJOUTER");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnMODIFIER.setText("MODIFIER");
        btnMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERActionPerformed(evt);
            }
        });

        btnDELETE.setText("SUPPRIMER");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADD)
                .addGap(18, 18, 18)
                .addComponent(btnMODIFIER)
                .addGap(18, 18, 18)
                .addComponent(btnDELETE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD)
                    .addComponent(btnMODIFIER)
                    .addComponent(btnDELETE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lbUSERCLIENT.setText("Client");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(lbUSERCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbUSERCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 153));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fournisseur");

        jMenuItemAddFournisseur.setText("Ajouter un fournisseur");
        jMenuItemAddFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddFournisseurActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddFournisseur);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Commande");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItemAddCommande.setText("Voir commande");
        jMenuItemAddCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCommandeActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAddCommande);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtREFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtREFPRODUITActionPerformed

    private void txtDESCRIPTIFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESCRIPTIFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESCRIPTIFPRODUITActionPerformed

    private void txtPRIXUHTPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRIXUHTPRODUITActionPerformed
        // TODO add your handling code here:
    }  
    
    //connection
    Connection con;
    PreparedStatement pst; //var qui va preparer des instructions
    
    //Mise à jour tableau
    private void tableUpdate(){
    
        int cpt;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root", ""); 
            pst = con.prepareStatement("SELECT * FROM produits"); //preparation de la requete
            ResultSet rs = pst.executeQuery(); //execute la requete sql - ResultSet est memoire temporaire pour stocker rs
        
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            DefaultTableModel dtm =(DefaultTableModel)tablePRODUIT.getModel(); //on va recuperer le resultat ds un model 
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector vect = new Vector(); //creer un vecteur

                for(int i=1; i<=cpt; i++){
                    vect.add(rs.getString("IDPRODUIT"));
                    vect.add(rs.getString("REF"));
                    vect.add(rs.getString("DESIGNATION"));
                    vect.add(rs.getString("DESCRIPTIF"));
                    vect.add(rs.getString("PRIXUHT"));
                }

                dtm.addRow(vect);
            }
        }catch (ClassNotFoundException ex){
            Logger.getLogger(XprodDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(XprodDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_txtPRIXUHTPRODUITActionPerformed

    
    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
       //je recupère les infos des champs texte saisie et on le met ds refProduit par ex
       String refPoduit = txtREFPRODUIT.getText();
       String designationProduit = txtDESIGNATIONPRODUIT.getText();
       String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
       String prixUHTProduit = txtPRIXUHTPRODUIT.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//enregistrer le driver ds JDBC
            // System.out.println("classe forname");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            
            System.out.println("connexion réussie");
            
            pst = con.prepareStatement("INSERT INTO produits (REF, DESIGNATION, DESCRIPTIF, PRIXUHT)"
                    +"VALUES (?, ?, ?, ?)");//inserer les donnees ds ma bd
            pst.setString(1, refPoduit);
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixUHTProduit);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Les données ont été enregistrés ");
            
            //je vide le contenu des champs remplis apres saisie
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
        // modification
        //pour selectionner les informations d'un champ
        DefaultTableModel dtm =(DefaultTableModel)tablePRODUIT.getModel(); //on va recuperer le resultat ds un model 
        int selectedIndex = tablePRODUIT.getSelectedRow();
        
        try {
            int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            
            //je recupère les infos des champs texte saisie et on le met ds refProduit par ex
            String refProduit = txtREFPRODUIT.getText();
            String designationProduit = txtDESIGNATIONPRODUIT.getText();
            String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
            String prixUHTProduit = txtPRIXUHTPRODUIT.getText();
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root", ""); 
            
            pst = con.prepareStatement("Update produits set REF=?, DESIGNATION=?, DESCRIPTIF=?, PRIXUHT=? where IDPRODUIT=?");
            
            pst.setString(1, refProduit);
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixUHTProduit);  
            pst.setInt(5, idProduit); 
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Les données ont été mise à jour !");
            
            //je vide le contenu des champs remplis apres saisie
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            //j'actualise mon tableau
            tableUpdate();
            
        }catch (ClassNotFoundException ex){
            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
////            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void jMenuItemAddFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddFournisseurActionPerformed
        // ajouter un nouveau fournisseur
        Fournisseur newFour = new Fournisseur();
        //rendre visible ma fenetre newFour
        newFour.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAddFournisseurActionPerformed

    //il ne sert à rien erreur de code
    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItemAddCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCommandeActionPerformed
         //Ajouter une nouvelle commande
        Commande newCom = new Commande();
        //rendre visible ma fenetre newCom
        newCom.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCommandeActionPerformed

    private void tablePRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePRODUITMouseClicked
        //pour selectionner les informations d'un champ
        DefaultTableModel dtm =(DefaultTableModel)tablePRODUIT.getModel(); //on va recuperer le resultat ds un model 
        int selectedIndex = tablePRODUIT.getSelectedRow();

            txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString());
            txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
            txtDESCRIPTIFPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
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
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XprodDesktopClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddCommande;
    private javax.swing.JMenuItem jMenuItemAddFournisseur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbUSERCLIENT;
    private javax.swing.JTable tablePRODUIT;
    private javax.swing.JTextField txtDESCRIPTIFPRODUIT;
    private javax.swing.JTextField txtDESIGNATIONPRODUIT;
    private javax.swing.JTextField txtPRIXUHTPRODUIT;
    private javax.swing.JTextField txtREFPRODUIT;
    // End of variables declaration//GEN-END:variables
}
