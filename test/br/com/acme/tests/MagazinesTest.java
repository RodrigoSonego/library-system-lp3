/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.tests;

import br.com.acme.connection.ArticleDatabaseConnector;
import br.com.acme.connection.UserDataBaseConnector;
import br.com.acme.model.Article;
import br.com.acme.model.DoiException;
import br.com.acme.model.Magazine;
import br.com.acme.model.MagazineTopic;
import br.com.acme.model.Session;
import br.com.acme.model.User;
import br.com.acme.model.logic.LogController;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.LogManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MagazinesTest {
    
    @Test
    public void logEnabledTest() {
        boolean isLogEnabled = LogController.getLogStatus();
        if (isLogEnabled) {
            
            String lugarParaSalvarLog = "testLog.log";
            
            LogController.logPath = lugarParaSalvarLog;
            LogController.writeLog("testando se o log cria o arquivo corretamente!");
            
            File file = new File(lugarParaSalvarLog);
            assertTrue("nao conseguiu criar o arquivo de log", file.exists());
        }
    }
    
    @Test(expected = DoiException.class)
    public void magazineDoiTest(){
        Magazine magazine = new Magazine("teste", (short)1999, "autor", "doi inválido pq contem espaço", MagazineTopic.Uncategorized);
        magazine.getDoi();
    }
    
}
