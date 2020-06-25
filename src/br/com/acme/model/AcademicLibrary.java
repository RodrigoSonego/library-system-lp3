package br.com.acme.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AcademicLibrary implements ILibrary, Serializable {

    private String name;
    private String description;
    private String creationDate;
    private Map<Long, Article> articles;
    private Map<Long, Book> books;

    private Map<String, User> users;

    public AcademicLibrary(String name, String description, String creationDate) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.articles = new HashMap<>();
        this.books = new HashMap<>();
        this.users = new HashMap<>();
    }

    @Override
    public boolean hasPublication(String publication) {
        return false;
    }

    public ArrayList<User> getUsers() {
        ArrayList<User> tempUsers = new ArrayList<>();
        for (String key : users.keySet()) {
            tempUsers.add(users.get(key));
        }
        return tempUsers;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    public boolean findUser(String login) {

        try {
            users.get(login);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public void addUser(User user) {
        users.put(user.getLogin(), user);
    }

    public boolean removeUser(String login) {

        try {
            users.remove(login);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public void addArticle(Article article) {
        articles.put(article.getIssn(), article);
    }

    public boolean removeArticle(Article article) {

        articles.remove(article.getIssn(), article);
        try {
            articles.remove(article.getIssn(), article);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public boolean removeBook(Book book) {
        try {
            books.remove(book.getIsbn(), book);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean removeBook(long isbn){
        try{
            books.remove(isbn);
            return true;
        } catch (Exception ex){
            return false;
        }
    }
    
    public boolean removeArticle(long issn){
        try{
            articles.remove(issn);
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    public int countArticles() {
        return articles.size();
    }

    public int countBooks() {
        return books.size();
    }

    public Article findArticle(long issn) {
        try {
            return articles.get(issn);
        } catch (Exception ex) {
            return null;
        }
    }

    public Article findArticle(String title) {
        for (Article a : getAllArticles()) {
            if (a.getTitle().equals(title)) {
                return a;
            }
        }
        return null;
    }

    public Book findBook(long isbn) {
        try {
            return books.get(isbn);
        } catch (Exception ex) {
            return null;
        }
    }

    public Book findBook(String title) {
        for (Book b : getAllBooks()) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
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
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> b = new ArrayList<>();
        for (long key : books.keySet()) {
            b.add(books.get(key));
        }
        return b;
    }

    public ArrayList<Article> getAllArticles() {
        ArrayList<Article> a = new ArrayList<>();
        for (long key : articles.keySet()) {
            a.add(articles.get(key));
        }
        return a;
    }

    @Override
    public void addPublication(Publication pub) {
        if(pub instanceof Book)
            addBook((Book)pub);        
        else if (pub instanceof Article)
            addArticle((Article)pub);
    }

    @Override
    public boolean removePublication(long id) {
        return (removeArticle(id) || removeBook(id));
    }

    @Override
    public ArrayList<Publication> getAllPublications() {
        ArrayList<Publication> temp = new ArrayList<>();
        temp.addAll(getAllBooks());
        temp.addAll(getAllArticles());
        return temp;
    }

    @Override
    public short countPublications() {
        return (short)(books.size() + articles.size());
    }

    @Override
    public Publication findPublication(String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
