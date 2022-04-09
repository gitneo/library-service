package com.cron.libraryservice.librarian.model;


import com.cron.libraryservice.util.Person;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Table(name = "LIB_LIBRARIANS")
@Entity
public class Librarian extends Person {

    @Column(name = "LIB_CODE", nullable = false)
    private String code;

    @Column(name = "LIB_ACTIVE_STATUS", nullable = false)
    private Boolean isActive;

    @Column(name = "LIB_HIRE_DATE", nullable = false)
    private LocalDate hireDate ;

    @Column(name = "LIB_EXPIRY_DATE", nullable = false)
    private LocalDate expiryDate;

}
