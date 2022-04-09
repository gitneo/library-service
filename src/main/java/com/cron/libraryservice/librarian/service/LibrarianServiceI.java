package com.cron.libraryservice.librarian.service;

import com.cron.libraryservice.librarian.model.Librarian;
import com.cron.libraryservice.librarian.service.dto.LibrarianDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface LibrarianServiceI {

    LibrarianDto create(LibrarianDto librarianDto);
    LibrarianDto get(long id);
    List<LibrarianDto> getAll();
    LibrarianDto update(LibrarianDto librarianDto);
    void delete(long id);
}
