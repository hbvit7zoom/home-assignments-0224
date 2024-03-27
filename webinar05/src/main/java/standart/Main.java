package standart;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Book book = new Book("Толстой", "Война и мир", 2024);
//        System.out.println(book);
//
//        OutputStream outputStream = Files.newOutputStream(Paths.get("book.bin"));
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        objectOutputStream.writeObject(book);
//        objectOutputStream.close();

        InputStream inputStream = Files.newInputStream(Paths.get("book.bin"));
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Book book1 = (Book) objectInputStream.readObject();
        System.out.println(book1);
    }
}
