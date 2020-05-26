package br.com.acme.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Publication {

    private String title;
    private short year;
    private byte volume;
    private List<Author> authors;

    public Publication() {
        authors = new ArrayList<>();
    }

    public Publication(String title, short year, byte volume) {
        this();
        this.title = title;
        this.volume = volume;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getVolume() {
        return volume;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }
    
    public void addAuthor(Author author){
        authors.add(author);
    }
    
    public void removeAuthor(String name){
        for (Author aut : authors) {
            if(aut.getName().equals(name))
                authors.remove(aut);
        }
    }
    
    public List<Author> getAuthors(){
        return authors;
    }

}
