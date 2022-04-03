package com.cron.libraryservice.member.model;

import com.cron.libraryservice.util.Person;
import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "LIB_MEMBER")

@AttributeOverride(name = "id", column = @Column(name = "MEM_CODE", nullable = false))
@AttributeOverride(name = "firstName", column = @Column(name = "MEM_FIRST_NAME", nullable = false))
@AttributeOverride(name = "middleName", column = @Column(name = "MEM_MIDDLE_NAME", nullable = false))
@AttributeOverride(name = "lastName", column = @Column(name = "MEM_LAST_NAME", nullable = false))
@AttributeOverride(name = "address", column = @Column(name = "MEM_ADDRESS", nullable = false))
@AttributeOverride(name = "email", column = @Column(name = "MEM_EMAIL", nullable = false))
@AttributeOverride(name = "telephoneNo", column = @Column(name = "MEM_PHONE", nullable = false))
@AttributeOverride(name = "dob", column = @Column(name = "MEM_DOB", columnDefinition = "DATE", nullable = false))

public class LibraryMember extends Person {

    @Column(name = "MEM_ID")
    private String libraryId;

    @Column(name = "MEM_ACTIVE_STATUS")
    private Boolean isActive;

    @Column(name = "MEM_CREATED_DATE")
    private LocalDate membershipDate;

    @Column(name = "MEM_EXPIRY_DATE")
    private LocalDate membershipExpiry;
}
