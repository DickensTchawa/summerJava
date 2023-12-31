/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercoding.bank.ui;

import com.summercoding.bank.controlleur.Controlleur;
import com.summercoding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TCHAWA Dickens
 */
public class JFrameSaveAdmin extends javax.swing.JFrame {

    Controlleur controlleur = new Controlleur();

    String quelAction;

    JFrameHome homepage;

    /**
     * Creates new form JFrameAdmin
     *
     * @param action
     * @param idadmin
     * @param hp
     */
    public JFrameSaveAdmin(String action, int idadmin, JFrameHome hp) throws SQLException {
        initComponents();

        homepage = hp;
        quelAction = action;

        if (quelAction.equals("add")) {
            ButtonUpdate.setVisible(false);
            ButtonDelete.setVisible(false);
            LabelIdAdmin.setVisible(false);
            ChampIdAdmin.setVisible(false);
        }
        else if(quelAction.equalsIgnoreCase("update")){
            
            Admin admin = controlleur.routeVersAdminDetails(idadmin);
            
            champLogin.setText(admin.getLogin());
            champNom.setText(admin.getNom());
            champPassword.setText(admin.getPassword());
            ChampIdAdmin.setText(admin.getIdadmin()+"");
        
        }
        else if(quelAction.equalsIgnoreCase("delete")){
            
            Admin admin = controlleur.routeVersDeleteAdmin(idadmin);
            
            champLogin.setText(admin.getLogin());
            champNom.setText(admin.getNom());
            champPassword.setText(admin.getPassword());
            ChampIdAdmin.setText(admin.getIdadmin()+"");
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        champLogin = new javax.swing.JTextField();
        champNom = new javax.swing.JTextField();
        ButtonCancel = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        champPassword = new javax.swing.JPasswordField();
        LabelIdAdmin = new javax.swing.JLabel();
        ChampIdAdmin = new javax.swing.JTextField();
        ButtonDelete = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nouveau Admin");

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        jLabel3.setText("Nom");

        champLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champLoginActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonAdd.setText("Add");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        LabelIdAdmin.setText("Id Admin");

        ChampIdAdmin.setEditable(false);

        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonUpdate.setText("Update");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(ButtonUpdate)
                        .addGap(34, 34, 34)
                        .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(LabelIdAdmin))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(champNom)
                            .addComponent(champPassword)
                            .addComponent(champLogin)
                            .addComponent(ChampIdAdmin))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(champLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIdAdmin)
                    .addComponent(ChampIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel)
                    .addComponent(ButtonAdd)
                    .addComponent(ButtonDelete)
                    .addComponent(ButtonUpdate))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void champLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champLoginActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        try {
            // TODO add your handling code here:
            String login = champLogin.getText();
            String pwd = champPassword.getText();
            String nom = champNom.getText();
            
            
            controlleur.routeVersSaveAdmin(login, pwd, nom);

            //refresh datatable
            refreshTable();
            
            this.setVisible(false);
            //Fonction de renvoi de message à l'admin
            JOptionPane.showMessageDialog(null, "Success");

            //Champs vides après enregistrement
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        try {
            // TODO add your handling code here:
            String id = ChampIdAdmin.getText();
            int idadmin = Integer.parseInt(id);
            String login = champLogin.getText();
            String pwd = champPassword.getText();
            String nom = champNom.getText();
            
            controlleur.routeVersUpdateAdmin(idadmin, login, pwd, nom);
            
            this.dispose();
            
            // Mettre à jour le Table
            refreshTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Internal Error, please contact admin");
        }
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            String id = ChampIdAdmin.getText();
            int idadmin = Integer.parseInt(id);
            
            controlleur.routeVersDeleteAdmin(idadmin);
            
            this.dispose();
            
            // Mettre à jour le Table
            refreshTable();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameSaveAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameSaveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameSaveAdmin("add", 0, null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameSaveAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void refreshTable() throws SQLException{
        List<Admin> listAdmin = controlleur.routeVersListAllAdmin();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id Admin");
            model.addColumn("Nom");
            model.addColumn("Login");

            for (Admin ad : listAdmin) {
                model.addRow(new String[]{ad.getIdadmin() + "", ad.getNom() + "", ad.getLogin()});
            }

            homepage.getHomeTable().setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JTextField ChampIdAdmin;
    private javax.swing.JLabel LabelIdAdmin;
    private javax.swing.JTextField champLogin;
    private javax.swing.JTextField champNom;
    private javax.swing.JPasswordField champPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
