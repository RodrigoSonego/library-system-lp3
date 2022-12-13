/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.tests;

import br.com.acme.model.logic.LogController;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogTest {
    @Test
    public void writeLogTest(){
        boolean hasWritten = LogController.writeLog("Testing log write");
        
        assertTrue(hasWritten);
    }
}
