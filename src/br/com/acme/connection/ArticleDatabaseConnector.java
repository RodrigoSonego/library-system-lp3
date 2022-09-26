package br.com.acme.connection;

import br.com.acme.model.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArticleDatabaseConnector {

    public static void InsertArticle(Article article) {
        Connection con = DataBaseConnection.getConnection();
        PreparedStatement ptstm = null;
        String SQL = "INSERT INTO article(FK_idUser, title, year, author, doi, journal) "
                + " VALUES(?, ?, ?, ?, ?, ?)";
        try {
            con.setAutoCommit(false);
            
            ptstm = con.prepareStatement(SQL);

            ptstm.setInt(1, article.getFK_idUser());
            ptstm.setString(2, article.getTitle());
            ptstm.setInt(3, article.getYear());
            ptstm.setString(4, article.getAuthor());
            ptstm.setString(5, article.getDoi());
            ptstm.setString(6, article.getJournal());

            ptstm.executeUpdate();
            
            con.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
            //gore abaixo
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } finally {
            DataBaseConnection.closeConnection(con, ptstm);
        }
    }

    public ArrayList<Article> getAllArticles() throws SQLException {
        ArrayList<Article> articles = new ArrayList<>();
        Connection con = DataBaseConnection.getConnection();
        Statement stm = null;
        ResultSet rst = null;
        String SQL = "SELECT * FROM article";
        
        try {
            stm = con.createStatement();
            rst = stm.executeQuery(SQL);
            
            while(rst.next()){
                int idArticle = rst.getInt(1);
                int FK_idUser = rst.getInt(2);
                String title = rst.getString(3);
                int year = rst.getInt(4);
                String author = rst.getString(5);
                String doi = rst.getString(6);
                String journal = rst.getString(7);
                
                Article article = new Article(idArticle, FK_idUser, title, (short) year, author, doi, journal);
                articles.add(article);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return articles;
    }
    
}
