package com.cron.libraryservice.librarymember.service;

import com.cron.libraryservice.librarymember.model.LibraryMember;
import com.cron.libraryservice.librarymember.repository.LibraryMemberRepository;
import com.cron.libraryservice.librarymember.service.dto.LibraryMemberDto;
import com.cron.libraryservice.librarymember.service.mapper.MemberMapper;
import com.cron.libraryservice.util.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LibraryMemberServiceTest {


    LibraryMemberDto libraryMemberDto;


    //system under test
    LibraryMemberService libraryMemberService;

    //mock
    LibraryMemberRepository libraryMemberRepository;

    @BeforeEach
    void setUp() {

        libraryMemberDto =  new LibraryMemberDto();
        libraryMemberDto.setId(1);
        libraryMemberDto.setFirstName("ogo");
        libraryMemberDto.setLastName("okafor");
        libraryMemberDto.setMiddleName("jideofor");
        libraryMemberDto.setAddress("Poland");
        libraryMemberDto.setDob(LocalDate.now());
        libraryMemberDto.setEmail("ogookafor@gmail.com");
        libraryMemberDto.setGender(Gender.MALE);
        libraryMemberDto.setTelephoneNo("08030754375");
        libraryMemberDto.setPicture("picture");


        libraryMemberRepository = Mockito.mock(LibraryMemberRepository.class);
        libraryMemberService = new LibraryMemberService(libraryMemberRepository);
    }




    @Test
    @DisplayName("Can users create new library members")
    public void canCreateLibraryMember(){
        //given
        LibraryMember actualLibraryMember = MemberMapper.INSTANCE.toEntity(libraryMemberDto);
        //when
        Mockito.when(libraryMemberRepository.save(actualLibraryMember)).thenReturn(actualLibraryMember);
        LibraryMemberDto expectedLibraryMemberDto = libraryMemberService.createLibraryMember(libraryMemberDto);
        //then
        assertTrue(expectedLibraryMemberDto.getId() == actualLibraryMember.getId());
    }




    @Test
    @DisplayName("Can users find library members by id")
    public void canFindLibraryMemberById(){
        //Given
        LibraryMember libraryMember =  new LibraryMember();
        libraryMember.setId(1);
        libraryMember.setFirstName("ogo");
        libraryMember.setLastName("okafor");
        libraryMember.setMiddleName("jideofor");
        libraryMember.setAddress("Poland");
        libraryMember.setDob(LocalDate.now());
        libraryMember.setEmail("ogookafor@gmail.com");
        libraryMember.setGender(Gender.MALE);
        libraryMember.setTelephoneNo("08030754375");
        libraryMember.setPicture("picture");

        //When
        Mockito.when(libraryMemberRepository.findById(libraryMember.getId())).thenReturn(Optional.of(libraryMember));
        LibraryMemberDto expectedLibraryMember = libraryMemberService.getLibraryMember(libraryMember.getId());

        //Then
        assertTrue(expectedLibraryMember.getId() == libraryMember.getId());
    }



    @Test
    @DisplayName("Can users find all library members")
    public void canFindAllLibraryMembers(){
        //given nothing
        List<LibraryMember> libraryMemberList =  List.of(new LibraryMember(),new LibraryMember(),new LibraryMember());

        //when
        Mockito.when(libraryMemberRepository.findAll()).thenReturn(libraryMemberList);
        List<LibraryMemberDto> expectedLibraryMemberList = libraryMemberService.getLibraryMembers();

        //then
        assertTrue(expectedLibraryMemberList.size() == libraryMemberList.size());
    }



    @Test
    @DisplayName("Can users update library members")
    public void canUpdateLibraryMember(){
        //GIVEN updated libraryMember
        LibraryMember libraryMember = MemberMapper.INSTANCE.toEntity(libraryMemberDto);
        libraryMember.setEmail("ogookafor@hotmail.com");

        //WHEN
        Mockito.when(libraryMemberRepository.save(libraryMember)).thenReturn(libraryMember);
        LibraryMemberDto updatedLibraryMemberDto = libraryMemberService.updateLibraryMember(libraryMemberDto);

        //THEN
        assertNotNull(updatedLibraryMemberDto);
        assertTrue(libraryMember.getEmail().equalsIgnoreCase(updatedLibraryMemberDto.getEmail()));

    }

    @Test
    @DisplayName("Can users delete library member")
    public void canDeleteLibraryMember(){
        //GIVEN
        long id = 1;

        //When
        libraryMemberService.deleteLibraryMember(id);

        //Then
        Mockito.verify(libraryMemberRepository).deleteById(id);
    }
}
