package com.cron.libraryservice.shelf.service.dto;

import com.cron.libraryservice.book.model.Book;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class ShelfDto {
        @NotNull
        private long id;

        @NotNull
        private String label;

        @NotNull
        private String location;

        @NotNull
        private String description;

        @NotNull
        private List<Book> books;
}
