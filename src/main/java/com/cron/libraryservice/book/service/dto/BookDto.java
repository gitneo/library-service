package com.cron.libraryservice.book.service.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BookDto {

    private long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private String genre;

    @NotNull
    private String author;

    @NotNull
    private String publisher;

    @NotNull
    private String yearOfPublish;

    @NotNull
    private String ISBN;
}
