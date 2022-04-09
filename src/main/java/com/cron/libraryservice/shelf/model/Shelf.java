package com.cron.libraryservice.shelf.model;

import com.cron.libraryservice.book.model.Book;
import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Table(name = "LIB_SHELVES")
@Entity
public class Shelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shelf_id", nullable = false)
    private long id;
    @Column(name = "shelf_label", nullable = false)
    private String label;
    @Column(name = "shelf_location", nullable = false)
    private String location;
    @Column(name = "shelf_description", nullable = false)
    private String description;
    @OneToMany(mappedBy = "shelf")
    private List<Book> books;

    public void addBook(Book book){
        this.books.add(book);
        book.setShelf(this);
    }
}
