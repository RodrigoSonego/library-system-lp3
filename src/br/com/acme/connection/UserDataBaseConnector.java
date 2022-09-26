package br.com.acme.connection;

import br.com.acme.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDataBaseConnector {

    public boolean InsertUser(User user) throws SQLException {

        Connection con = DataBaseConnection.getConnection();
        PreparedStatement ptstm = null;
        String SQL = "INSERT INTO user(login, email, password) "
                + " VALUES(?, ?, ?)";
        
        try {
            con.setAutoCommit(false);
            
            ptstm = con.prepareStatement(SQL);
            ptstm.setString(1, user.getLogin());
            ptstm.setString(2, user.getEmail());
            ptstm.setString(3, user.getPassword());

            ptstm.executeUpdate();

            con.commit();
            return true;
            
        } catch (SQLException e) {
            System.out.println("ih rapaiz deu ruim");
            
            con.rollback();
            
        } finally {
            DataBaseConnection.closeConnection(con, ptstm);    
        }
        
        return false;
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        Connection con = DataBaseConnection.getConnection();

        try {
            Statement stmt = con.createStatement();

            ResultSet result = stmt.executeQuery("select * from `user`");

            while (result.next()) {
                int id = result.getInt(1);
                String login = result.getString(2);
                String email = result.getString(3);
                String password = result.getString(4);

                User user = new User(login, password, email);

                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return users;
    }

    public boolean login(String login, String password) {

        Connection con = DataBaseConnection.getConnection();

        PreparedStatement pstmt = null;

        String query = "SELECT idUser from `user` WHERE login = ? AND password = ?";
        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, login);
            pstmt.setString(2, password);
            
            ResultSet result = pstmt.executeQuery();
            
            boolean isValid = result.next();
            
            return isValid;
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDataBaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu ruim no login");
        }
        
        return false;
    }
}
