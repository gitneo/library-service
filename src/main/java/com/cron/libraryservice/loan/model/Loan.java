package com.cron.libraryservice.loan.model;

import com.cron.libraryservice.loanitem.model.LoanItem;
import com.cron.libraryservice.librarian.model.Librarian;
import com.cron.libraryservice.librarymember.model.LibraryMember;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Table(name = "LIB_LOANS")
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id", nullable = false)
    private long id;

    @Column(name = "loan_code", nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "loan_mem_id", nullable = false)
    private LibraryMember member;

    @ManyToOne
    @JoinColumn(name = "loan_lib_id", nullable = false)
    private Librarian handler;

    @Column(name = "loan_maturity", nullable = false)
    private LocalDate maturity;

    @Column(name = "loan_term", nullable = false)
    private LocalDate terms;

    @OneToMany(mappedBy = "loan")
    private List<LoanItem> items;

}
