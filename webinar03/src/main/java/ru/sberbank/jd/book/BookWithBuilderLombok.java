package ru.sberbank.jd.book;

import lombok.Builder;

@Builder
public class BookWithBuilderLombok {

    private String firstname;
    private String lastname;
    private Integer year;
    private String language;

    private boolean isHardCover;

}
