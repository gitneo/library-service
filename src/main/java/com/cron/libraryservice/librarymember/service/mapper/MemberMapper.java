package com.cron.libraryservice.librarymember.service.mapper;

import com.cron.libraryservice.librarymember.model.LibraryMember;
import com.cron.libraryservice.librarymember.service.dto.LibraryMemberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    LibraryMemberDto toDto(LibraryMember libraryMember);
    LibraryMember toEntity(LibraryMemberDto libraryMemberDto);
}
