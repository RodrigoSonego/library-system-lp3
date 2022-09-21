package br.com.acme.model;

import java.io.Serializable;

public class Book extends Publication implements Serializable{

    private String language;
    private long isbn;
    private short pages;
    
    public Book(String title, short year, String language, long isbn, short pages){
        super(title,year);
        this.isbn = isbn;
        this.pages = pages;
        this.language = language;       
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }
}
