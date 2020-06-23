package br.com.acme.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AcademicLibrary implements ILibrary {

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
    public boolean hasPublication(String publication){
        return false;
    }


    public Map<String, User> getUsers() {
        
        return users;
    }
    public void setUsers(String login, User user){
        this.users.put(login, user);
    }
    
    public boolean findUser(String login){
   
        try{
            users.get(login);
            return true;
        }catch(Exception ex){
            return false;
    }
    }
    public void addUser(User user){
        users.put(user.getLogin(), user);
        
    }
    
    public boolean removeUser(String login){
       
       try{
            users.remove(login);
            return true;
        }catch(Exception ex){
            return false;
    }
       
       
    }
            
    

    public void addArticle(Article article){
        articles.put(article.getIssn(), article);
    }
    
    public boolean removeArticle(Article article){
        
        articles.remove(article.getIssn(), article);
        try{
            articles.remove(article.getIssn(), article);
            return true;
        }catch(Exception ex){
            return false;
    }
    }
    
    public void addBooks(Book book){
        books.put(book.getIsbn(), book);
    }
    
    public boolean removeBook(Book book){
        books.remove(book.getIsbn(), book);
        try{
            books.remove(book.getIsbn(), book);
            return true;
        }catch(Exception ex){
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
       return articles.get(issn);
    }

    public Article findArticle(String title) {
       for(Article a: getAllArticles()){
           if(a.getTitle().equals(title)){
               return a;
           }
           
       }
       return null;
    }

    public Book findBook(long isbn) {
        return books.get(isbn);
    }

    public Book findBook(String title) {
       for(Book b: getAllBooks()){
           if(b.getTitle().equals(title)){
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
    
    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> b = new ArrayList<>();
        for(long key: books.keySet()) {
            b.add(books.get(key));
        }
        return b;
    }
    public ArrayList<Article> getAllArticles(){
        ArrayList<Article> a = new ArrayList<>();
        for(long key: articles.keySet()) {
            a.add(articles.get(key));
        }
        return a;
    }

    @Override
    public void addPublication(Publication arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removePublication(long arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Publication> getAllPublications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public short countPublications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publication findPublication(String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
