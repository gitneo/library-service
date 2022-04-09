package com.cron.libraryservice.book;

import com.cron.libraryservice.book.model.Book;
import com.cron.libraryservice.book.service.dto.BookDto;

import java.util.List;

public interface BookI {
    BookDto createBook(BookDto bookDto);
    BookDto getBook(long id);
    List<BookDto> getBooks();
    Book updateBook(BookDto bookDto);
    void deleteBook(long id);
}
