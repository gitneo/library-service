package com.cron.libraryservice.book.service;

import com.cron.libraryservice.book.model.Book;
import com.cron.libraryservice.book.service.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto toDto(Book book);
    Book toEntity(BookDto bookDto);
}
