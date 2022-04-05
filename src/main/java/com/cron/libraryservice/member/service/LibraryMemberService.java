package com.cron.libraryservice.member.service;

import com.cron.libraryservice.member.model.LibraryMember;
import com.cron.libraryservice.member.repository.LibraryMemberRepository;
import com.cron.libraryservice.member.service.dto.LibraryMemberDto;
import com.cron.libraryservice.member.service.mapper.MemberMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class LibraryMemberService implements LibraryMemberServiceI {

    LibraryMemberRepository libraryMemberRepository;

    @Override
    public LibraryMemberDto createLibraryMember(LibraryMemberDto libraryMemberDto) {
        LibraryMember libraryMember = MemberMapper.INSTANCE.toEntity(libraryMemberDto);
        LibraryMember createdLibraryMember = this.libraryMemberRepository.save(libraryMember);
        return MemberMapper.INSTANCE.toDto(createdLibraryMember);
    }

    @Override
    public LibraryMemberDto getLibraryMember(long id) {

        return libraryMemberRepository.findById(id)
                .map(MemberMapper.INSTANCE::toDto)
                .orElseThrow();
    }

    @Override
    public List<LibraryMemberDto> getLibraryMembers() {

        return libraryMemberRepository.findAll()
                .stream()
                .map(MemberMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void updateLibraryMember(LibraryMember libraryMember) {

    }

    @Override
    public void deleteLibraryMember(long id) {

    }
}
