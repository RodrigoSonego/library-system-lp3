package br.com.acme.model;

public class User {

    private int idUser;
    private String login;
    private int password;
    private String email;

    public User() {}
    
    public User(String login, int password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }
    
    public User(int id, String login, int password, String email) {
        this.idUser = id;
        this.login = login;
        this.password = password;
        this.email = email;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
    
    public int getIdUser() {
        return idUser;
    }
}
