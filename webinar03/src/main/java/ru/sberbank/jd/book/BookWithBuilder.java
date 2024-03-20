package ru.sberbank.jd.book;

public class BookWithBuilder {

    private String firstname;
    private String lastname;
    private Integer year;
    private String language;

    private boolean isHardCover;

    public BookWithBuilder(String firstname, String lastname, Integer year, String language, boolean isHardCover) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.language = language;
        this.isHardCover = isHardCover;
    }

    static class Builder {

        public String firstname;
        public String lastname;
        public Integer year;
        public String language;

        public boolean isHardCover;

        static Builder builder() {
            return new Builder();
        }

        Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        Builder year(Integer year) {
            this.year = year;
            return this;
        }

        Builder language(String language) {
            this.language = language;
            return this;
        }

        Builder isHardCover(boolean isHardCover) {
            this.isHardCover = isHardCover;
            return this;
        }

        BookWithBuilder toBook() {
            return new BookWithBuilder(firstname, lastname, year, language, isHardCover);
        }
    }

    public static void main(String[] args) {
        BookWithBuilder book = Builder.builder()
                .lastname("Фамилия 2")
                .firstname("Имя 3")
                .isHardCover(false)
                .toBook();

        BookWithBuilder1.Builder.builder()
                .toBook();
    }
}
