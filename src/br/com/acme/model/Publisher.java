package br.com.acme.model;

public class Publisher {

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
