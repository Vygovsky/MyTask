package Xml;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class DomExample2 {
    public static void main(String[] args) throws TransformerConfigurationException {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("BookCatalog.xml");

            addElement(document);

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void addElement(Document document) throws TransformerConfigurationException, DOMException {
        Node root = document.getDocumentElement();

        Element book = document.createElement("Book");
        Element title = document.createElement("Title");
        title.setTextContent("Java для чайников или как создать ИИ?");

        Element author = document.createElement("Author");
        author.setTextContent("Сергей Петрыкин");

        Element date = document.createElement("Date");
        date.setTextContent("2019");

        Element isbn = document.createElement("ISBN");
        isbn.setTextContent("009-668-88");

        Element publish = document.createElement("Publish");
        publish.setTextContent("Java-Course publisher");

        Element cost = document.createElement("Cost");
        cost.setTextContent("1500");

        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(date);
        book.appendChild(isbn);
        book.appendChild(cost);

        root.appendChild(book);
        writeDocument(document);

    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource domSource=new DOMSource(document);
            FileOutputStream fos=new FileOutputStream("Other.xml");
            StreamResult result=new StreamResult(fos);
            tr.transform(domSource,result);
        }catch (TransformerException|IOException e){
            e.printStackTrace();
        }
    }
}