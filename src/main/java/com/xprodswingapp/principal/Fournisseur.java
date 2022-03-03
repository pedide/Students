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
public class Fournisseur extends javax.swing.JFrame {

    /**
     * Creates new form Fournisseur
     */
    public Fournisseur() {
        initComponents();
        this.setTitle("XPROD: Gestion des fournisseurs");
        setLocationRelativeTo(null);
        tableUpdate();
    }

    
    Connection con;
    PreparedStatement pst;
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
        tableFOUR = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNOMFOUR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRSFOUR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPAYSFOUR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCPFOUR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtVILLEFOUR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTELFOUR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFAXFOUR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEMAILFOUR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtADRESSEFOUR = new javax.swing.JTextField();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnSUPPRIMER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableFOUR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Fournisseur", "Nom", "Raison Sociale", "Adresse", "Code Postal", "Ville", "Pays", "Téléphone", "Fax", "Email"
            }
        ));
        tableFOUR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFOURMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFOUR);

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
        jLabel1.setText("LISTE DES FOURNISSEURS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(115, 164, 209));
        jLabel12.setText("XPROD");

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Fournisseurs"));

        jLabel2.setText("Nom:");

        txtNOMFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMFOURActionPerformed(evt);
            }
        });

        jLabel4.setText("Raison Sociale:");

        txtRSFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRSFOURActionPerformed(evt);
            }
        });

        jLabel5.setText("Code Postal:");

        txtPAYSFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAYSFOURActionPerformed(evt);
            }
        });

        jLabel6.setText("Pays:");

        txtCPFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFOURActionPerformed(evt);
            }
        });

        jLabel7.setText("Ville:");

        txtVILLEFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVILLEFOURActionPerformed(evt);
            }
        });

        jLabel8.setText("Téléphone:");

        txtTELFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELFOURActionPerformed(evt);
            }
        });

        jLabel9.setText("Fax:");

        txtFAXFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAXFOURActionPerformed(evt);
            }
        });

        jLabel10.setText("Email:");

        txtEMAILFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMAILFOURActionPerformed(evt);
            }
        });

        jLabel11.setText("Adresse:");

        txtADRESSEFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADRESSEFOURActionPerformed(evt);
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
                    .addComponent(txtADRESSEFOUR)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNOMFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtRSFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(txtCPFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtVILLEFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEMAILFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtFAXFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtTELFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtPAYSFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOMFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAYSFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRSFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTELFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtADRESSEFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFAXFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEMAILFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVILLEFOUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(479, 479, 479)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

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

    private void txtNOMFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMFOURActionPerformed

    private void txtRSFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRSFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRSFOURActionPerformed

    private void txtPAYSFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAYSFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAYSFOURActionPerformed

    private void txtCPFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFOURActionPerformed

    private void txtVILLEFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVILLEFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVILLEFOURActionPerformed

    private void txtTELFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELFOURActionPerformed

    private void txtFAXFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAXFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAXFOURActionPerformed

    private void txtEMAILFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMAILFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMAILFOURActionPerformed

    private void txtADRESSEFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADRESSEFOURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADRESSEFOURActionPerformed

    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
        String nomFour = txtNOMFOUR.getText();
        String rsFour = txtRSFOUR.getText();
        String adresseFour = txtADRESSEFOUR.getText();
        String cpFour = txtCPFOUR.getText();
        String villeFour = txtVILLEFOUR.getText();
        String paysFour = txtPAYSFOUR.getText();
        String telFour = txtTELFOUR.getText();
        String faxFour = txtFAXFOUR.getText();
        String emailFour = txtEMAILFOUR.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Enregistrer le driver JDBC
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("INSERT into fournisseurs (NOMFOUR,RSFOUR,ADRESSEFOUR,CPFOUR,VILLEFOUR,PAYSFOUR,TELFOUR,FAXFOUR,EMAILFOUR) VALUES (?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, nomFour);
            pst.setString(2, rsFour);
            pst.setString(3, adresseFour);
            pst.setString(4, cpFour);
            pst.setString(5, villeFour);
            pst.setString(6, paysFour);
            pst.setString(7, telFour);
            pst.setString(8, faxFour);
            pst.setString(9, emailFour);

            pst.executeUpdate();
    
            JOptionPane.showMessageDialog(this, "Le fournisseur a été ajouté");
            
            txtNOMFOUR.setText("");
            txtRSFOUR.setText("");
            txtADRESSEFOUR.setText("");
            txtCPFOUR.setText("");
            txtVILLEFOUR.setText("");
            txtPAYSFOUR.setText("");
            txtTELFOUR.setText("");
            txtFAXFOUR.setText("");
            txtEMAILFOUR.setText("");

            tableUpdate();


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAJOUTERActionPerformed

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
    
        try {
            DefaultTableModel dtm = (DefaultTableModel)tableFOUR.getModel();
            int selectedIndex = tableFOUR.getSelectedRow();
            
            int idFour = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            String nomFour = txtNOMFOUR.getText();
            String rsFour = txtRSFOUR.getText();
            String adresseFour = txtADRESSEFOUR.getText();
            String cpFour = txtCPFOUR.getText();
            String villeFour = txtVILLEFOUR.getText();
            String paysFour = txtPAYSFOUR.getText();
            String telFour = txtTELFOUR.getText();
            String faxFour = txtFAXFOUR.getText();
            String emailFour = txtEMAILFOUR.getText();


            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            
            pst = con.prepareStatement("update fournisseurs set NOMFOUR=?, RSFOUR=?,ADRESSEFOUR=?, CPFOUR=?,VILLEFOUR=?, PAYSFOUR=?, TELFOUR=?,FAXFOUR=?, EMAILFOUR=? where IDFOUR=?");
            pst.setString(1, nomFour);
            pst.setString(2, rsFour);
            pst.setString(3, adresseFour);
            pst.setString(4, cpFour);
            pst.setString(5, villeFour);
            pst.setString(6, paysFour);
            pst.setString(7, telFour);
            pst.setString(8, faxFour);
            pst.setString(9, emailFour);
            
            pst.setInt(10, idFour);

            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Les informations du fournisseur ont été misent à jour");
            
            txtNOMFOUR.setText("");
            txtRSFOUR.setText("");
            txtADRESSEFOUR.setText("");
            txtCPFOUR.setText("");
            txtVILLEFOUR.setText("");
            txtPAYSFOUR.setText("");
            txtTELFOUR.setText("");
            txtFAXFOUR.setText("");
            txtEMAILFOUR.setText("");

            tableUpdate();
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUPPRIMERActionPerformed
        // Supprimer

        DefaultTableModel dtm = (DefaultTableModel)tableFOUR.getModel();
        int selectedIndex = tableFOUR.getSelectedRow();

        int idFour = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette ?", "Attention",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
                pst= con.prepareStatement("delete from fournisseurs where IDFOUR=?");

                pst.setInt(1, idFour);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Le fournisseur a été supprimé");

                //Je vide le contenu des champs remplis
                txtNOMFOUR.setText("");
                txtRSFOUR.setText("");
                txtADRESSEFOUR.setText("");
                txtCPFOUR.setText("");
                txtVILLEFOUR.setText("");
                txtPAYSFOUR.setText("");
                txtTELFOUR.setText("");
                txtFAXFOUR.setText("");
                txtEMAILFOUR.setText("");


                tableUpdate();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSUPPRIMERActionPerformed

    private void tableFOURMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFOURMouseClicked
        DefaultTableModel dtm = (DefaultTableModel)tableFOUR.getModel();
        int selectedIndex = tableFOUR.getSelectedRow();
        
        txtNOMFOUR.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtRSFOUR.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtADRESSEFOUR.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtCPFOUR.setText(dtm.getValueAt(selectedIndex, 4).toString());
        txtVILLEFOUR.setText(dtm.getValueAt(selectedIndex, 5).toString());
        txtPAYSFOUR.setText(dtm.getValueAt(selectedIndex, 6).toString());
        txtTELFOUR.setText(dtm.getValueAt(selectedIndex, 7).toString());
        txtFAXFOUR.setText(dtm.getValueAt(selectedIndex, 8).toString());
        txtEMAILFOUR.setText(dtm.getValueAt(selectedIndex, 9).toString());



    }//GEN-LAST:event_tableFOURMouseClicked

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
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fournisseur().setVisible(true);
            }
        });
    }
    
    private void tableUpdate(){
       
        int cpt;
        
        try {
  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            pst = con.prepareStatement("SELECT * FROM fournisseurs");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            cpt = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel)tableFOUR.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
            Vector vect = new Vector();
            
            for(int i=1;i<=cpt;i++){
            vect.add(rs.getString("IDFOUR"));
            vect.add(rs.getString("NOMFOUR"));
            vect.add(rs.getString("RSFOUR"));
            vect.add(rs.getString("ADRESSEFOUR"));
            vect.add(rs.getString("CPFOUR"));
            vect.add(rs.getString("VILLEFOUR"));
            vect.add(rs.getString("PAYSFOUR"));
            vect.add(rs.getString("TELFOUR"));
            vect.add(rs.getString("FAXFOUR"));
            vect.add(rs.getString("EMAILFOUR"));
       
       
            }
            dtm.addRow(vect);
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFOUR;
    private javax.swing.JTextField txtADRESSEFOUR;
    private javax.swing.JTextField txtCPFOUR;
    private javax.swing.JTextField txtEMAILFOUR;
    private javax.swing.JTextField txtFAXFOUR;
    private javax.swing.JTextField txtNOMFOUR;
    private javax.swing.JTextField txtPAYSFOUR;
    private javax.swing.JTextField txtRSFOUR;
    private javax.swing.JTextField txtTELFOUR;
    private javax.swing.JTextField txtVILLEFOUR;
    // End of variables declaration//GEN-END:variables
}
