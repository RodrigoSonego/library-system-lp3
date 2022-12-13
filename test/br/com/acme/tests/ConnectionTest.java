/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.tests;

import br.com.acme.connection.ArticleDatabaseConnector;
import br.com.acme.connection.UserDataBaseConnector;
import br.com.acme.model.Article;
import br.com.acme.model.Session;
import br.com.acme.model.User;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ConnectionTest {
    Article testArticle = new Article("ArtigoTeste", (short)1234, "AutorTeste", "123-45.6", "JournalTeste");
    
    @Test
    public void loginTest(){
        User loggedUser = UserDataBaseConnector.login("adm", "123");
        assertNotNull(loggedUser);
        
        Session.startSession(loggedUser);
    }
    
    @Test
    public void insertArticle() {
        System.out.println("insert Article");
        
        boolean result = ArticleDatabaseConnector.InsertArticle(testArticle);
        
        assertTrue("insert article test", result);
    }
    
    @Test
    public void getArticleFromDatabase() {
        ArrayList<Article> articles = ArticleDatabaseConnector.getAllArticlesFromUser();
        
        boolean hasFoundArticle = false;
        System.out.println(testArticle.getTitle());
        for(Article art : articles) {
            System.out.println(art.getTitle());
            if (art.getTitle().equals(testArticle.getTitle())) {;
                hasFoundArticle = true;
                break;
            }
        }
        
        assertTrue("Get Article Test", hasFoundArticle);
    }
}
