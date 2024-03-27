package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Толстой", "Война и мир", 2024);
        System.out.println(book);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String s;
        try {
            s = mapper.writeValueAsString(book);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            Book book1 = mapper.readValue(s, Book.class);
            System.out.println(book1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
