package br.com.acme.connection;
import br.com.acme.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            DataBaseConnection.closeConnection(con, ptstm);
        }
    }

}
