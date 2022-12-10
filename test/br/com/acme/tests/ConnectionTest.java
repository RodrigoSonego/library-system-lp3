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
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ConnectionTest {
    Article testArticle;
    
    @Before
    public void setup(){
        testArticle = null;
    }
    
    @Test
    public void loginTest(){
        User loggedUser = UserDataBaseConnector.login("adm", "123");
        assertNotNull(loggedUser);
        
        Session.startSession(loggedUser);
    }
    
    @Test
    public void insertArticle() {
        System.out.println("insert Article");
        
        testArticle = new Article("ArtigoTeste", (short)1234, "AutorTeste", "123-45.6", "JournalTeste");
        boolean result = ArticleDatabaseConnector.InsertArticle(testArticle);
        
        assertTrue("insert article test", result);
    }
    
    @Test
    public void getArticleFromDatabase() {
        ArrayList<Article> articles = ArticleDatabaseConnector.getAllArticlesFromUser();
        
        boolean hasFoundArticle = false;
        for(Article art : articles) {
            if (art.getTitle().equals(testArticle.getTitle())) {
                hasFoundArticle = true;
                break;
            }
        }
        
        assertTrue("Get Article Test", hasFoundArticle);
    }
}
