
package com.acme;
/**
 * Página inicial
 * Página final
 * 
 */
import java.util.ArrayList;


public class Article extends Publication {
    ArrayList<String> keyWords = new ArrayList<>();
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;
    private Journal journal;
    

    public ArrayList<String> getKeyWords() {
        return keyWords;
    }

    public void addKeyWords(String key) {
        keyWords.add(key);
    }
     public boolean removeKeyWord(String key){
      if (keyWords.contains(key)){
          keyWords.remove(key);
          return true;
      } else {
          return false;
      }       
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

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }
     
     
}
        












