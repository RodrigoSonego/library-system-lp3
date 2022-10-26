/*
 * Exibir um documento XML em String
 */

package br.edu.unijui.xml.exemplos;

import br.edu.unijui.xml.ManipuladorXML;
import org.w3c.dom.Document;

public class DocumentToString {

    public static void main(String[] args) {
        Document doc = ManipuladorXML.readXmlFile("./produto.xml");
        
        String texto = ManipuladorXML.xmlParaString(doc);
        System.out.println("XML produto.xml:");
        System.out.println(texto);
    }
}
