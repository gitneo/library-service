package com.cron.libraryservice.librarymember.service;

import com.cron.libraryservice.librarymember.service.dto.LibraryMemberDto;

import java.util.List;

public interface LibraryMemberServiceI {

    LibraryMemberDto createLibraryMember(LibraryMemberDto libraryMemberDto);
    LibraryMemberDto getLibraryMember(long id);
    List<LibraryMemberDto> getLibraryMembers();
    LibraryMemberDto updateLibraryMember(LibraryMemberDto libraryMemberDto);

    void deleteLibraryMember(long id);
}
