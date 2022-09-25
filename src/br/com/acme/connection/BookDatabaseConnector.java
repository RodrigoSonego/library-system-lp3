/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.connection;


public class BookDatabaseConnector {
    private int idBook;
    private int FK_idUser;
    private String title;
    private int year;
    private String author;
    private String language;
    private String isbn;
    private int pages;
    private DataBaseConnection connection;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getFK_idUser() {
        return FK_idUser;
    }

    public void setFK_idUser(int FK_idUser) {
        this.FK_idUser = FK_idUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public DataBaseConnection getConnection() {
        return connection;
    }

    public void setConnection(DataBaseConnection connection) {
        this.connection = connection;
    }
    
    
}
