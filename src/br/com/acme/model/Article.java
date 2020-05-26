package br.com.acme.model;

import java.util.ArrayList;

public class Article extends Publication {

    private ArrayList<String> keyWords;
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;
    private Journal journal;

    public Article() {
        keyWords = new ArrayList<>();
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public void addKeyWord(String key) {
        keyWords.add(key);
    }

    public ArrayList<String> getKeyWords() {
        return keyWords;
    }

    public boolean removeKeyWord(String key) {
        return keyWords.remove(key);
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public byte getIssue() {
        return issue;
    }

    public void setIssue(byte issue) {
        this.issue = issue;
    }

    public short getStartPage() {
        return startPage;
    }

    public void setStartPage(short startPage) {
        this.startPage = startPage;
    }

    public short getEndPage() {
        return endPage;
    }

    public void setEndPage(short endPage) {
        this.endPage = endPage;
    }
}
