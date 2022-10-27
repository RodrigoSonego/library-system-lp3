/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import javax.swing.JOptionPane;

import br.com.acme.model.logic.LogController;

/**
 *
 * @author USER
 */
public class MainWindow extends javax.swing.JFrame {

    public boolean isOfflineMode = false;
    
    private AddBookForm addBook;
    private AddArticleForm addArticle;
    private CreateAccountForm createAccount;
    private ListAccountsForm listAccounts;
    private ListArticlesForm listArticles;
    private ListBooksForm listBooks;     
    
    private LoginForm previousWindow;
    
    public MainWindow(String username, LoginForm previousWindow) {
        this.previousWindow = previousWindow;
        initComponents();
        
        jlUsername.setText(username);
        isOfflineMode = jmcbOfflineOn.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcFileChooser = new javax.swing.JFileChooser();
        jButtonLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlUsername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmAdd = new javax.swing.JMenu();
        jmiAddBook = new javax.swing.JMenuItem();
        jmiAddArticle = new javax.swing.JMenuItem();
        jmList = new javax.swing.JMenu();
        jmiListBook = new javax.swing.JMenuItem();
        jmiListArticles = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiCreate = new javax.swing.JMenuItem();
        jmiListAccounts = new javax.swing.JMenuItem();
        jmLog = new javax.swing.JMenu();
        jmcbOn = new javax.swing.JCheckBoxMenuItem();
        jmcbOff = new javax.swing.JCheckBoxMenuItem();
        jmOffline = new javax.swing.JMenu();
        jmcbOfflineOn = new javax.swing.JCheckBoxMenuItem();
        jmcbOfflineOff = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Library Control System");
        setResizable(false);

        jButtonLogout.setText("Logout");
        jButtonLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabel1.setText("Logado como:");

        jlUsername.setText("userzao");

        jMenu2.setText("Publications");

        jmAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/publication_add.png"))); // NOI18N
        jmAdd.setText("Add");

        jmiAddBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAddBook.setText("Book");
        jmiAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddBookActionPerformed(evt);
            }
        });
        jmAdd.add(jmiAddBook);

        jmiAddArticle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAddArticle.setText("Article");
        jmiAddArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddArticleActionPerformed(evt);
            }
        });
        jmAdd.add(jmiAddArticle);

        jMenu2.add(jmAdd);

        jmList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/list.png"))); // NOI18N
        jmList.setText("List");

        jmiListBook.setText("Book");
        jmiListBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListBookActionPerformed(evt);
            }
        });
        jmList.add(jmiListBook);

        jmiListArticles.setText("Articles");
        jmiListArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListArticlesActionPerformed(evt);
            }
        });
        jmList.add(jmiListArticles);

        jMenu2.add(jmList);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Accounts");

        jmiCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/user_add.png"))); // NOI18N
        jmiCreate.setText("Create");
        jmiCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCreateActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCreate);

        jmiListAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/list.png"))); // NOI18N
        jmiListAccounts.setText("List Accounts");
        jmiListAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListAccountsActionPerformed(evt);
            }
        });
        jMenu3.add(jmiListAccounts);

        jMenuBar1.add(jMenu3);

        jmLog.setText("Log");

        jmcbOn.setSelected(true);
        jmcbOn.setText("On");
        jmcbOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcbOnActionPerformed(evt);
            }
        });
        jmLog.add(jmcbOn);

        jmcbOff.setText("Off");
        jmcbOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcbOffActionPerformed(evt);
            }
        });
        jmLog.add(jmcbOff);

        jMenuBar1.add(jmLog);

        jmOffline.setText("Offline Mode");

        jmcbOfflineOn.setText("On");
        jmcbOfflineOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcbOfflineOnActionPerformed(evt);
            }
        });
        jmOffline.add(jmcbOfflineOn);

        jmcbOfflineOff.setSelected(true);
        jmcbOfflineOff.setText("Off");
        jmcbOfflineOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcbOfflineOffActionPerformed(evt);
            }
        });
        jmOffline.add(jmcbOfflineOff);

        jMenuBar1.add(jmOffline);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jlUsername)))
                .addGap(0, 315, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddBookActionPerformed
        
        System.out.println("tamo no modo ofF?" + isOfflineMode);
        
        if (isOfflineMode) {
            JOptionPane.showMessageDialog(this, "Erro, não se pode adicionar livro no modo offline!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        addBook = new AddBookForm();             
        
        addBook.setVisible(true);
        
    }//GEN-LAST:event_jmiAddBookActionPerformed

    private void jmiAddArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddArticleActionPerformed
        
        System.out.println("tamo no modo ofF?" + isOfflineMode);
        if (isOfflineMode) {
            JOptionPane.showMessageDialog(this, "Erro, não se pode adicionar publicação no modo offline!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        addArticle = new AddArticleForm();
        
        addArticle.setVisible(true);
        
    }//GEN-LAST:event_jmiAddArticleActionPerformed

    private void jmiListBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListBookActionPerformed

        listBooks = new ListBooksForm();
        if (listBooks.hasError) listBooks.dispose();
        else listBooks.setVisible(true);
        
    }//GEN-LAST:event_jmiListBookActionPerformed

    private void jmiListArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListArticlesActionPerformed

        listArticles = new ListArticlesForm();
        if (listArticles.hasError) listArticles.dispose();
        else listArticles.setVisible(true);
        
    }//GEN-LAST:event_jmiListArticlesActionPerformed

    private void jmiCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCreateActionPerformed
        
        createAccount = new CreateAccountForm();
        
        createAccount.setVisible(true);
        
    }//GEN-LAST:event_jmiCreateActionPerformed

    private void jmiListAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListAccountsActionPerformed
       listAccounts = new ListAccountsForm(this, true);
       listAccounts.setVisible(true);
    }//GEN-LAST:event_jmiListAccountsActionPerformed

    private void jmcbOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOnActionPerformed
        jmcbOff.setSelected(false);
        jmcbOn.setSelected(true);
        
        LogController.setLogStatus(true);
    }//GEN-LAST:event_jmcbOnActionPerformed

    private void jmcbOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOffActionPerformed
        jmcbOn.setSelected(false);
        jmcbOff.setSelected(true);
        
        LogController.setLogStatus(false);
    }//GEN-LAST:event_jmcbOffActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        
        previousWindow.restart();
        
        
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jmcbOfflineOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOfflineOnActionPerformed
        jmcbOfflineOff.setSelected(false);
        isOfflineMode = true;
    }//GEN-LAST:event_jmcbOfflineOnActionPerformed

    private void jmcbOfflineOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOfflineOffActionPerformed
        jmcbOfflineOn.setSelected(false);
        isOfflineMode = false;
    }//GEN-LAST:event_jmcbOfflineOffActionPerformed

    /*
    private void restrictFileChooser(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Academic Library files", "al");
        jfcFileChooser.setFileFilter(filter);
    }
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JFileChooser jfcFileChooser;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JMenu jmAdd;
    private javax.swing.JMenu jmList;
    private javax.swing.JMenu jmLog;
    private javax.swing.JMenu jmOffline;
    private javax.swing.JCheckBoxMenuItem jmcbOff;
    private javax.swing.JCheckBoxMenuItem jmcbOfflineOff;
    private javax.swing.JCheckBoxMenuItem jmcbOfflineOn;
    private javax.swing.JCheckBoxMenuItem jmcbOn;
    private javax.swing.JMenuItem jmiAddArticle;
    private javax.swing.JMenuItem jmiAddBook;
    private javax.swing.JMenuItem jmiCreate;
    private javax.swing.JMenuItem jmiListAccounts;
    private javax.swing.JMenuItem jmiListArticles;
    private javax.swing.JMenuItem jmiListBook;
    // End of variables declaration//GEN-END:variables
}
