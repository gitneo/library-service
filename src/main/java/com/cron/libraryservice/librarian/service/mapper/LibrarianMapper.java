package com.cron.libraryservice.librarian.service.mapper;

import com.cron.libraryservice.librarian.model.Librarian;
import com.cron.libraryservice.librarian.service.dto.LibrarianDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LibrarianMapper{

    LibrarianMapper INSTANCE = Mappers.getMapper(LibrarianMapper.class);

    LibrarianDto toDto(Librarian librarian);
    Librarian toEntity(LibrarianDto librarianDto);
}
