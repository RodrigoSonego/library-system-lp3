/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme;

import java.util.ArrayList;

/**
 *
 * @author USER
 */

 abstract class Animal{
    ArrayList<Animal> seila = new ArrayList<>();
}

class Dog extends Animal{
    
}

public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AcademicLibrary al = new AcademicLibrary();
        
        Article a1 = new Article();
        Article a2 = new Article();
        
        Dog d = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d.seila.add(d);
        d.seila.add(d2);
        d.seila.add(d3);
        
  
        for (Animal a : d.seila){
            if (a instanceof Dog == true){
                System.out.println("abom");
        }
        
        
        
       // System.out.println(al.countArticles());
    }
   }
    
}

