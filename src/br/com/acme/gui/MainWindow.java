/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.model.*;
import br.com.acme.model.logic.ALManager;
import br.com.acme.model.logic.LogController;
import java.io.File;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    private LogController logController;
    private String currentUsername;           
    
    public MainWindow(String username) {
        initComponents();       
        currentUsername = username;
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
        jbmbNew = new javax.swing.JButton();
        jbmbOpen = new javax.swing.JButton();
        jbmbSave = new javax.swing.JButton();
        jbmbCreateAccount = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiNew = new javax.swing.JMenuItem();
        jmiOpen = new javax.swing.JMenuItem();
        jmiSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiExit = new javax.swing.JMenuItem();
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
        jMenu4 = new javax.swing.JMenu();
        jmiSupport = new javax.swing.JMenuItem();
        jcbmiUpdate = new javax.swing.JCheckBoxMenuItem();
        jmiAbout = new javax.swing.JMenuItem();
        jmLog = new javax.swing.JMenu();
        jmcbOn = new javax.swing.JCheckBoxMenuItem();
        jmcbOff = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Library Control System");
        setResizable(false);

        jtbMenu.setFloatable(false);
        jtbMenu.setRollover(true);

        jbmbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/new.png"))); // NOI18N
        jbmbNew.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jbmbNew.setFocusCycleRoot(true);
        jbmbNew.setFocusable(false);
        jbmbNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmbNew.setPreferredSize(new java.awt.Dimension(32, 16));
        jbmbNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbmbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmbNewActionPerformed(evt);
            }
        });
        jtbMenu.add(jbmbNew);

        jbmbOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/open.png"))); // NOI18N
        jbmbOpen.setBorder(null);
        jbmbOpen.setFocusable(false);
        jbmbOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmbOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbmbOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmbOpenActionPerformed(evt);
            }
        });
        jtbMenu.add(jbmbOpen);

        jbmbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/save.png"))); // NOI18N
        jbmbSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbmbSave.setFocusable(false);
        jbmbSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmbSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbmbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmbSaveActionPerformed(evt);
            }
        });
        jtbMenu.add(jbmbSave);

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

        jMenu1.setText("File");

        jmiNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/new.png"))); // NOI18N
        jmiNew.setText("New");
        jmiNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNewActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNew);

        jmiOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmiOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/open.png"))); // NOI18N
        jmiOpen.setText("Open");
        jmiOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jmiOpen);

        jmiSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/save.png"))); // NOI18N
        jmiSave.setText("Save");
        jmiSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSave);
        jMenu1.add(jSeparator1);

        jmiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/exit.png"))); // NOI18N
        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Publications");

        jmAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/gui/icons/publication_add.png"))); // NOI18N
        jmAdd.setText("Add");

        jmiAddBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmiAddBook.setText("Book");
        jmiAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddBookActionPerformed(evt);
            }
        });
        jmAdd.add(jmiAddBook);

        jmiAddArticle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
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

        jMenu4.setText("Help");

        jmiSupport.setText("Support");
        jMenu4.add(jmiSupport);

        jcbmiUpdate.setSelected(true);
        jcbmiUpdate.setText("Check for updates");
        jMenu4.add(jcbmiUpdate);

        jmiAbout.setText("About");
        jMenu4.add(jmiAbout);

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

        jMenu4.add(jmLog);

        jMenuBar1.add(jMenu4);

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
        
        listBooks.setVisible(true);
        
    }//GEN-LAST:event_jmiListBookActionPerformed

    private void jmiListArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListArticlesActionPerformed
                
         listArticles = new ListArticlesForm();
        
        listArticles.setVisible(true);
        
    }//GEN-LAST:event_jmiListArticlesActionPerformed

    private void jmiOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOpenActionPerformed
                
        int result = jfcFileChooser.showOpenDialog(this);
        if(result == JFileChooser.CANCEL_OPTION)
            return;
        
        File file = jfcFileChooser.getSelectedFile();
        try {
            ALManager.loadLibrary(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        
    }//GEN-LAST:event_jmiOpenActionPerformed

    private void jmiNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNewActionPerformed
        
        
        int result = JOptionPane.showConfirmDialog(this, "Are you sure? All unsaved changes will be lost", "Warning",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            ALManager.newLibrary();
        } else {
            return;
        }
        
    }//GEN-LAST:event_jmiNewActionPerformed

    private void jmiSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaveActionPerformed
               
        int result = jfcFileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = jfcFileChooser.getSelectedFile();
      
            try {
                 ALManager.persistLibrary(file);
                 LogController.writeLog("Library saved with no errors.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error on saving, try again", "Error", JOptionPane.ERROR_MESSAGE);
                LogController.writeLog(e.toString() + "at MainWindow");
            }
           
        }
            
    }//GEN-LAST:event_jmiSaveActionPerformed

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        LogController.writeLog("Exited the system : " + currentUsername);
        System.exit(0);
    }//GEN-LAST:event_jmiExitActionPerformed

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

    private void jbmbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmbSaveActionPerformed
        jmiSaveActionPerformed(evt);
    }//GEN-LAST:event_jbmbSaveActionPerformed

    private void jbmbOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmbOpenActionPerformed
        jmiOpenActionPerformed(evt);
    }//GEN-LAST:event_jbmbOpenActionPerformed

    private void jbmbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmbNewActionPerformed
        jmiNewActionPerformed(evt);
    }//GEN-LAST:event_jbmbNewActionPerformed

    private void jmcbOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOnActionPerformed
        jmcbOff.setSelected(false);
        logController.setLogStatus(true);
    }//GEN-LAST:event_jmcbOnActionPerformed

    private void jmcbOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcbOffActionPerformed
        jmcbOn.setSelected(false);
        logController.setLogStatus(false);
    }//GEN-LAST:event_jmcbOffActionPerformed

    /*
    private void restrictFileChooser(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Academic Library files", "al");
        jfcFileChooser.setFileFilter(filter);
    }
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbmbCreateAccount;
    private javax.swing.JButton jbmbNew;
    private javax.swing.JButton jbmbOpen;
    private javax.swing.JButton jbmbSave;
    private javax.swing.JCheckBoxMenuItem jcbmiUpdate;
    private javax.swing.JFileChooser jfcFileChooser;
    private javax.swing.JMenu jmAdd;
    private javax.swing.JMenu jmList;
    private javax.swing.JMenu jmLog;
    private javax.swing.JCheckBoxMenuItem jmcbOff;
    private javax.swing.JCheckBoxMenuItem jmcbOn;
    private javax.swing.JMenuItem jmiAbout;
    private javax.swing.JMenuItem jmiAddArticle;
    private javax.swing.JMenuItem jmiAddBook;
    private javax.swing.JMenuItem jmiCreate;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiListAccounts;
    private javax.swing.JMenuItem jmiListArticles;
    private javax.swing.JMenuItem jmiListBook;
    private javax.swing.JMenuItem jmiNew;
    private javax.swing.JMenuItem jmiOpen;
    private javax.swing.JMenuItem jmiSave;
    private javax.swing.JMenuItem jmiSupport;
    private javax.swing.JToolBar jtbMenu;
    // End of variables declaration//GEN-END:variables
}
