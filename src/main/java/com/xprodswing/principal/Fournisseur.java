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
public class Fournisseur extends javax.swing.JFrame {

Connection con;
PreparedStatement pst;
 

    /**
     * Creates new form Fournisseur
     */
    public Fournisseur() {
        initComponents();
        this.setTitle("Xprod gestion des fournisseurs");
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
        txtPAYSFOURNISSEUR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRAISONSOCIALE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNOMFOURNISSEUR = new javax.swing.JTextField();
        txtADRESSEFOURNISSEUR = new javax.swing.JTextField();
        txtVILLEFOURNISSEUR = new javax.swing.JTextField();
        txtTELFOURNISSEUR = new javax.swing.JTextField();
        txtFAXFOURNISSEUR = new javax.swing.JTextField();
        txtCPFOURNISSEUR = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnADDFOUR = new javax.swing.JButton();
        btnUpdateFour = new javax.swing.JButton();
        btnDeleteFour = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMAILFOURNISSEUR = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFOURNISSEUR = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Liste des Fournisseurs");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Infos fournisseurs"));

        jLabel2.setText("Raison sociale :");

        txtPAYSFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAYSFOURNISSEURActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom :");

        txtRAISONSOCIALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAISONSOCIALEActionPerformed(evt);
            }
        });

        jLabel4.setText("Ville :");

        jLabel5.setText("Adresse :");

        jLabel6.setText("Code Postal :");

        jLabel8.setText("Fax :");

        jLabel9.setText("Tel :");

        jLabel10.setText("Pays :");

        txtNOMFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMFOURNISSEURActionPerformed(evt);
            }
        });

        txtADRESSEFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADRESSEFOURNISSEURActionPerformed(evt);
            }
        });

        txtVILLEFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVILLEFOURNISSEURActionPerformed(evt);
            }
        });

        txtTELFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELFOURNISSEURActionPerformed(evt);
            }
        });

        txtFAXFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAXFOURNISSEURActionPerformed(evt);
            }
        });

        txtCPFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFOURNISSEURActionPerformed(evt);
            }
        });

        btnADDFOUR.setText("Ajouter");
        btnADDFOUR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnADDFOURMouseClicked(evt);
            }
        });
        btnADDFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDFOURActionPerformed(evt);
            }
        });

        btnUpdateFour.setText("Modifier");
        btnUpdateFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFourActionPerformed(evt);
            }
        });

        btnDeleteFour.setText("Supprimer");
        btnDeleteFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFourActionPerformed(evt);
            }
        });

        jLabel11.setText("Mail :");

        txtMAILFOURNISSEUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAILFOURNISSEURActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11)
                        .addGap(84, 84, 84)
                        .addComponent(txtMAILFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnADDFOUR)
                        .addGap(80, 80, 80)
                        .addComponent(btnUpdateFour)
                        .addGap(103, 103, 103)
                        .addComponent(btnDeleteFour)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMAILFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDFOUR)
                    .addComponent(btnUpdateFour)
                    .addComponent(btnDeleteFour)))
        );

        TableFOURNISSEUR.setModel(new javax.swing.table.DefaultTableModel(
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
                "IdFour", "Nom", "Raison sociale", "Adresse", "CP", "Ville", "Pays", "Tel", "Fax", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableFOURNISSEUR.setShowGrid(true);
        TableFOURNISSEUR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFOURNISSEURMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFOURNISSEUR);

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
                            .addComponent(txtTELFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFAXFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPAYSFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAISONSOCIALE, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNOMFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtADRESSEFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVILLEFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtRAISONSOCIALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNOMFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtADRESSEFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCPFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVILLEFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPAYSFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTELFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFAXFOURNISSEUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtPAYSFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAYSFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAYSFOURNISSEURActionPerformed

    private void txtRAISONSOCIALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAISONSOCIALEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAISONSOCIALEActionPerformed

    private void txtNOMFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMFOURNISSEURActionPerformed

    private void txtADRESSEFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADRESSEFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADRESSEFOURNISSEURActionPerformed

    private void txtVILLEFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVILLEFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVILLEFOURNISSEURActionPerformed

    private void txtTELFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELFOURNISSEURActionPerformed

    private void txtFAXFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAXFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAXFOURNISSEURActionPerformed

    private void txtCPFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFOURNISSEURActionPerformed

 
    private void tableUpdate() {
        try {
            int cpt;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb", "root","");
            pst = pst = con.prepareStatement("SELECT * FROM fournisseurs");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();TableFOURNISSEUR.getModel();
            cpt = rsmd.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel) TableFOURNISSEUR.getModel();
            dtm.setRowCount(0);
            
             while(rs.next()){
                Vector vect = new Vector();
                
            for (int i =1; i<= cpt; i++){
                vect.add(rs.getString("rsFour"));
                vect.add(rs.getString("nomFour"));
                vect.add(rs.getString("adresseFour"));
                vect.add(rs.getString("cpFour"));
                vect.add(rs.getString("villeFour"));
                vect.add(rs.getString("pays"));
                vect.add(rs.getString("telFour"));
                vect.add(rs.getString("faxFour"));
                
                
             }
            dtm.addRow(vect);
                
            
            }
             
              
          
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
    
    
    private void btnADDFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDFOURActionPerformed
        // Ajout fournisseur
        String rsFour = txtRAISONSOCIALE.getText(); 
        String nomFour = txtNOMFOURNISSEUR.getText();
        String adresseFour = txtADRESSEFOURNISSEUR.getText();
        String cpFour = txtCPFOURNISSEUR.getText();
        String villeFour = txtVILLEFOURNISSEUR.getText();
        String pays =txtPAYSFOURNISSEUR.getText();
        String telFour =txtTELFOURNISSEUR.getText();
        String faxFour =txtFAXFOURNISSEUR.getText();
        String mailFour =txtMAILFOURNISSEUR.getText();
    
      
     
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //enregister le driver jdbc
                con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
                pst = con.prepareStatement("INSERT INTO fournisseurs(RSFOUR, NOMFOUR, ADRESSEFOUR, CPFOUR, VILLEFOUR,PAYSFOUR,TELEFOUR,FAXFOUR,MAILFOUR) VALUES (?,?,?,?,?,?,?,?,?)");
        
                
        pst.setString(1, rsFour);
        pst.setString(2, nomFour);
        pst.setString(3, adresseFour);
        pst.setString(4, cpFour);
        pst.setString(5, villeFour);
        pst.setString(6, pays);
        pst.setString(7, telFour);
        pst.setString(8, faxFour);
        pst.setString(9, mailFour);
        
        
        pst.executeUpdate();
       JOptionPane.showMessageDialog(this, "Données enregistrées");
       
               // je vide le contenu des champs
    txtRAISONSOCIALE.setText("");
    txtNOMFOURNISSEUR.setText("");
    txtADRESSEFOURNISSEUR.setText("");
    txtCPFOURNISSEUR.setText("");
    txtVILLEFOURNISSEUR.setText("");
    txtPAYSFOURNISSEUR.setText("");
    txtTELFOURNISSEUR.setText("");
    txtFAXFOURNISSEUR.setText("");
    txtMAILFOURNISSEUR.setText("");
    tableUpdate();


        } catch (SQLException ex) {
                Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fournisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnADDFOURActionPerformed

    private void TableFOURNISSEURMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFOURNISSEURMouseClicked
           
        // Pour selectionner les informations d'un champ
        DefaultTableModel dtm = (DefaultTableModel)TableFOURNISSEUR.getModel();
        int selectedIndex = TableFOURNISSEUR.getSelectedRow();
        
        txtRAISONSOCIALE.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtNOMFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtADRESSEFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtCPFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 4).toString());
        txtVILLEFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 5).toString());
        txtPAYSFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 6).toString());
        txtADRESSEFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 7).toString());
        txtTELFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 8).toString());
        txtFAXFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 9).toString());
        txtMAILFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 10).toString());
        
        
    }//GEN-LAST:event_TableFOURNISSEURMouseClicked

    private void txtMAILFOURNISSEURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAILFOURNISSEURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAILFOURNISSEURActionPerformed

    private void btnUpdateFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFourActionPerformed
                    // bouton modification
            DefaultTableModel dtm = (DefaultTableModel)TableFOURNISSEUR.getModel();
            int selectedIndex = TableFOURNISSEUR.getSelectedRow();
        
        
            int idProd = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            
            
            String rsFour = txtRAISONSOCIALE.getText();
            String nomFour = txtNOMFOURNISSEUR.getText();
            String adresseFour = txtADRESSEFOURNISSEUR.getText();
            String cpFour = txtCPFOURNISSEUR.getText();
            String villeFour = txtVILLEFOURNISSEUR.getText();
            String pays = txtPAYSFOURNISSEUR.getText();
            String telFour = txtTELFOURNISSEUR.getText();
            String faxFour = txtFAXFOURNISSEUR.getText();
            String mailFour = txtMAILFOURNISSEUR.getText();
            
            
        
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
            pst = con.prepareStatement("update fournisseurs set RSFOUR=?, NOMFOUR=?, ADRESSEFOUR=?, CPFOUR=?, VILLEFOUR =?, PAYSFOUR=?, TELEFOUR=?, FAXFOUR=?, MAILFOUR=? where IDFOUR=?");
            
            pst.setString(1, rsFour);
            pst.setString(2, nomFour);
            pst.setString(3, adresseFour);
            pst.setString(4, cpFour);
            pst.setString(5, villeFour);
            pst.setString(6, pays);
            pst.setString(7, telFour);
            pst.setString(8, faxFour);
            pst.setString(9, mailFour);
            
           
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Données mis a jour");
    
    
    txtRAISONSOCIALE.setText("");
    txtNOMFOURNISSEUR.setText("");
    txtADRESSEFOURNISSEUR.setText("");
    txtCPFOURNISSEUR.setText("");
    txtVILLEFOURNISSEUR.setText("");
    txtPAYSFOURNISSEUR.setText("");
    txtTELFOURNISSEUR.setText("");
    txtFAXFOURNISSEUR.setText("");
    txtMAILFOURNISSEUR.setText("");
    tableUpdate();
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateFourActionPerformed

    private void btnADDFOURMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnADDFOURMouseClicked
