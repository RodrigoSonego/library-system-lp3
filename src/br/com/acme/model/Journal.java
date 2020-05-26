package br.com.acme.model;

public class Journal {

    private String name;
    private byte impactFactor;
    private Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(byte impactFactor) {
        this.impactFactor = impactFactor;
    }
}
