package com.cron.libraryservice.shelf.service.mapper;

import com.cron.libraryservice.shelf.model.Shelf;
import com.cron.libraryservice.shelf.service.dto.ShelfDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShelfMapper {
    ShelfMapper INSTANCE = Mappers.getMapper(ShelfMapper.class);

    ShelfDto toDto(Shelf shelf);
    Shelf toEntity(ShelfDto shelfDto);
}
