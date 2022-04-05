package com.cron.libraryservice.member.service.mapper;

import com.cron.libraryservice.member.model.LibraryMember;
import com.cron.libraryservice.member.service.dto.LibraryMemberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    LibraryMemberDto toDto(LibraryMember libraryMember);
    LibraryMember toEntity(LibraryMemberDto libraryMemberDto);
}
