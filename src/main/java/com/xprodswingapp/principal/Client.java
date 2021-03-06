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
 * @author Priska DELORME
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        this.setTitle("Liste des Clients");
        setLocationRelativeTo(null);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCLIENT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNOM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPRENOM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtADRESSE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTEL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVILLE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPAYS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMOBILE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEMAIL = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnSUPPRIMER = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuAJOUTERFOUR = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAJOUTERCMD = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemAJOUTERUTILISATEUR = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemGERERLESCLIENTS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableCLIENT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Client", "Pr??nom", "Nom", "Adresse", "Code Postal", "Ville", "Pays", "T??l??phone", "Mobile", "Email"
            }
        ));
        tableCLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCLIENTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCLIENT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("LISTE DES CLIENTS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(115, 164, 209));
        jLabel12.setText("XPROD");

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Clients"));

        jLabel2.setText("Nom:");

        txtNOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMActionPerformed(evt);
            }
        });

        jLabel3.setText("Pr??nom:");

        txtPRENOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRENOMActionPerformed(evt);
            }
        });

        jLabel4.setText("Adresse:");

        txtADRESSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADRESSEActionPerformed(evt);
            }
        });

        jLabel5.setText("Ville:");

        txtTEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELActionPerformed(evt);
            }
        });

        jLabel6.setText("T??l??phone:");

        txtVILLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVILLEActionPerformed(evt);
            }
        });

        jLabel7.setText("Pays:");

        txtPAYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAYSActionPerformed(evt);
            }
        });

        jLabel9.setText("Mobile:");

        txtMOBILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMOBILEActionPerformed(evt);
            }
        });

        jLabel10.setText("Email:");

        txtEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMAILActionPerformed(evt);
            }
        });

        jLabel11.setText("Code Postal:");

        txtCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPActionPerformed(evt);
            }
        });

        btnAJOUTER.setText("Ajouter");
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAJOUTER)
                .addGap(18, 18, 18)
                .addComponent(btnMODIFIER)
                .addGap(18, 18, 18)
                .addComponent(btnSUPPRIMER)
                .addGap(52, 52, 52))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtADRESSE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtVILLE, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtMOBILE, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtTEL, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtPAYS, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtADRESSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMOBILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVILLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAJOUTER)
                    .addComponent(btnMODIFIER)
                    .addComponent(btnSUPPRIMER))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel1)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fournisseur");

        jMenuAJOUTERFOUR.setText("Ajouter un fournisseur");
        jMenuAJOUTERFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAJOUTERFOURActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAJOUTERFOUR);

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

        jMenu5.setText("Utilisateurs");

        jMenuItemAJOUTERUTILISATEUR.setText("Ajouter un utilisateur");
        jMenuItemAJOUTERUTILISATEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAJOUTERUTILISATEURActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemAJOUTERUTILISATEUR);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Gestion des clients");

        jMenuItemGERERLESCLIENTS.setText("G??rer les clients");
        jMenuItemGERERLESCLIENTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGERERLESCLIENTSActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemGERERLESCLIENTS);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMActionPerformed

    private void txtPRENOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRENOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRENOMActionPerformed

    private void txtADRESSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADRESSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADRESSEActionPerformed

    private void txtTELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELActionPerformed

    private void txtVILLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVILLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVILLEActionPerformed

    private void txtPAYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAYSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAYSActionPerformed

    private void txtMOBILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMOBILEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMOBILEActionPerformed

    private void txtEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMAILActionPerformed

    private void txtCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPActionPerformed

    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
       
        String prenomClient = txtPRENOM.getText();
        String nomClient = txtNOM.getText();
        String adresseClient = txtADRESSE.getText();
        String cpClient = txtCP.getText();
        String villeClient = txtVILLE.getText();
        String paysClient = txtPAYS.getText();
        String telClient = txtTEL.getText();
        String mobileClient = txtMOBILE.getText();
        String emailClient = txtEMAIL.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Enregistrer le driver JDBC
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("INSERT into clients (PRENOMCLIENT,NOMCLIENT,ADRESSECLIENT,CPCLIENT,VILLECLIENT,PAYSCLIENT,TELCLIENT,MOBILECLIENT,EMAILCLIENT) VALUES (?,?,?,?,?,?,?,?,?)");

            pst.setString(1, prenomClient);
            pst.setString(2, nomClient);
            pst.setString(3, adresseClient);
            pst.setString(4, cpClient);
            pst.setString(5, villeClient);
            pst.setString(6, paysClient);
            pst.setString(7, telClient);
            pst.setString(8, mobileClient);
            pst.setString(9, emailClient);

            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Client enregistr??");
            
                        
            txtPRENOM.setText("");
            txtNOM.setText("");
            txtADRESSE.setText("");
            txtCP.setText("");
            txtVILLE.setText("");
            txtPAYS.setText("");
            txtTEL.setText("");
            txtMOBILE.setText("");          
            txtEMAIL.setText("");
            
            tableUpdate();


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAJOUTERActionPerformed

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel)tableCLIENT.getModel();
            int selectedIndex = tableCLIENT.getSelectedRow();
            
            int idClient = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            String prenomClient = txtPRENOM.getText();
            String nomClient = txtNOM.getText();
            String adresseClient = txtADRESSE.getText();
            String cpClient = txtCP.getText();
            String villeClient = txtVILLE.getText();
            String paysClient = txtPAYS.getText();
            String telCP = txtTEL.getText();
            String mobileClient = txtMOBILE.getText();
            String emailClient = txtEMAIL.getText();

            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            
            pst = con.prepareStatement("update clients set PRENOMCLIENT=?, NOMCLIENT=?,ADRESSECLIENT=?,CPCLIENT=?,VILLECLIENT=?,PAYSCLIENT=?,TELCLIENT=?,MOBILECLIENT=?,EMAILCLIENT=? where IDCLIENT=?");
            pst.setString(1, prenomClient);
            pst.setString(2, nomClient);
            pst.setString(3, adresseClient);
            pst.setString(4, cpClient);
            pst.setString(5, villeClient);
            pst.setString(6, paysClient);
            pst.setString(7, telCP);
            pst.setString(8, mobileClient);
            pst.setString(9, emailClient);


            pst.setInt(10, idClient);
            
            pst.executeUpdate();
            tableUpdate();
            
            JOptionPane.showMessageDialog(this, "Informations Client misent ?? jour");
            
            txtPRENOM.setText("");
            txtNOM.setText("");
            txtADRESSE.setText("");
            txtCP.setText("");
            txtVILLE.setText("");
            txtPAYS.setText("");
            txtTEL.setText("");
            txtMOBILE.setText("");          
            txtEMAIL.setText("");

            tableUpdate();
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUPPRIMERActionPerformed
        // Supprimer

        DefaultTableModel dtm = (DefaultTableModel)tableCLIENT.getModel();
        int selectedIndex = tableCLIENT.getSelectedRow();

        int idClient = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer ce client ?", "Attention",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
                pst= con.prepareStatement("delete from clients where IDCLIENT=?");

                pst.setInt(1, idClient);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Client supprim??");

                //Je vide le contenu des champs remplis
                txtPRENOM.setText("");
                txtNOM.setText("");
                txtADRESSE.setText("");
                txtCP.setText("");
                txtVILLE.setText("");
                txtPAYS.setText("");
                txtTEL.setText("");
                txtMOBILE.setText("");
                txtEMAIL.setText("");


                tableUpdate();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSUPPRIMERActionPerformed

    private void tableCLIENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCLIENTMouseClicked
       DefaultTableModel dtm = (DefaultTableModel)tableCLIENT.getModel();
        int selectedIndex = tableCLIENT.getSelectedRow();
        
        txtPRENOM.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtNOM.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtADRESSE.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtCP.setText(dtm.getValueAt(selectedIndex, 4).toString());
        txtVILLE.setText(dtm.getValueAt(selectedIndex, 5).toString());
        txtPAYS.setText(dtm.getValueAt(selectedIndex, 6).toString());
        txtTEL.setText(dtm.getValueAt(selectedIndex, 7).toString());
        txtMOBILE.setText(dtm.getValueAt(selectedIndex, 8).toString());
        txtEMAIL.setText(dtm.getValueAt(selectedIndex, 9).toString());

    }//GEN-LAST:event_tableCLIENTMouseClicked

    private void jMenuItemGERERLESCLIENTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGERERLESCLIENTSActionPerformed
    Client clt = new Client();
    clt.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemGERERLESCLIENTSActionPerformed

    private void jMenuItemAJOUTERUTILISATEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAJOUTERUTILISATEURActionPerformed
        
        RegisterTableau reg = new RegisterTableau();
        reg.setVisible(true);

    }//GEN-LAST:event_jMenuItemAJOUTERUTILISATEURActionPerformed

    private void jMenuItemAJOUTERCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAJOUTERCMDActionPerformed
    
        Commande cmd = new Commande();
        cmd.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAJOUTERCMDActionPerformed

    private void jMenuAJOUTERFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAJOUTERFOURActionPerformed
        Fournisseur four = new Fournisseur();
        four.setVisible(true);

    }//GEN-LAST:event_jMenuAJOUTERFOURActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
        private void tableUpdate(){
       
        int cpt;
        
        try {
  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("SELECT * FROM clients");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel)tableCLIENT.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
            Vector vect = new Vector();
            
            for(int i=1;i<=cpt;i++){
                
            vect.add(rs.getString("IDCLIENT"));
            vect.add(rs.getString("PRENOMCLIENT"));
            vect.add(rs.getString("NOMCLIENT"));
            vect.add(rs.getString("ADRESSECLIENT"));
            vect.add(rs.getString("CPCLIENT"));
            vect.add(rs.getString("VILLECLIENT"));
            vect.add(rs.getString("PAYSCLIENT"));
            vect.add(rs.getString("TELCLIENT"));
            vect.add(rs.getString("MOBILECLIENT"));
            vect.add(rs.getString("EMAILCLIENT"));
       
            }
            dtm.addRow(vect);
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTER;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JButton btnSUPPRIMER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuAJOUTERFOUR;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAJOUTERCMD;
    private javax.swing.JMenuItem jMenuItemAJOUTERUTILISATEUR;
    private javax.swing.JMenuItem jMenuItemGERERLESCLIENTS;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCLIENT;
    private javax.swing.JTextField txtADRESSE;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtMOBILE;
    private javax.swing.JTextField txtNOM;
    private javax.swing.JTextField txtPAYS;
    private javax.swing.JTextField txtPRENOM;
    private javax.swing.JTextField txtTEL;
    private javax.swing.JTextField txtVILLE;
    // End of variables declaration//GEN-END:variables
}
