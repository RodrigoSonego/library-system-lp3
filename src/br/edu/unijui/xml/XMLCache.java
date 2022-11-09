package br.edu.unijui.xml;

import br.com.acme.model.Article;
import br.com.acme.model.Book;
import br.com.acme.model.User;
import br.com.acme.model.logic.LogController;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLCache {
    
    public static final XMLCache instance = new XMLCache();
    
    private AcademicLibraryData data;
    private Document doc;
    
    private XMLCache() {
        data = new AcademicLibraryData();
    }

    
    public void serialize() {
        try {
            doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = doc.createElement("AcademicLibrary");
            doc.appendChild(root);
            
            appendOfflineMode(root);
            appendArticles(root);
            appendBooks(root);

            ManipuladorXML.writeXmlFile(doc, "./cache.xml");            
        } catch (Exception ex) {
            Logger.getLogger(XMLCache.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public AcademicLibraryData deserialize() {
        
        return null;
        
    }
    
    public void setOfflineMode(boolean isOfflineMode) {
        data.isOfflineMode = isOfflineMode;
    }
    
    public void setArticles(ArrayList<Article> articles) {
        data.articles = articles;
    }
    
    public void setBooks(ArrayList<Book> books) {
        data.books = books;
    }
    
    public void setUsers(ArrayList<User> users) {
        data.users = users;
    }

    
    private XMLCache appendOfflineMode(Element root) {
        Element offlineModeElement = doc.createElement("OfflineMode");
        offlineModeElement.setTextContent(data.isOfflineMode ? "true" : "false");
        root.appendChild(offlineModeElement);
        
        return instance;
    }
    
    private void appendAny(Element root, List toAppend, Class classOfObjectToAppend) {
        if (toAppend == null) return;
        
        Field[] fields = classOfObjectToAppend.getDeclaredFields();
        Field[] baseFields = classOfObjectToAppend.getSuperclass().getDeclaredFields();
        
        Field[] allFields = new Field[fields.length + baseFields.length];
        System.arraycopy(fields, 0, allFields, 0, fields.length);
        System.arraycopy(baseFields, 0, allFields, fields.length, baseFields.length);
        
        String className = classOfObjectToAppend.getSimpleName();
        Element articlesElement = doc.createElement("List");
        articlesElement.setAttribute("type", className);
        
        for (Object objToAppend : toAppend) {
            Element articleElement = doc.createElement(className);
            
            for (Field field : allFields) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(objToAppend);
                    articleElement.setAttribute(field.getName(), String.valueOf(obj));
                } catch (Exception any) {
                    LogController.writeLog(String.format("Exception in {0}", (Object)any.getStackTrace()));
                }
            }
            
            articlesElement.appendChild(articleElement);
        }
 
        root.appendChild(articlesElement);
    }
    
    private void appendArticles(Element root) {
        appendAny(root, data.articles, Article.class);
    }
    
    private void appendBooks(Element root) {
        appendAny(root, data.books, Book.class);
    }


    
    class AcademicLibraryData {
        public boolean isOfflineMode;
        public ArrayList<Article> articles;
        public ArrayList<Book> books;
        public ArrayList<User> users;
        
        public AcademicLibraryData copy(){
            
            return null;
            
        }
    }
}
