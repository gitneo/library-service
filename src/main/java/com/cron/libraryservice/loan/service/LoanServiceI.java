package com.cron.libraryservice.loan.service;

import com.cron.libraryservice.loan.model.Loan;
import com.cron.libraryservice.loan.service.dto.LoanDto;

import java.util.List;

public interface LoanServiceI {
    LoanDto create(LoanDto loanDto);
    LoanDto get(long id);
    List<Loan> getAll();
    LoanDto update(Loan loan);
    void delete(Loan loan);
}
