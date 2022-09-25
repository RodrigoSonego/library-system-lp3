
package br.com.acme.connection;

import br.com.acme.model.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ArticleDatabaseConnector {
    
    public void InsertArticle(Article article){
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
        }finally{
            DataBaseConnection.closeConnection(con, ptstm);
        }
    }
}
