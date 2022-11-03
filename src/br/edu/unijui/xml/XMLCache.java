package br.edu.unijui.xml;

import br.com.acme.model.Article;
import br.com.acme.model.Book;
import br.com.acme.model.User;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.graalvm.compiler.core.common.Fields;
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
            
            appendOfflineMode(root).appendArticles(root);
                                    
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
    
    private XMLCache appendArticles(Element root) throws IllegalArgumentException, IllegalAccessException {
        Element articlesElement = doc.createElement("Articles");
        Field[] fields = Article.class.getDeclaredFields();
        Field[] baseFields = Article.class.getSuperclass().getDeclaredFields();
        
        Field[] allFields = new Field[fields.length + baseFields.length];
        System.arraycopy(fields, 0, allFields, 0, fields.length);
        System.arraycopy(baseFields, 0, allFields, fields.length, baseFields.length);
        
        for (Article article : data.articles) {
            Element articleElement = doc.createElement("Article");
            
            for (Field field : allFields) {
                field.setAccessible(true); // lmao
                Object obj = field.get(article);
                articleElement.setAttribute(field.getName(), String.valueOf(obj));
            }
            
            
            
            articlesElement.appendChild(articleElement);
        }
 
        root.appendChild(articlesElement);
        
        return instance;
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
