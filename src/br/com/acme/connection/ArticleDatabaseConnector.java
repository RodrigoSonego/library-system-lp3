package br.com.acme.connection;

import br.com.acme.model.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArticleDatabaseConnector {

    public void InsertArticle(Article article) {
        Connection con = DataBaseConnection.getConnection();
        PreparedStatement ptstm = null;
        String SQL = "INSERT INTO article(FK_idUser, title, year, author, doi, journal) "
                + " VALUES(?, ?, ?, ?, ?, ?)";
        try {
            ptstm = con.prepareStatement(SQL);

            ptstm.setInt(1, article.getFK_idUser());
            ptstm.setString(2, article.getTitle());
            ptstm.setInt(3, article.getYear());
            ptstm.setString(4, article.getAuthor());
            ptstm.setString(5, article.getDoi());
            ptstm.setString(6, article.getJournal());

            ptstm.executeUpdate();
        } catch (SQLException e) {
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
