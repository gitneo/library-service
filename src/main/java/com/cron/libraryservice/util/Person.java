package com.cron.libraryservice.util;

import com.cron.libraryservice.member.model.LibraryMember;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Data
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String telephoneNo;
    private LocalDate dob;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String picture;
}
