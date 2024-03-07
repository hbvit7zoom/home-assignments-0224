package ru.sberbank.jd.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainObjectOutputStream {

    public static void main(String[] args) {

        String str = "Вася";

        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("1.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(str);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
