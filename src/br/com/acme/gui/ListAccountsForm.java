package br.com.acme.gui;

import br.com.acme.connection.UserDataBaseConnector;
import br.com.acme.model.User;
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ListAccountsForm extends javax.swing.JDialog {

    public ListAccountsForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        populateTable();
    }

    private void populateTable() {
        Collection<User> users = UserDataBaseConnector.getAllUsers();

        if(users == null || users.size() == 0) {
            JOptionPane.showMessageDialog(this, "Erro ao comunicar com o banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
            return;
        }
        
        TableModel model = jtAccounts.getModel();
        
        
        int line = 0;
        for (User u : users) {            
            model.setValueAt(u.getEmail(), line, 0);
            model.setValueAt(u.getLogin(), line, 1);
            model.setValueAt(u.getPublications_limit(), line, 2);
            line++;
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
        jspAccounts = new javax.swing.JScrollPane();
        jtAccounts = new javax.swing.JTable();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registered Accounts");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registered Accounts");

        jtAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Email", "Login", "Remaining Registers"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspAccounts.setViewportView(jtAccounts);

        jbClose.setText("Close");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jspAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jbClose)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbClose;
    private javax.swing.JScrollPane jspAccounts;
    private javax.swing.JTable jtAccounts;
    // End of variables declaration//GEN-END:variables
}
