/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.connection.MagazineDatabaseConnector;
import java.awt.Component;
import br.com.acme.model.Magazine;
import br.com.acme.model.Session;
import br.com.acme.model.logic.LogController;

import javax.swing.*;

/**
 *
 * @author USER
 */
public class AddMagazineForm extends javax.swing.JDialog {
    
    public AddMagazineForm() {
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
        jLabel2 = new javax.swing.JLabel();
        jtfTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfIssue = new javax.swing.JTextField();
        jbOK = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jtfAuthor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Magazine");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Year:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Issue");

        jtfIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIssueActionPerformed(evt);
            }
        });

        jbOK.setText("Ok");
        jbOK.setPreferredSize(new java.awt.Dimension(80, 32));
        jbOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbOKMouseClicked(evt);
            }
        });
        jbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOKActionPerformed(evt);
            }
        });

        jbClose.setText("Close");
        jbClose.setPreferredSize(new java.awt.Dimension(80, 32));
        jbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCloseMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Author:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(jtfIssue, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel8.getAccessibleContext().setAccessibleName("Author");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbOKMouseClicked
        
        if (hasEmptyField()) {
            JOptionPane.showMessageDialog(this, "One or more empty fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        
        try {
            Magazine tempMagazine = new Magazine(jtfTitle.getText(), Short.parseShort(jtfYear.getText()),
                    jtfAuthor.getText(), jtfIssue.getText());

            int userId = Session.getInstance().getLoggedUser().getIdUser();
            tempMagazine.setUserId(userId);
            
           boolean successful = MagazineDatabaseConnector.insertMagazine(tempMagazine);
            
            if(successful == false ) {
                JOptionPane.showMessageDialog(this, "Error on magazine insertion", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (LogController.getLogStatus()) {
                LogController.writeLog("Magazine added: " + tempMagazine.getTitle());
            }

            JOptionPane.showMessageDialog(this, "Your magazine was successfully added!", "Succes!", JOptionPane.INFORMATION_MESSAGE);           
            clearFields();
        } catch (NumberFormatException ex) {
            showNumberErrorMessage();
            return;
        }
        

    }//GEN-LAST:event_jbOKMouseClicked

    private void jbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCloseMouseClicked
        clearFields();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jbCloseMouseClicked

    private void jbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOKActionPerformed
     
    }//GEN-LAST:event_jbOKActionPerformed

    private void jtfIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIssueActionPerformed
    
    private void showNumberErrorMessage() {
        JOptionPane.showMessageDialog(this, "The following fields must be NUMBERS between: \n"
                + "Year: 0 and " + Short.MAX_VALUE + "\n"
);
    }
    
    private void clearFields() {
        for (Component c : getRootPane().getContentPane().getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }
    
    private boolean hasEmptyField() {
        for (Component c : getRootPane().getContentPane().getComponents()) {
            if (c instanceof JTextField) {
                if (((JTextField) c).getText().trim().equals("")) {
                    return true;
                }
            }
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbOK;
    private javax.swing.JTextField jtfAuthor;
    private javax.swing.JTextField jtfIssue;
    private javax.swing.JTextField jtfTitle;
    private javax.swing.JTextField jtfYear;
    // End of variables declaration//GEN-END:variables

    private boolean MagazineDatabaseConnector(Magazine tempMagazine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
