
package br.com.acme.connection;


public class ArticleDatabaseConnector {
    
    private int idArticle;
    private int FK_idUser;
    private String title;
    private int year;
    private String Author;
    private String doi;
    private String journal;
    private DataBaseConnection connection;

    public DataBaseConnection getConnection() {
        return connection;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
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
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
    
    
}
