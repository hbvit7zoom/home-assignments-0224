package ru.sberbank.jd.gen;

import ru.sberbank.jd.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Integer i = 1;
//        list.add(i);


        List<Book> books = new ArrayList<>();
        books.add(new Book("Имя2", "Фамилия2", null, null));
        books.add(new Book("Имя3", "Фамилия2", null, null));
        books.add(new Book("Имя5", "Фамилия2", null, null));
        books.add(new Book("Имя5", "Фамилия2", null, null));

        books.stream()
                .filter(book -> book.getFirstname().contains("5"))
                .map(book -> book.getFirstname())
                        .count();

//        System.out.println(list1);
    }
}
