/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;
/**
 *
 * @author USER
 */
public class MainWindow extends javax.swing.JFrame {

    private AddBookForm addBook;
    private AddArticleForm addArticle;
    private CreateAccountForm createAccount;
    private ListAccountsForm listAccounts;
    private ListArticlesForm listArticles;
    private ListBooksForm listBooks;     
    
    public MainWindow(String username) {
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

        jfcFileChooser = new javax.swing.JFileChooser();
        jtbMenu = new javax.swing.JToolBar();
        jbmbCreateAccount = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Library Control System");
        setResizable(false);

        jtbMenu.setRollover(true);

        jbmbCreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/user_add.png"))); // NOI18N
        jbmbCreateAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbmbCreateAccount.setFocusable(false);
        jbmbCreateAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmbCreateAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbmbCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmbCreateAccountActionPerformed(evt);
            }
        });
        jtbMenu.add(jbmbCreateAccount);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 311, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddBookActionPerformed
        
        addBook = new AddBookForm();             
        
        addBook.setVisible(true);
        
    }//GEN-LAST:event_jmiAddBookActionPerformed

    private void jmiAddArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddArticleActionPerformed
               
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

    private void jbmbCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmbCreateAccountActionPerformed
        jmiCreateActionPerformed(evt);
    }//GEN-LAST:event_jbmbCreateAccountActionPerformed

    private void jmcbOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOnActionPerformed
        jmcbOff.setSelected(false);
    }//GEN-LAST:event_jmcbOnActionPerformed

    private void jmcbOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOffActionPerformed
        jmcbOn.setSelected(false);
    }//GEN-LAST:event_jmcbOffActionPerformed

    /*
    private void restrictFileChooser(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Academic Library files", "al");
        jfcFileChooser.setFileFilter(filter);
    }
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbmbCreateAccount;
    private javax.swing.JFileChooser jfcFileChooser;
    private javax.swing.JMenu jmAdd;
    private javax.swing.JMenu jmList;
    private javax.swing.JMenu jmLog;
    private javax.swing.JCheckBoxMenuItem jmcbOff;
    private javax.swing.JCheckBoxMenuItem jmcbOn;
    private javax.swing.JMenuItem jmiAddArticle;
    private javax.swing.JMenuItem jmiAddBook;
    private javax.swing.JMenuItem jmiCreate;
    private javax.swing.JMenuItem jmiListAccounts;
    private javax.swing.JMenuItem jmiListArticles;
    private javax.swing.JMenuItem jmiListBook;
    private javax.swing.JToolBar jtbMenu;
    // End of variables declaration//GEN-END:variables
}
