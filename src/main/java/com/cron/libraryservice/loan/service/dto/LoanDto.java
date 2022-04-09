package com.cron.libraryservice.loan.service.dto;

import com.cron.libraryservice.librarian.model.Librarian;
import com.cron.libraryservice.librarymember.model.LibraryMember;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class LoanDto {

    private long id;

    @NotNull
    private String code;

    @NotNull
    private LibraryMember member;

    @NotNull
    private Librarian handler;

    @NotNull
    private LocalDate term;

    @NotNull
    private LocalDate maturity;

}
