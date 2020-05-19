package com.acme;

import java.util.ArrayList;

public class AcademicLibrary implements ILibrary {

    private String name;
    private String description;
    private String CreationDate;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Publication> publications = new ArrayList<>();

    public short countArticles() {
        int art = 0;
        for (Publication p : publications) {
            if (p instanceof Article == true) {
                art = art + 1;
            }
        }
        return (short) art;
    }

    public short countBooks() {
        int book = 0;
        for (Publication p : publications) {
            if (p instanceof Book == true) {
                book = book + 1;
            }
        }
        return (short) book;
    }

    public Article findArticle(long issn) {
        Article a = null;
        for (int i = 0; i < publications.size(); i++) {
            if ((publications.get(i) instanceof Article) && (((Article) publications.get(i)).getIssn() == issn)) {
                a = (Article) publications.get(i);
            }

        }
        return a;
    }

    public Article findArticle(String title) {
        Article a = null;
        for (int i = 0; i < publications.size(); i++) {
            if ((publications.get(i) instanceof Article) && (publications.get(i).getTitle() == title)) {
                a = (Article) publications.get(i);
            }

        }
        return a;
    }

    public Book findBook(long isbn) {
        Book b = null;
        for (int i = 0; i < publications.size(); i++) {
            if ((publications.get(i) instanceof Book) && (((Book) publications.get(i)).getIsbn() == isbn)) {
                b = (Book) publications.get(i);
            }

        }
        return b;
    }

    public Book findBook(String title) {
        Book b = null;
        for (int i = 0; i < publications.size(); i++) {
            if ((publications.get(i) instanceof Book) && (publications.get(i)).getTitle() == title) {
                b = (Book) publications.get(i);
            }

        }
        return b;
    }
    
    @Override
    public void addPublication(Publication p){
        publications.add(p);
    }
    
    @Override
    public boolean removePublication(long id){
        if (id <= publications.size()){
            publications.remove(id);
            return true;
        } else {
        return false;
        }
    }
    
    @Override
    public ArrayList<Publication> getAllPublications(){
        return publications;
    }
    
    @Override
    public short countPublications(){
        return (short)publications.size();
    }
    
    @Override
    public Publication findPublication(String title){
        Publication pub = null;
        for (Publication p : publications){
            if (p.getTitle() == title){
                pub = p;
            }
        }
        return pub;
    }
    
    @Override
    public boolean hasPublication(String title){
        for (Publication p : publications){
            if (p.getTitle() == title){
                return true;
            }
        }  
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }
    
    public void addUser(User user){
        users.add(user);
    }
    
    public User getUser(int id){
      return users.get(id);   
    }
    
    public boolean removeUser(User user){
        if (users.contains(user)){
            users.remove(user);
            return true;
        }
        return false;
    }

}
