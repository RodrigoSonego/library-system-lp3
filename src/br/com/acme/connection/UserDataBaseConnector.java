package br.com.acme.connection;
import br.com.acme.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDataBaseConnector {

   
    public void InsertUser(User user) {
        
        Connection con = DataBaseConnection.getConnection();
        PreparedStatement ptstm = null;
        String SQL = "INSERT INTO user(login, email, password) "
                + " VALUES(?, ?, ?)";
        
        try {
            
            ptstm = con.prepareStatement(SQL);
            ptstm.setString(1, user.getLogin());
            ptstm.setString(2, user.getEmail());
            ptstm.setInt(3, user.getPassword());
            
            ptstm.executeUpdate();
            
            
        } catch (SQLException e) {
            
        }finally{
           // DataBaseConnection.closeConnection(con, ptstm);
        }
    }
    
    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        
        Connection con = DataBaseConnection.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            
            ResultSet result = stmt.executeQuery("select * from `user`");

            while (result.next()) {                
                int id = result.getInt(1);
                String login = result.getString(2);
                String email = result.getString(3);
                int password = result.getInt(4);
                
                User user = new User(login, password, email);
                
                users.add(user);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        
        return users;
    }
}
