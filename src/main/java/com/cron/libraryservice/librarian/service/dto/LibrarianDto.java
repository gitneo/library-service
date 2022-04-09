package com.cron.libraryservice.librarian.service.dto;

import com.cron.libraryservice.util.Gender;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
public class LibrarianDto {
    protected long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String telephoneNo;
    private LocalDate dob;
    private Gender gender;
    private String picture;
    private String code;
    private Boolean isActive;
    private LocalDate hireDate ;
    private LocalDate expiryDate;
}
