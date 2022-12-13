/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.acme.model;

/**
 *
 * @author rodrigo.sonego
 */
public class Magazine extends Publication {
    private int userId;
    private String doi;
    private String topic;

    public Magazine(String title, short year, String author, String doi, MagazineTopic topic) {
        super(title, year);
        this.setAuthor(author);
        this.setDoi(doi);
        this.setTopic(topic);
    }
    
    
    public Magazine() {}

    public static String topicToString(MagazineTopic topic) {
        String topicString = topic.toString();
        return topicString.replace('_', ' ');
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDoi() {
        return doi;
    }
    
    public MagazineTopic getTopic() {
        return MagazineTopic.valueOf(topic);
    }

    private void setDoi(String doi) {
        if (doi.contains(" ")) throw new DoiException("Doi não pode conter espaços");
        
        this.doi = doi;
    }

    private void setTopic(MagazineTopic topic) {
        this.topic = topic.toString();
    }
    
}
