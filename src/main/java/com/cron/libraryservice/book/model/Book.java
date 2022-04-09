package com.cron.libraryservice.book.model;

import com.cron.libraryservice.shelf.model.Shelf;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "LIB_BOOKS")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private long id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_description", nullable = false)
    private String description;

    @Column(name = "book_genre", nullable = false)
    private String genre;

    @Column(name = "book_author", nullable = false)
    private String author;

    @Column(name = "book_publisher", nullable = false)
    private String publisher;

    @Column(name = "book_yearOfPublish", nullable = false)
    private String yearOfPublish;

    @Column(name = "book_isbn", nullable = false)
    private String ISBN;

    @ManyToOne
    @JoinColumn(name = "book_shelf_id", nullable = false)
    private Shelf shelf;
}
