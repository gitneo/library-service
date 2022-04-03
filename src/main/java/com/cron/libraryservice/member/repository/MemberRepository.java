package com.cron.libraryservice.member.repository;

import com.cron.libraryservice.member.model.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<LibraryMember,Long> {
}
