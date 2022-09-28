package br.com.acme.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBaseConnection {
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/library_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(){
        try {
            //estabelece a conexão com o banco de dados
            Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            return connection;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar o Banco de Dados. " + ex.getMessage());
        }
        
        return null;
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
