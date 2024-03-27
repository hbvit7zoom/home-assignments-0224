package xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Толстой", "Война и мир", 2024);
        book.toString();

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String s;
        try {
            s = xmlMapper.writeValueAsString(book);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

//        try {
//            xmlMapper.writeValue(new File("1.xml"), book);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Book book1;
        try {
            book1 = xmlMapper.readValue(s, Book.class);
            System.out.println(book1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }



        System.out.println(book.equals(book1));
    }
}
