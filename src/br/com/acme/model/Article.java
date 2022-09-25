package br.com.acme.model;

public class Article extends Publication {

    private String doi;
    private String journal;
    
    public Article(String title, short year, String doi){
        
        super(title,year);
        this.doi = doi;
        
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}
