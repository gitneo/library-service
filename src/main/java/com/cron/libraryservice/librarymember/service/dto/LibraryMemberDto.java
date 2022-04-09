package com.cron.libraryservice.librarymember.service.dto;

import com.cron.libraryservice.util.Gender;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class LibraryMemberDto {
    private long id;

    @NotNull
    private String firstName;

    @NotNull
    private String middleName;

    @NotNull
    private String lastName;

    @NotNull
    private String address;

    @NotNull
    private String email;

    @NotNull
    private String telephoneNo;

    @NotNull
    private LocalDate dob;

    @NotNull
    private Gender gender;

    @NotNull
    private String picture;
}
