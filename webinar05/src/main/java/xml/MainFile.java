package xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) {
        Book book = new Book("Толстой", "Война и мир", 2024);
        book.toString();

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);


        try {
            xmlMapper.writeValue(new File("1.xml"), book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Book1 book1;
        try {
            book1 = xmlMapper.readValue(new File("1.xml"), Book1.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(book1.toString());
    }
}
