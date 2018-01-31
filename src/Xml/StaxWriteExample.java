package Xml;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StaxWriteExample {
    public static void main(String[] args) {

        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter("result.xml"));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("BookCatalogue");

            for (int i = 0; i < 5; i++) {
                writer.writeStartElement("Book");
                //Title
                writer.writeStartElement("Title");
                writer.writeCharacters("Book #" + i);
                writer.writeEndDocument();

                //Author
                writer.writeStartElement("Author");
                writer.writeCharacters("Author #" + i);
                writer.writeEndDocument();

                //Date
                writer.writeStartElement("Date");
                writer.writeCharacters(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                writer.writeEndDocument();

                //Isbn
                writer.writeStartElement("ISBN");
                writer.writeCharacters("ISBN #" + i);
                writer.writeEndDocument();

                //Publish
                writer.writeStartElement("Publisher");
                writer.writeCharacters("Publisher #" + i);
                writer.writeEndDocument();

                //Currency
                writer.writeStartElement("Cost");
                writer.writeAttribute("Currency ", "USD");
                writer.writeCharacters(" " + (i + 10));
               writer.writeEndDocument();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();


        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }


    }
}
