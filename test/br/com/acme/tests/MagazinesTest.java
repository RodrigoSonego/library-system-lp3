/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.tests;

import br.com.acme.connection.ArticleDatabaseConnector;
import br.com.acme.connection.UserDataBaseConnector;
import br.com.acme.model.Article;
import br.com.acme.model.Magazine;
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
public class MagazinesTest {
    
    @Before
    public void setup(){
        
    }
    
    @Test
    public void loginTest(){
        User loggedUser = UserDataBaseConnector.login("adm", "123");
        assertNotNull(loggedUser);
        
        Session.startSession(loggedUser);
    }
    
    @Test
    public void insertArticle() {
        
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
