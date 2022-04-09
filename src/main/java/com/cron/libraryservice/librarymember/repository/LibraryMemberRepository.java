package com.cron.libraryservice.librarymember.repository;

import com.cron.libraryservice.librarymember.model.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryMemberRepository extends JpaRepository<LibraryMember,Long> {
}
