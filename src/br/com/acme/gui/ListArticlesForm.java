package br.com.acme.gui;

import br.com.acme.connection.ArticleDatabaseConnector;
import br.com.acme.model.Article;
import br.edu.unijui.xml.XMLCache;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class ListArticlesForm extends javax.swing.JDialog {

    public boolean hasError = false;

    public ListArticlesForm() {

        ArrayList<Article> articles;

        boolean isOnOfflineMode = XMLCache.instance.getCachedData().isOfflineMode;

        if (isOnOfflineMode) {
            articles = XMLCache.instance.getCachedData().articles;
        } else {
            articles = ArticleDatabaseConnector.getAllArticlesFromUser();
        }

        if (articles == null) {
            JOptionPane.showMessageDialog(this, "Erro, nenhuma entrada encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
            hasError = true;
            return;
        }
        if (articles.size() == 0) {
            JOptionPane.showMessageDialog(this, "Você não possui artigos registrados", "Erro", JOptionPane.INFORMATION_MESSAGE);
            hasError = true;
            return;
        }

        initComponents();

        populateTable(articles);

        XMLCache.instance.setArticles(articles);
        XMLCache.instance.serialize();
    }

    private void populateTable(List<Article> articles) {

        jlTotal.setText(String.valueOf(articles.size()));

        TableModel model = jtArticleList.getModel();

        int line = 0;
        for (Article a : articles) {
            model.setValueAt(a.getTitle(), line, 0);

            String author = a.getAuthor();

            model.setValueAt(author, line, 1);
            model.setValueAt(a.getYear(), line, 2);
            model.setValueAt(a.getDoi(), line, 3);
            model.setValueAt(a.getJournal(), line, 4);
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
        jspArticleList = new javax.swing.JScrollPane();
        jtArticleList = new javax.swing.JTable();
        jbClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List of Articles");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Articles in your library");

        jtArticleList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title", "Author", "Year", "DOI", "Journal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspArticleList.setViewportView(jtArticleList);

        jbClose.setText("Close");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Total:");

        jlTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspArticleList, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspArticleList, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClose)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(915, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbClose;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspArticleList;
    private javax.swing.JTable jtArticleList;
    // End of variables declaration//GEN-END:variables
}
