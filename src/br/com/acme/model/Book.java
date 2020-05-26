package br.com.acme.model;

public class Book extends Publication {

    private String language;
    private long isbn;
    private short pages;

    public Book(){
        super();
    }
    
    public Book(String title, short year, byte volume, String language, long isbn, short pages){
        super(title,year,volume);
        this.isbn = isbn;
        this.pages = pages;
        this.language = language;
        //3 - não causa problema pois o construtor default não inicia nenhuma variável;
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
