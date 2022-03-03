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
 * @author philippe
 */
public class XprodDesktopAdministrateur extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    /**
     * Creates new form XprodDesktop
     */
   
    
    public XprodDesktopAdministrateur() {
        initComponents();
        this.setTitle("XProd gestion des produits");
        setLocationRelativeTo(null); // pour centrer le contenu de ma fenetre
        tableUpdate();// Mettre a jour la table des produits
    }
    
    //afficher l'utilisateur
   public void afficherUser(String user){
   lblUser.setText("bienvenue"+user);
   }

    
    
    
//private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {}

        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        txtDESCRIPTIONPRODUIT = new javax.swing.JTextField();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNouveauProduit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePRODUIT = new javax.swing.JTable();
        lblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAddFournisseur = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAddCommande = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Liste des Produits");

        txtREFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREFPRODUITActionPerformed(evt);
            }
        });

        jLabel2.setText("REF");

        jLabel3.setText("Designation");

        jLabel4.setText("Description");

        jLabel5.setText("Prix UHT");

        txtDESIGNATIONPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESIGNATIONPRODUITActionPerformed(evt);
            }
        });

        btnAdd.setText("AJOUTER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("MODIFIER");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("SUPPRIMER");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNouveauProduit.setText("NOUVEAU");

        tablePRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PRODUIT", "REF", "DESIGNATION PRODUIT", "DESCRIPTIF", "PRIX UHT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePRODUITMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePRODUIT);

        lblUser.setText("admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(105, 105, 105)
                                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addGap(51, 51, 51))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(72, 72, 72)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDESIGNATIONPRODUIT)
                                        .addComponent(txtDESCRIPTIONPRODUIT)
                                        .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(58, 58, 58)
                                        .addComponent(btnUpdate)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnDelete)
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNouveauProduit)
                                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDESCRIPTIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNouveauProduit)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItemAddFournisseur.setText("Fournisseur");

        jMenuItem3.setText("Ajouter un fournisseur");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuItemAddFournisseur.add(jMenuItem3);

        jMenuBar1.add(jMenuItemAddFournisseur);

        jMenu4.setText("Commandes");

        jMenuItemAddCommande.setText("Ajouter commande");
        jMenuItemAddCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCommandeActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAddCommande);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Utilisateurs");
        jMenuBar1.add(jMenu3);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtREFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtREFPRODUITActionPerformed

    private void tableUpdate() {
        try {
            int cpt;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb", "root","");
            pst = pst = con.prepareStatement("SELECT * FROM produit");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            
           DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel(); 
            dtm.setRowCount(0);
            
             while(rs.next()){
                Vector vect = new Vector();
                
            for (int i =1; i<= cpt; i++){
                vect.add(rs.getString("idProd"));
                vect.add(rs.getString("refProd"));
                vect.add(rs.getString("DesignationProd"));
                vect.add(rs.getString("Descriptif"));
                vect.add(rs.getString("PrixVenteUHT"));
                
             }
            dtm.addRow(vect);
                
            
            }
             
              
          
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    private void txtDESIGNATIONPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESIGNATIONPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESIGNATIONPRODUITActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
                
                //Je récupère les infos des champs de texte        
                String refProduit = txtREFPRODUIT.getText();
                String designationProduit = txtDESIGNATIONPRODUIT.getText();
                String descriptifProduit = txtDESCRIPTIONPRODUIT.getText();
                String prixUHTProduit = txtPRIXUHTPRODUIT.getText();
                
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Enregistrer le driver JDBC
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
            pst=con.prepareStatement("INSERT INTO produit (RefProd,DesignationProd,Descriptif,PrixVenteUHT) VALUES (?,?,?,?)");
            pst.setString(1,refProduit);
            pst.setString(2,designationProduit);
            pst.setString(3,descriptifProduit);
            pst.setString(4,prixUHTProduit);

    pst.executeUpdate();
    JOptionPane.showMessageDialog(this,"Données enregistrées");

        // je vide le contenu des champs
    txtREFPRODUIT.setText("");
    txtDESIGNATIONPRODUIT.setText("");
    txtDESCRIPTIONPRODUIT.setText("");
    txtPRIXUHTPRODUIT.setText(""); 
tableUpdate();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
            // bouton modification
            DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
            int selectedIndex = tablePRODUIT.getSelectedRow();
            
        
        try {
            int idProd = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            
            String refProduit = txtREFPRODUIT.getText();
            String designationProduit = txtDESIGNATIONPRODUIT.getText();
            String descriptifProduit = txtDESCRIPTIONPRODUIT.getText();
            String prixUHTProduit = txtPRIXUHTPRODUIT.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
            pst = con.prepareStatement("update produit set RefProd=?, DesignationProd=?, Descriptif=?, PrixVenteUHT=? where IdProd=?");
            pst.setString(1, refProduit);
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixUHTProduit);
            pst.setInt(5, idProd);
           
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Données mis a jour");
    
    
    txtREFPRODUIT.setText("");
    txtDESIGNATIONPRODUIT.setText("");
    txtDESCRIPTIONPRODUIT.setText("");
    txtPRIXUHTPRODUIT.setText("");
    tableUpdate();
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Ajout d'un nouveau fournisseur
        Fournisseur newFour = new Fournisseur();
        newFour.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemAddCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCommandeActionPerformed
        // Ajout d'une nouvelle commande:
        Commande newCmd = new Commande();
        newCmd.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCommandeActionPerformed

    private void tablePRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePRODUITMouseClicked
         // Pour selectionner les informations d'un champ
        DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();
        
        txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHTPRODUIT.setText(dtm.getValueAt(selectedIndex, 4).toString());
        
    }//GEN-LAST:event_tablePRODUITMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // bouton supprimer
        DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();
        
        int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette donnée ?","Attention",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION){
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
                
                pst = con.prepareStatement("delete from produit where idProd=?");
                
                pst.setInt(1, idProduit);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Donnée supprimée !");
                
                    // je vide le contenu des champs
    txtREFPRODUIT.setText("");
    txtDESIGNATIONPRODUIT.setText("");
    txtDESCRIPTIONPRODUIT.setText("");
    txtPRIXUHTPRODUIT.setText(""); 
    
    tableUpdate();
                
                
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
                
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XprodDesktopAdministrateur().setVisible(true);
            
        }
        });
                }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNouveauProduit;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAddCommande;
    private javax.swing.JMenu jMenuItemAddFournisseur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tablePRODUIT;
    private javax.swing.JTextField txtDESCRIPTIONPRODUIT;
    private javax.swing.JTextField txtDESIGNATIONPRODUIT;
    private javax.swing.JTextField txtPRIXUHTPRODUIT;
    private javax.swing.JTextField txtREFPRODUIT;
    // End of variables declaration//GEN-END:variables
        }
                
               
                
                

