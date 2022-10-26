/*
* Cria um documento XML simples
*/

package br.edu.unijui.xml.exemplos;


import br.edu.unijui.xml.ManipuladorXML;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
* <Produto>
*   <Id> </id>
*   <Nome> ... </Nome>
*   <Valor> ... </Valor>
* </Produto>
* 
*/
public class CriarDocumentoXML {

	static Document doc;
	
	public static void main(String[] args)                                                                                                                                                  throws Exception
	{
		doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

		// <Produto>
		Element root = doc.createElement("Produto");
		doc.appendChild(root);

		// <Id>
		Element id = doc.createElement("Id");
		id.setTextContent("12");
		root.appendChild(id);

		// <Nome>
		Element nome = doc.createElement("Nome");
		nome.setTextContent("Computador");
		root.appendChild(nome);

		// <Valor>
		Element valor = doc.createElement("Valor");
		valor.setAttribute("ehMuitoCaro", "sim caraio");
		valor.setTextContent("2000,00");
		root.appendChild(valor);	

		innerValores(5, valor);

		ManipuladorXML.writeXmlFile(doc, "./produto.xml");
	}

	public static void innerValores(int amount, Element root) {
		if (amount == 0) return;

		
		Element child = doc.createElement(root.getTagName());
		root.appendChild(child);
		amount--;
		
		if (amount == 0)
		root.setAttribute("cabei", "sim 👍🤣😂😁");

		innerValores(amount, child);
	}
}
