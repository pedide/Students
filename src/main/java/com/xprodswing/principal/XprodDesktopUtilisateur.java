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
 * @author phana
 * //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * JDBC URL jdbc:mysql://localhost:3306/xproddb?zeroDateTimeBehavior=CONVERT_TO_NULL
 *///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!





public class XprodDesktopUtilisateur extends javax.swing.JFrame {

    /**
     * Creates new form XprodDesktop
     */
    
    private String refProd;
    
    public XprodDesktopUtilisateur() {
        initComponents();
        this.setTitle("XProd gestion des produits Client");
        setLocationRelativeTo(null); //méthode pour centrer le contenu de ma fenetre
        tableUpdate(); //Met à jour la table des produits
        
        
    }

    //Afficher l'utilisateur
    public void afficherUser(String user){
        lblClient.setText("Bonjour "+user);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPRODUIT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtREFPRODUIT = new javax.swing.JTextField();
        txtDESIGNATIONPRODUIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDESCRIPTIFPRODUIT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPRIXUHTPRODUIT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        lblClient = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFournisseur = new javax.swing.JMenu();
        jMenuItemAddFournisseur = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        jMenuItemAddCommande = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabPRODUIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tabPRODUIT.setForeground(new java.awt.Color(102, 102, 102));
        tabPRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUIT", "REF", "DESIGNATION", "DESCRIPTIF", "PRIXUHT"
            }
        ));
        tabPRODUIT.setGridColor(new java.awt.Color(255, 255, 51));
        tabPRODUIT.setSelectionBackground(new java.awt.Color(102, 51, 255));
        tabPRODUIT.setSelectionForeground(new java.awt.Color(204, 255, 255));
        tabPRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPRODUIT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTE DES PRODUITS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Référence");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Désignation");

        txtREFPRODUIT.setForeground(new java.awt.Color(102, 102, 102));
        txtREFPRODUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREFPRODUITActionPerformed(evt);
            }
        });

        txtDESIGNATIONPRODUIT.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Descriptif");

        txtDESCRIPTIFPRODUIT.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("PrixUHT");

        txtPRIXUHTPRODUIT.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(txtDESCRIPTIFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtDESIGNATIONPRODUIT))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtREFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDESIGNATIONPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDESCRIPTIFPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPRIXUHTPRODUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAJOUTER.setBackground(new java.awt.Color(102, 51, 255));
        btnAJOUTER.setForeground(new java.awt.Color(204, 255, 255));
        btnAJOUTER.setText("Ajouter");
        btnAJOUTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAJOUTERActionPerformed(evt);
            }
        });

        btnMODIFIER.setBackground(new java.awt.Color(102, 51, 255));
        btnMODIFIER.setForeground(new java.awt.Color(204, 255, 255));
        btnMODIFIER.setText("Modifier");
        btnMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(btnAJOUTER)
                .addGap(102, 102, 102)
                .addComponent(btnMODIFIER)
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAJOUTER)
                    .addComponent(btnMODIFIER))
                .addContainerGap())
        );

        lblClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClient.setForeground(new java.awt.Color(102, 51, 255));
        lblClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClient.setText("Client");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(lblClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClient, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Admin");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItemFournisseur.setText("Fournisseur");
        jMenuItemFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFournisseurActionPerformed(evt);
            }
        });

        jMenuItemAddFournisseur.setBackground(new java.awt.Color(102, 51, 255));
        jMenuItemAddFournisseur.setForeground(new java.awt.Color(102, 51, 255));
        jMenuItemAddFournisseur.setText("Voir un fournisseur");
        jMenuItemAddFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddFournisseurActionPerformed(evt);
            }
        });
        jMenuItemFournisseur.add(jMenuItemAddFournisseur);

        jMenuBar1.add(jMenuItemFournisseur);

        jMenu.setText("Commande");

        jMenuItemAddCommande.setBackground(new java.awt.Color(102, 51, 255));
        jMenuItemAddCommande.setForeground(new java.awt.Color(102, 51, 255));
        jMenuItemAddCommande.setText("Voir une commande");
        jMenuItemAddCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCommandeActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemAddCommande);

        jMenuItem1.setBackground(new java.awt.Color(102, 51, 255));
        jMenuItem1.setForeground(new java.awt.Color(102, 51, 255));
        jMenuItem1.setText("Gestion commande");
        jMenu.add(jMenuItem1);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(531, 531, 531)
                    .addComponent(lblUser)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(419, 419, 419)
                    .addComponent(lblUser)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtREFPRODUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREFPRODUITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtREFPRODUITActionPerformed

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel();
            int selectedIndex = tabPRODUIT.getSelectedRow();
            
            int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString()); // integer.parseInt=> converti le type en entier
            String refProduit = txtREFPRODUIT.getText();
            String designationProduit = txtDESIGNATIONPRODUIT.getText();
            String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
            String prixuhtProduit = txtPRIXUHTPRODUIT.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Enregistre le driver
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root","");
            pst = con.prepareStatement("update produits set REF=?, DESIGNATION=?, DESCRIPTIF=?, PRIXUHT=? where IDPRODUIT=?");
            
            if(!refProduit.equals(refProd)){
                JOptionPane.showMessageDialog(this, "La référence ne peut être modifiée");
            }else{
            pst.setString(1, refProduit); //
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixuhtProduit);
            pst.setInt(5, idProduit); // attention Int
            }
            
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Données mise à jour");
            
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            
            tableUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnMODIFIERActionPerformed
     //Connection
        Connection con; //déclarre attribut "con" de type connection
        PreparedStatement pst; //déclare un attribut "pst" de type preparedStatement
        
        //Misa à jour du tableau
        private void tableUpdate(){
            int cpt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root",""); // Demande au DriverManager (gestionnaire de manager) de récupérer et de stocker les infos dans la variable con
                    pst = con.prepareStatement("SELECT * FROM produits");
                    ResultSet rs = pst.executeQuery();
                    ResultSetMetaData rsmd = rs.getMetaData();
                    cpt = rsmd.getColumnCount();
                    DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel();
                    dtm.setRowCount(0);
                    
                    while(rs.next()){
                        Vector  vect = new Vector();
                        
                        for(int i = 1; i <= cpt; i++){
                            vect.add(rs.getString("IDPRODUIT"));
                            vect.add(rs.getString("REF"));
                            vect.add(rs.getString("DESIGNATION"));
                            vect.add(rs.getString("DESCRIPTIf"));
                            vect.add(rs.getString("PRIXUHT"));
                            
                        }
                    dtm.addRow(vect);
                    }
                            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
       //Je récupère les informations des champs de texte via le bouton "ajouter"
       String refProduit = txtREFPRODUIT.getText();
       String designationProduit = txtDESIGNATIONPRODUIT.getText();
       String descriptifProduit = txtDESCRIPTIFPRODUIT.getText();
       String prixuhtProduit = txtPRIXUHTPRODUIT.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Récupère le driver jdbc dans une classe
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root","");
            pst=con.prepareStatement("INSERT INTO produits (REF, DESIGNATION, DESCRIPTIF, PRIXUHT) VALUES (?, ?, ?, ?)");
            
            
            pst.setString(1, refProduit); //
            pst.setString(2, designationProduit);
            pst.setString(3, descriptifProduit);
            pst.setString(4, prixuhtProduit);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Données enregistrées"); // pour afficher une fenetre
            
            //Pour vider le contenu des champs après avoir ajouter un objet
            txtREFPRODUIT.setText("");
            txtDESIGNATIONPRODUIT.setText("");
            txtDESCRIPTIFPRODUIT.setText("");
            txtPRIXUHTPRODUIT.setText("");
            
            tableUpdate();
            
        }   catch (SQLException ex) {
            Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAJOUTERActionPerformed

    private void jMenuItemFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFournisseurActionPerformed
        //Mauvais code
    }//GEN-LAST:event_jMenuItemFournisseurActionPerformed

    private void jMenuItemAddCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCommandeActionPerformed
         // ajout d'un nouveau fournisseur
        CommandeUtilisateur newCmd = new CommandeUtilisateur ();
        newCmd.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCommandeActionPerformed

    private void jMenuItemAddFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddFournisseurActionPerformed
        // ajout d'un nouveau fournisseur
        FournisseurUtilisateur newFour = new FournisseurUtilisateur ();
        newFour.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAddFournisseurActionPerformed

    private void tabPRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPRODUITMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tabPRODUIT.getModel();
        int selectedIndex = tabPRODUIT.getSelectedRow();
        
        txtREFPRODUIT.setText(dtm.getValueAt(selectedIndex, 1).toString()); //récupere les données dans dtm, la valeur 1 dans le champs selectionné
        txtDESIGNATIONPRODUIT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIFPRODUIT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHTPRODUIT.setText(dtm.getValueAt(selectedIndex, 4).toString());
        
        refProd = txtREFPRODUIT.getText();
    }//GEN-LAST:event_tabPRODUITMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XprodDesktopUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTER;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAddCommande;
    private javax.swing.JMenuItem jMenuItemAddFournisseur;
    private javax.swing.JMenu jMenuItemFournisseur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tabPRODUIT;
    private javax.swing.JTextField txtDESCRIPTIFPRODUIT;
    private javax.swing.JTextField txtDESIGNATIONPRODUIT;
    private javax.swing.JTextField txtPRIXUHTPRODUIT;
    private javax.swing.JTextField txtREFPRODUIT;
    // End of variables declaration//GEN-END:variables
}