DefaultTableModel dtm = (DefaultTableModel)TableFOURNISSEUR.getModel();
        int selectedIndex = TableFOURNISSEUR.getSelectedRow();
        
    txtRAISONSOCIALE.setText(dtm.getValueAt(selectedIndex, 1).toString());
    txtNOMFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 2).toString());
    txtADRESSEFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 3).toString());
    txtCPFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 4).toString());
    txtVILLEFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 5).toString());
    txtPAYSFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 6).toString());
    txtTELFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 7).toString());
    txtFAXFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 8).toString());
    txtMAILFOURNISSEUR.setText(dtm.getValueAt(selectedIndex, 9).toString());
    }//GEN-LAST:event_btnADDFOURMouseClicked

    private void btnDeleteFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFourActionPerformed
        //Supprimer 
        DefaultTableModel dtm = (DefaultTableModel)TableFOURNISSEUR.getModel();
        int selectedIndex = TableFOURNISSEUR.getSelectedRow();
        
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
    txtRAISONSOCIALE.setText("");
    txtNOMFOURNISSEUR.setText("");
    txtADRESSEFOURNISSEUR.setText("");
    txtCPFOURNISSEUR.setText("");
    txtVILLEFOURNISSEUR.setText("");
    txtPAYSFOURNISSEUR.setText("");
    txtTELFOURNISSEUR.setText("");
    txtFAXFOURNISSEUR.setText("");
    txtMAILFOURNISSEUR.setText("");
    
    tableUpdate();
                
                
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdministrateur.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }//GEN-LAST:event_btnDeleteFourActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFOURNISSEUR;
    private javax.swing.JButton btnADDFOUR;
    private javax.swing.JButton btnDeleteFour;
    private javax.swing.JButton btnUpdateFour;
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
    private javax.swing.JTextField txtADRESSEFOURNISSEUR;
    private javax.swing.JTextField txtCPFOURNISSEUR;
    private javax.swing.JTextField txtFAXFOURNISSEUR;
    private javax.swing.JTextField txtMAILFOURNISSEUR;
    private javax.swing.JTextField txtNOMFOURNISSEUR;
    private javax.swing.JTextField txtPAYSFOURNISSEUR;
    private javax.swing.JTextField txtRAISONSOCIALE;
    private javax.swing.JTextField txtTELFOURNISSEUR;
    private javax.swing.JTextField txtVILLEFOURNISSEUR;
    // End of variables declaration//GEN-END:variables
}
        
        

