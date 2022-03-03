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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prisk
 */
public class XProdDesktopAdministrateur extends javax.swing.JFrame {

    /**
     * Creates new form XProdDesktopAdministrateur
     */
    public XProdDesktopAdministrateur() {
        initComponents();
        this.setTitle("XPROD: Gestion des produits");
        setLocationRelativeTo(null);//pour centre le contenu
        tableUpdate();

    }
    /////////////////// Connection ///////////////////
    Connection con;
    PreparedStatement pst;
    //////////////////////////////////////////////////
    
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
        lblUSER = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        txtDESCRIPTIONPRODUIT = new javax.swing.JTextField();
        btnNOUVEAU = new javax.swing.JButton();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnSUPPRIMER = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePRODUIT = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAJOUTERFOURNISSEUR = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAJOUTERCMD = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemAJOUTERUTILISATEUR = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemGERERCLIENTS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblUSER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSER.setText("Admin");

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

        btnNOUVEAU.setText("Nouveau");
        btnNOUVEAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOUVEAUActionPerformed(evt);
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

        btnSUPPRIMER.setText("Supprimer");
        btnSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUPPRIMERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnNOUVEAU)
                        .addGap(18, 18, 18)
                        .addComponent(btnAJOUTER)
                        .addGap(14, 14, 14)
                        .addComponent(btnMODIFIER)
                        .addGap(18, 18, 18)
                        .addComponent(btnSUPPRIMER)))
                .addContainerGap(118, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNOUVEAU)
                    .addComponent(btnAJOUTER)
                    .addComponent(btnMODIFIER)
                    .addComponent(btnSUPPRIMER))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(115, 164, 209));
        jLabel12.setText("XPROD ADMIN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("LISTE DES FOURNISSEURS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lblUSER))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUSER)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des produits"));

        tablePRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Produit", "Référence", "Designation", "Description", "Prix UHT"
            }
        ));
        tablePRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePRODUIT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fournisseur");

        jMenuItemAJOUTERFOURNISSEUR.setText("Ajouter un Fournisseur");
        jMenuItemAJOUTERFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAJOUTERFOURNISSEURActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAJOUTERFOURNISSEUR);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Commande");

        jMenuItemAJOUTERCMD.setText("Ajouter une commande");
        jMenuItemAJOUTERCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAJOUTERCMDActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAJOUTERCMD);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Utilisateur");

        jMenuItemAJOUTERUTILISATEUR.setText("Ajouter un utilisateur");
        jMenuItemAJOUTERUTILISATEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAJOUTERUTILISATEURActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemAJOUTERUTILISATEUR);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Gestion des clients");

        jMenuItemGERERCLIENTS.setText("Gérer les clients");
        jMenuItemGERERCLIENTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGERERCLIENTSActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemGERERCLIENTS);

        jMenuBar1.add(jMenu6);

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

    
        //Afficher l'utilisateur
    public void afficherUser(String user){
    lblUSER.setText(user);

            }
    
    
    
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

    private void tablePRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePRODUITMouseClicked

        DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();
        
        txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHTPRODUIT.setText(dtm.getValueAt(selectedIndex, 4).toString());

    }//GEN-LAST:event_tablePRODUITMouseClicked

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
            
            JOptionPane.showMessageDialog(this, "Les données du produit ont été misent à jour");
            
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIONPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            tableUpdate();
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnAJOUTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAJOUTERMouseClicked
   

    }//GEN-LAST:event_btnAJOUTERMouseClicked

    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
        // TODO add your handling code here:
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

            JOptionPane.showMessageDialog(this, "Le Produit a été ajouté");

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

    private void btnSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUPPRIMERActionPerformed
        // Supprimer

        DefaultTableModel dtm = (DefaultTableModel)tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();

        int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer ce produit", "Attention",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
                pst= con.prepareStatement("delete from produits where IDPRODUIT=?");

                pst.setInt(1, idProduit);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Produits supprimés");

                //Je vide le contenu des champs remplis
                txtREFPRODUIT.setText("");
                txtDESIGNATIONPRODUIT.setText("");
                txtDESCRIPTIONPRODUIT.setText("");
                txtPRIXUHTPRODUIT.setText("");

                tableUpdate();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSUPPRIMERActionPerformed

    private void btnNOUVEAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOUVEAUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOUVEAUActionPerformed

    private void jMenuItemAJOUTERFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAJOUTERFOURNISSEURActionPerformed
    
        Fournisseur four = new Fournisseur();
        four.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAJOUTERFOURNISSEURActionPerformed

    private void jMenuItemAJOUTERCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAJOUTERCMDActionPerformed
    Commande cmd = new Commande();
    cmd.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAJOUTERCMDActionPerformed

    private void jMenuItemAJOUTERUTILISATEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAJOUTERUTILISATEURActionPerformed
        RegisterTableau reg = new RegisterTableau();
        reg.setVisible(true);
    
    }//GEN-LAST:event_jMenuItemAJOUTERUTILISATEURActionPerformed

    private void jMenuItemGERERCLIENTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGERERCLIENTSActionPerformed
        Client clt = new Client();
        clt.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemGERERCLIENTSActionPerformed

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
            java.util.logging.Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XProdDesktopAdministrateur().setVisible(true);
            }
        });
    }
    
        
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
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(XProdDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTER;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JButton btnNOUVEAU;
    private javax.swing.JButton btnSUPPRIMER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAJOUTERCMD;
    private javax.swing.JMenuItem jMenuItemAJOUTERFOURNISSEUR;
    private javax.swing.JMenuItem jMenuItemAJOUTERUTILISATEUR;
    private javax.swing.JMenuItem jMenuItemGERERCLIENTS;
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