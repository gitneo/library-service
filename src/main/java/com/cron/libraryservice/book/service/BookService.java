package com.cron.libraryservice.book.service;

import com.cron.libraryservice.book.model.Book;
import com.cron.libraryservice.book.BookI;
import com.cron.libraryservice.book.service.dto.BookDto;

import java.util.List;

public class BookService implements BookI {
    @Override
    public BookDto createBook(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto getBook(long id) {
        return null;
    }

    @Override
    public List<BookDto> getBooks() {
        return null;
    }

    @Override
    public Book updateBook(BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBook(long id) {

    }
}

