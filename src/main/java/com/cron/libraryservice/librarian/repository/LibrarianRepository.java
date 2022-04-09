package com.cron.libraryservice.librarian.repository;

import com.cron.libraryservice.librarian.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian,Long> {
}
