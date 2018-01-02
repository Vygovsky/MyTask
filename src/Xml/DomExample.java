package Xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Roman_v on 02.01.2018.
 */
public class DomExample {
    public static void main(String[] args) throws IOException, SAXException {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("E:\\uits\\MyTask\\src\\BookCatalog.xml");

            Node root = document.getDocumentElement();
            System.out.println("List of books");
            System.out.println("*************************");
            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {
                    NodeList bookProps = book.getChildNodes();
                    for (int j = 0; j < bookProps.getLength(); j++) {
                        Node bookProp = bookProps.item(j);
                        if (bookProp.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(bookProp.getNodeName() + ":" + bookProp.getTextContent());
                        }
                    }
                    System.out.println("*************************");
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}

