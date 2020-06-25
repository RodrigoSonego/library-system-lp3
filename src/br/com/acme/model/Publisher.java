package br.com.acme.model;

import java.io.Serializable;

public class Publisher implements Serializable{

    private String name;
    private String country;

    
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }    
   
    public Publisher(String name, String country){
        this.name = name;
        this.country = country;
        
    }
            
}
