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
public class Client extends javax.swing.JFrame {

Connection con;
PreparedStatement pst;
 

    /**
     * Creates new form Fournisseur
     */
    public Client() {
        initComponents();
        this.setTitle("Xprod gestion des clients");
        setLocationRelativeTo(null);
        tableUpdate();
        
    }

   
    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPAYSCLIENT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPRENOMCLIENT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNOMCLIENT = new javax.swing.JTextField();
        txtADRESSECLIENT = new javax.swing.JTextField();
        txtVILLECLIENT = new javax.swing.JTextField();
        txtTELCLIENT = new javax.swing.JTextField();
        txtMOBILECLIENT = new javax.swing.JTextField();
        txtCPCLIENT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnADDCLIENT = new javax.swing.JButton();
        btnUpdateClient = new javax.swing.JButton();
        btnDeleteClient = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMAILCLIENT = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCLIENTS = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Liste des Clients");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Infos fournisseurs"));

        jLabel2.setText("Prénom");

        txtPAYSCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAYSCLIENTActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom :");

        txtPRENOMCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRENOMCLIENTActionPerformed(evt);
            }
        });

        jLabel4.setText("Ville :");

        jLabel5.setText("Adresse :");

        jLabel6.setText("Code Postal :");

        jLabel8.setText("Mobile :");

        jLabel9.setText("Tel :");

        jLabel10.setText("Pays :");

        txtNOMCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMCLIENTActionPerformed(evt);
            }
        });

        txtADRESSECLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADRESSECLIENTActionPerformed(evt);
            }
        });

        txtVILLECLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVILLECLIENTActionPerformed(evt);
            }
        });

        txtTELCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELCLIENTActionPerformed(evt);
            }
        });

        txtMOBILECLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMOBILECLIENTActionPerformed(evt);
            }
        });

        txtCPCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPCLIENTActionPerformed(evt);
            }
        });

        btnADDCLIENT.setText("Ajouter");
        btnADDCLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnADDCLIENTMouseClicked(evt);
            }
        });
        btnADDCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDCLIENTActionPerformed(evt);
            }
        });

        btnUpdateClient.setText("Modifier");
        btnUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClientActionPerformed(evt);
            }
        });

        btnDeleteClient.setText("Supprimer");
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });

        jLabel11.setText("Mail :");

        txtMAILCLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAILCLIENTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11)
                        .addGap(66, 66, 66)
                        .addComponent(txtMAILCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnADDCLIENT)
                        .addGap(44, 44, 44)
                        .addComponent(btnUpdateClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteClient)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMAILCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDCLIENT)
                    .addComponent(btnUpdateClient)
                    .addComponent(btnDeleteClient)))
        );

        TableCLIENTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Prénom", "Nom", "Raison sociale", "Adresse", "CP", "Ville", "Pays", "Tel", "Mobile", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableCLIENTS.setShowGrid(true);
        TableCLIENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCLIENTSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCLIENTS);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTELCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMOBILECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPAYSCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPRENOMCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNOMCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtADRESSECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVILLECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPRENOMCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNOMCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtADRESSECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCPCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVILLECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPAYSCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTELCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMOBILECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fournisseur");

        jMenuItem1.setText("Gestion des fournisseurs");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Commandes");

        jMenuItem2.setText("Gestion des commandes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPAYSCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAYSCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAYSCLIENTActionPerformed

    private void txtPRENOMCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRENOMCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRENOMCLIENTActionPerformed

    private void txtNOMCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMCLIENTActionPerformed

    private void txtADRESSECLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADRESSECLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADRESSECLIENTActionPerformed

    private void txtVILLECLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVILLECLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVILLECLIENTActionPerformed

    private void txtTELCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELCLIENTActionPerformed

    private void txtMOBILECLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMOBILECLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMOBILECLIENTActionPerformed

    private void txtCPCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPCLIENTActionPerformed

 
    private void tableUpdate() {
        try {
            int cpt;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb", "root","");
            pst = pst = con.prepareStatement("SELECT * FROM clients");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();TableCLIENTS.getModel();
            cpt = rsmd.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel) TableCLIENTS.getModel();
            dtm.setRowCount(0);
            
             while(rs.next()){
                Vector vect = new Vector();
                
            for (int i =1; i<= cpt; i++){
                vect.add(rs.getString("prenomClient"));
                vect.add(rs.getString("nomClient"));
                vect.add(rs.getString("adresseClient"));
                vect.add(rs.getString("cpClient"));
                vect.add(rs.getString("villeClient"));
                vect.add(rs.getString("paysClient"));
                vect.add(rs.getString("telClour"));
                vect.add(rs.getString("mobileClient"));
                vect.add(rs.getString("mailClient"));
                
                
             }
            dtm.addRow(vect);
                
            
            }
             
              
          
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    
    
    private void btnADDCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDCLIENTActionPerformed
        // Ajout fournisseur
        String prenomClient = txtPRENOMCLIENT.getText(); 
        String nomClient = txtNOMCLIENT.getText();
        String adresseClient = txtADRESSECLIENT.getText();
        String cpClient = txtCPCLIENT.getText();
        String villeClient = txtVILLECLIENT.getText();
        String paysClient =txtPAYSCLIENT.getText();
        String telClient =txtTELCLIENT.getText();
        String mobileClient =txtMOBILECLIENT.getText();
        String mailClient =txtMAILCLIENT.getText();
    
      
     
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //enregister le driver jdbc
                con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
                pst = con.prepareStatement("INSERT INTO clients (PRENOMCLIENT, NOMCLIENT, ADRESSECLIENT, CPCLIENT, VILLECLIENT,PAYSCLIENT,TELCLIENT,MOBILE,MAILCLIENT) VALUES (?,?,?,?,?,?,?,?,?)");
        
                
        pst.setString(1, prenomClient);
        pst.setString(2, nomClient);
        pst.setString(3, adresseClient);
        pst.setString(4, cpClient);
        pst.setString(5, villeClient);
        pst.setString(6, paysClient);
        pst.setString(7, telClient);
        pst.setString(8, mobileClient);
        pst.setString(9, mailClient);
        
        
        pst.executeUpdate();
       JOptionPane.showMessageDialog(this, "Données enregistrées");
       
               // je vide le contenu des champs
    txtPRENOMCLIENT.setText("");
    txtNOMCLIENT.setText("");
    txtADRESSECLIENT.setText("");
    txtCPCLIENT.setText("");
    txtVILLECLIENT.setText("");
    txtPAYSCLIENT.setText("");
    txtTELCLIENT.setText("");
    txtMOBILECLIENT.setText("");
    txtMAILCLIENT.setText("");
    tableUpdate();


        } catch (SQLException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnADDCLIENTActionPerformed

    private void TableCLIENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCLIENTSMouseClicked
           
        // Pour selectionner les informations d'un champ
        DefaultTableModel dtm = (DefaultTableModel)TableCLIENTS.getModel();
        int selectedIndex = TableCLIENTS.getSelectedRow();
        
        txtPRENOMCLIENT.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtNOMCLIENT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtADRESSECLIENT.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtCPCLIENT.setText(dtm.getValueAt(selectedIndex, 4).toString());
        txtVILLECLIENT.setText(dtm.getValueAt(selectedIndex, 5).toString());
        txtPAYSCLIENT.setText(dtm.getValueAt(selectedIndex, 6).toString());
        txtADRESSECLIENT.setText(dtm.getValueAt(selectedIndex, 7).toString());
        txtTELCLIENT.setText(dtm.getValueAt(selectedIndex, 8).toString());
        txtMOBILECLIENT.setText(dtm.getValueAt(selectedIndex, 9).toString());
        txtMAILCLIENT.setText(dtm.getValueAt(selectedIndex, 10).toString());
        
        
    }//GEN-LAST:event_TableCLIENTSMouseClicked

    private void txtMAILCLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAILCLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAILCLIENTActionPerformed

    private void btnUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClientActionPerformed
                    // bouton modification
            DefaultTableModel dtm = (DefaultTableModel)TableCLIENTS.getModel();
            int selectedIndex = TableCLIENTS.getSelectedRow();
        
        
            int idProd = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            
            
            String prenomClient = txtPRENOMCLIENT.getText();
            String nomClient = txtNOMCLIENT.getText();
            String adresseClient = txtADRESSECLIENT.getText();
            String cpClient = txtCPCLIENT.getText();
            String villeClient = txtVILLECLIENT.getText();
            String paysClient = txtPAYSCLIENT.getText();
            String telClient = txtTELCLIENT.getText();
            String mobileClient = txtMOBILECLIENT.getText();
            String mailClient = txtMAILCLIENT.getText();
            
            
        
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
            pst = con.prepareStatement("update clients set PRENOMCLIENT=?, NOMCLIENT=?, ADRESSECLIENT=?, CPCLIENT=?, VILLECLIENT =?, PAYSCLIENT=?, TELCLIENT=?, MOBILECLIENT=?, MAILCLIENT=? where IDCLIENT=?");
            
            pst.setString(1, prenomClient);
            pst.setString(2, nomClient);
            pst.setString(3, adresseClient);
            pst.setString(4, cpClient);
            pst.setString(5, villeClient);
            pst.setString(6, paysClient);
            pst.setString(7, telClient);
            pst.setString(8, mobileClient);
            pst.setString(9, mailClient);
            
           
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Données mis a jour");
    
    
    txtPRENOMCLIENT.setText("");
    txtNOMCLIENT.setText("");
    txtADRESSECLIENT.setText("");
    txtCPCLIENT.setText("");
    txtVILLECLIENT.setText("");
    txtPAYSCLIENT.setText("");
    txtTELCLIENT.setText("");
    txtMOBILECLIENT.setText("");
    txtMAILCLIENT.setText("");
    tableUpdate();
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateClientActionPerformed

    private void btnADDCLIENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnADDCLIENTMouseClicked
DefaultTableModel dtm = (DefaultTableModel)TableCLIENTS.getModel();
        int selectedIndex = TableCLIENTS.getSelectedRow();
        
    txtPRENOMCLIENT.setText(dtm.getValueAt(selectedIndex, 1).toString());
    txtNOMCLIENT.setText(dtm.getValueAt(selectedIndex, 2).toString());
    txtADRESSECLIENT.setText(dtm.getValueAt(selectedIndex, 3).toString());
    txtCPCLIENT.setText(dtm.getValueAt(selectedIndex, 4).toString());
    txtVILLECLIENT.setText(dtm.getValueAt(selectedIndex, 5).toString());
    txtPAYSCLIENT.setText(dtm.getValueAt(selectedIndex, 6).toString());
    txtTELCLIENT.setText(dtm.getValueAt(selectedIndex, 7).toString());
    txtMOBILECLIENT.setText(dtm.getValueAt(selectedIndex, 8).toString());
    txtMAILCLIENT.setText(dtm.getValueAt(selectedIndex, 9).toString());
    }//GEN-LAST:event_btnADDCLIENTMouseClicked

    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed
        //Supprimer 
        DefaultTableModel dtm = (DefaultTableModel)TableCLIENTS.getModel();
        int selectedIndex = TableCLIENTS.getSelectedRow();
        
        int idProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette donnée ?","Attention",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION){
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
                
                pst = con.prepareStatement("delete from produit where idClient=?");
                
                pst.setInt(1, idProduit);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Donnée supprimée !");
                
                    // je vide le contenu des champs
    txtPRENOMCLIENT.setText("");
    txtNOMCLIENT.setText("");
    txtADRESSECLIENT.setText("");
    txtCPCLIENT.setText("");
    txtVILLECLIENT.setText("");
    txtPAYSCLIENT.setText("");
    txtTELCLIENT.setText("");
    txtMOBILECLIENT.setText("");
    txtMAILCLIENT.setText("");
    
    tableUpdate();
                
                
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed
      
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCLIENTS;
    private javax.swing.JButton btnADDCLIENT;
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JButton btnUpdateClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtADRESSECLIENT;
    private javax.swing.JTextField txtCPCLIENT;
    private javax.swing.JTextField txtMAILCLIENT;
    private javax.swing.JTextField txtMOBILECLIENT;
    private javax.swing.JTextField txtNOMCLIENT;
    private javax.swing.JTextField txtPAYSCLIENT;
    private javax.swing.JTextField txtPRENOMCLIENT;
    private javax.swing.JTextField txtTELCLIENT;
    private javax.swing.JTextField txtVILLECLIENT;
    // End of variables declaration//GEN-END:variables
}
        
        

