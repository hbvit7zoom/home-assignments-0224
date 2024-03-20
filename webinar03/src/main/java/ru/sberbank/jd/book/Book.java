package ru.sberbank.jd.book;

public class Book {

    private String firstname;
    private String lastname;
    private Integer year;
    private String language;

    public Book() {
    }

    public Book(String firstname, String lastname, Integer year, String language) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.language = language;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setFirstname("Имя1");
        book1.setLastname("Фамилия1");

        Book book2 = new Book("Имя2", "Фамилия2", null, null);
    }
}
