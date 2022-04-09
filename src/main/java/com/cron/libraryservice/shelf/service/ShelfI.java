package com.cron.libraryservice.shelf.service;

import com.cron.libraryservice.shelf.model.Shelf;
import com.cron.libraryservice.shelf.service.dto.ShelfDto;

import java.util.List;

public interface ShelfI {
    ShelfDto createShelf(ShelfDto shelfDto);
    ShelfDto getShelf(long id);
    List<ShelfDto> getShelves();
    ShelfDto updateShelf(ShelfDto shelfDto);
    void  deleteShelf(long id);
}

