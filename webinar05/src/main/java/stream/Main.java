package stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Толстой", "Война и мир", 2024);
        Book book2 = new Book("Пушкин", "Капитанская дочка", 2020);
        Book book3 = new Book("Горький", "Детство", 2016);
        Book book4 = new Book("Горький", "Детство", 2015);
        Book book5 = new Book("Горький", "Детство", 2013);

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        long count = list.stream()
                .count();
        System.out.println("Count: " + count);

        long count1 = list.stream()
                .filter(book -> book.getYear() > 2019)
                .count();
        System.out.println("Count greater than 2019: " + count1);

        List<String> collect = list.stream()
                .filter(book -> book.getYear() > 2019)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());

        System.out.println("List of titles: " + collect);

        List<String> authors = list.stream()
                .map(book -> book.getAuthor())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(authors);

        Map<String, Book> booksByAuthors = list.stream()
                .collect(Collectors.toMap(book -> book.getAuthor(), book -> book, (a, b) -> b));

        System.out.println("Books By Author: " + booksByAuthors);

//        Map<String, List<Book1>> booksListByAuthors = list.stream()
//                .collect(Collectors.groupingBy(book -> book.getAuthor(), new Collector<Book, Book1, List<Book1>>));
//        System.out.println(booksListByAuthors);

//                Map<String, List<Book1>> booksListByAuthors = list.stream()
//                        .map(book -> new (book1.getAuthor(), new Book1()))
//                .collect(Collectors.groupingBy(book -> book.getAuthor(), new Collector<Book, Book1, List<Book1>>));
//        System.out.println(booksListByAuthors);

        booksByAuthors.entrySet().stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }
}
