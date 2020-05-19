
package com.acme;

/**
 * Idioma
 * Páginas
 */
public class Book extends Publication {
    private String language;
    private long isbn;
    short pages;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }
    
    
}
