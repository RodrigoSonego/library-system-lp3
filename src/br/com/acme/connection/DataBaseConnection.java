package br.com.acme.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseConnection {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/library_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection(){

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Não deu", e);
        }
    }

    public static void closeConnection(Connection conection) {
        try {
            if (conection != null) {
                conection.close();
            }
        } catch (SQLException e) {

        }

    }
    
    public static void closeConnection(Connection conection, PreparedStatement stmt) {
        closeConnection(conection);
        
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {

        }

    }
    
    public static void closeConnection(Connection conection, PreparedStatement stmt, ResultSet rst) {
        closeConnection(conection, stmt);
        
        try {
            if (rst != null) {
                stmt.close();
            }
        } catch (SQLException e) {

        }

    }
    
    

}
