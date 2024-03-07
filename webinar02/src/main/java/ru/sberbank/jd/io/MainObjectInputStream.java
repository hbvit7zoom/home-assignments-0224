package ru.sberbank.jd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainObjectInputStream {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("1.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            Object o = objectInputStream.readObject();
            System.out.println(o);
            String o1 = (String) o;
            System.out.println(o1);
            Object o3 = new Object();
            System.out.println(o3);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
