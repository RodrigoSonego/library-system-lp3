/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.connection;

import br.com.acme.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDatabaseConnector {

    public void InsertBook(Book book) {
        Connection con = DataBaseConnection.getConnection();
        PreparedStatement ptstm = null;
        String SQL = "INSERT INTO book(FK_idUser, title, year, author, language, isbn, pages) "
                + " VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            ptstm = con.prepareStatement(SQL);

            ptstm.setInt(1, book.getFK_idUser());
            ptstm.setString(2, book.getTitle());
            ptstm.setInt(3, book.getYear());
            ptstm.setString(4, book.getAuthor());
            ptstm.setString(5, book.getLanguage());
            ptstm.setString(6, book.getIsbn());
            ptstm.setInt(7, book.getPages());

            ptstm.executeUpdate();

        } catch (SQLException e) {
        } finally {
            DataBaseConnection.closeConnection(con, ptstm);
        }

    }

    public ArrayList<Book> getAllBooks() throws SQLException {
        ArrayList<Book> books = new ArrayList<>();
        Connection con = DataBaseConnection.getConnection();
        Statement stm = null;
        ResultSet rst = null;
        String SQL = "SELECT * FROM book";
        
        try {
            stm = con.createStatement();
            rst = stm.executeQuery(SQL);
            
            while(rst.next()){
                int idBook = rst.getInt(1);
                int FK_idUser = rst.getInt(2);
                String title = rst.getString(3);
                int year = rst.getInt(4);
                String author = rst.getString(5);
                String language = rst.getString(6);
                String isbn = rst.getString(7);
                int pages = rst.getInt(8);
                
                Book book = new Book(idBook, FK_idUser, title, (short)year, author, language, isbn, pages);
                books.add(book);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return books;
    }
}
