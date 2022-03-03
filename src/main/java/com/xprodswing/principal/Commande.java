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
 */
public class Commande extends javax.swing.JFrame {

    /**
     * Creates new form Commande
     */
    public Commande() {
        initComponents();
        this.setTitle("Xprod gestion des commandes");
        setLocationRelativeTo(null);
        tableUpdate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIDCOMMANDE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDATECOMMANDE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTOTALHT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTVA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTOTALTTC = new javax.swing.JTextField();
        btnAjouterC = new javax.swing.JButton();
        btnSupprimerC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtFRAISPORT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNBARTICLE = new javax.swing.JTextField();
        btnRetour = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCOMMANDE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTE DES COMMANDES");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "infos commandes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Commande :");

        txtIDCOMMANDE.setBackground(new java.awt.Color(102, 102, 102));
        txtIDCOMMANDE.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Commande : ");

        txtDATECOMMANDE.setBackground(new java.awt.Color(102, 102, 102));
        txtDATECOMMANDE.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total HT :");

        txtTOTALHT.setBackground(new java.awt.Color(102, 102, 102));
        txtTOTALHT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TVA : ");

        txtTVA.setBackground(new java.awt.Color(102, 102, 102));
        txtTVA.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total TTC :");

        txtTOTALTTC.setBackground(new java.awt.Color(102, 102, 102));
        txtTOTALTTC.setForeground(new java.awt.Color(255, 255, 255));

        btnAjouterC.setBackground(new java.awt.Color(204, 255, 255));
        btnAjouterC.setForeground(new java.awt.Color(102, 102, 255));
        btnAjouterC.setText(" Ajouter ou modifier");
        btnAjouterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterCActionPerformed(evt);
            }
        });

        btnSupprimerC.setBackground(new java.awt.Color(204, 255, 255));
        btnSupprimerC.setForeground(new java.awt.Color(102, 102, 255));
        btnSupprimerC.setText("Supprimer");
        btnSupprimerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerCActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Frais de Port :");

        txtFRAISPORT.setBackground(new java.awt.Color(102, 102, 102));
        txtFRAISPORT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre d'article :");

        txtNBARTICLE.setBackground(new java.awt.Color(102, 102, 102));
        txtNBARTICLE.setForeground(new java.awt.Color(255, 255, 255));

        btnRetour.setBackground(new java.awt.Color(204, 255, 255));
        btnRetour.setForeground(new java.awt.Color(102, 102, 255));
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
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
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(txtFRAISPORT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNBARTICLE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnAjouterC)
                        .addGap(57, 57, 57)
                        .addComponent(btnSupprimerC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnRetour)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDCOMMANDE)
                            .addComponent(txtDATECOMMANDE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTVA)
                                    .addComponent(txtTOTALTTC)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtTOTALHT)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCOMMANDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDATECOMMANDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNBARTICLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFRAISPORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTOTALHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTOTALTTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterC)
                    .addComponent(btnSupprimerC)
                    .addComponent(btnRetour))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        tabCOMMANDE.setBackground(new java.awt.Color(102, 102, 102));
        tabCOMMANDE.setForeground(new java.awt.Color(255, 255, 255));
        tabCOMMANDE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Commande", "Date Commande", "Frais de Port", "Nb Article", "TotalHT", "TVA", "TotalTTC", "Nom Client", "Prenom Client"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCOMMANDE.setGridColor(new java.awt.Color(102, 51, 255));
        tabCOMMANDE.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tabCOMMANDE.setSelectionForeground(new java.awt.Color(102, 51, 255));
        tabCOMMANDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCOMMANDEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCOMMANDE);
        if (tabCOMMANDE.getColumnModel().getColumnCount() > 0) {
            tabCOMMANDE.getColumnModel().getColumn(3).setMinWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(3).setMaxWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(4).setMinWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(4).setMaxWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(5).setMinWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(5).setMaxWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(6).setMinWidth(0);
            tabCOMMANDE.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con; // déclaratioon de connection 
    PreparedStatement pst; 
    
    private void tableUpdate(){
            int cpt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root",""); // Demande au DriverManager (gestionnaire de manager) de récupérer et de stocker les infos dans la variable con
                    pst = con.prepareStatement("SELECT * FROM commandes");
                    ResultSet rs = pst.executeQuery();
                    ResultSetMetaData rsmd = rs.getMetaData();
                    cpt = rsmd.getColumnCount();
                    DefaultTableModel dtm = (DefaultTableModel) tabCOMMANDE.getModel();
                    dtm.setRowCount(0);
                    
                    while(rs.next()){
                        Vector  vect = new Vector();
                        
                        for(int i = 1; i <= cpt; i++){
                            vect.add(rs.getString("IDCMD"));
                            vect.add(rs.getString("DATECMD"));
                            vect.add(rs.getString("FRAISDEPORTCMD"));
                            vect.add(rs.getString("NBARTICLE"));
                            vect.add(rs.getString("TOTALHT"));
                            vect.add(rs.getString("TVA"));
                            vect.add(rs.getString("TOTALTTC"));
                            
                        }
                    dtm.addRow(vect);
                    }
                            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    private void btnAjouterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterCActionPerformed
     GestionCommande newGcmd = new GestionCommande();
     newGcmd.setVisible(true);
    }//GEN-LAST:event_btnAjouterCActionPerformed

    private void tabCOMMANDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCOMMANDEMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tabCOMMANDE.getModel();
        int selectedIndex = tabCOMMANDE.getSelectedRow();
        
        txtIDCOMMANDE.setText(dtm.getValueAt(selectedIndex, 0).toString()); //récupere les données dans dtm, la valeur 1 dans le champs selectionné
        txtDATECOMMANDE.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtFRAISPORT.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtNBARTICLE.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtTOTALHT.setText(dtm.getValueAt(selectedIndex, 4).toString());
        txtTVA.setText(dtm.getValueAt(selectedIndex, 5).toString());
        txtTOTALTTC.setText(dtm.getValueAt(selectedIndex, 6).toString());
    }//GEN-LAST:event_tabCOMMANDEMouseClicked

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void btnSupprimerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerCActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tabCOMMANDE.getModel();
        int selectedIndex = tabCOMMANDE.getSelectedRow();
        int idCommande = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette données?","Attention",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION ){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root","");
                pst = con.prepareStatement("delete from commandes where IDCMD=?");
                pst.setInt(1, idCommande);
                
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Les données ont été supprimées");
                
                txtIDCOMMANDE.setText("");
                txtDATECOMMANDE.setText("");
                txtFRAISPORT.setText("");
                txtNBARTICLE.setText("");
                txtTOTALHT.setText("");
                txtTVA.setText("");
                txtTOTALTTC.setText("");
                
                tableUpdate();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSupprimerCActionPerformed

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
            java.util.logging.Logger.getLogger(Commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Commande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterC;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSupprimerC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCOMMANDE;
    private javax.swing.JTextField txtDATECOMMANDE;
    private javax.swing.JTextField txtFRAISPORT;
    private javax.swing.JTextField txtIDCOMMANDE;
    private javax.swing.JTextField txtNBARTICLE;
    private javax.swing.JTextField txtTOTALHT;
    private javax.swing.JTextField txtTOTALTTC;
    private javax.swing.JTextField txtTVA;
    // End of variables declaration//GEN-END:variables
}
