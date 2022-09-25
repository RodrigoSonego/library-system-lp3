/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.model.User;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author USER
 */
public class CreateAccountForm extends javax.swing.JDialog {

    
    public CreateAccountForm() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        jbCreate = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Create User Account");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Login:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Password:");

        jbCreate.setText("Create");
        jbCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCreateMouseClicked(evt);
            }
        });

        jbClose.setText("Close");
        jbClose.setPreferredSize(new java.awt.Dimension(69, 32));
        jbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jbCreate)
                        .addGap(18, 18, 18)
                        .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCreateMouseClicked
        
        User tempUser = new User();
        String pwdString = new String(jpfPassword.getPassword());
        try {
            String pwd = pwdString;          
            tempUser.setPassword(pwd);                          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Password must be only numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        verifyFields();
        
        tempUser.setLogin(jtfLogin.getText());
        tempUser.setEmail(jtfEmail.getText());
        
        //TODO: Add DB user creation stuff here
        
        JOptionPane.showMessageDialog(this, "Your account was successfully created!", "Succes!", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_jbCreateMouseClicked

    private void jbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCloseMouseClicked
        
        setVisible(false);
        clearFields();
        dispose();
        
    }//GEN-LAST:event_jbCloseMouseClicked

    private void verifyFields(){
        for (Component c : getRootPane().getContentPane().getComponents()) {
             if(c instanceof JTextField)
                 if(((JTextField) c).getText().equals(""))
                     JOptionPane.showMessageDialog(this, "One or more empty fields", "Error", JOptionPane.ERROR_MESSAGE);
         }
    }
    
     private void clearFields(){
         for (Component c : getRootPane().getContentPane().getComponents()) {
             if(c instanceof JTextField)
                 ((JTextField) c).setText("");
         }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbCreate;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
