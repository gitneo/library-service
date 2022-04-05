package com.cron.libraryservice.member.service;

import com.cron.libraryservice.member.model.LibraryMember;
import com.cron.libraryservice.member.service.dto.LibraryMemberDto;

import java.util.List;

public interface LibraryMemberServiceI {

    LibraryMemberDto createLibraryMember(LibraryMemberDto libraryMemberDto);
    LibraryMemberDto getLibraryMember(long id);
    List<LibraryMemberDto> getLibraryMembers();
    LibraryMemberDto updateLibraryMember(LibraryMemberDto libraryMemberDto);

    void deleteLibraryMember(long id);
}
