package com.cron.libraryservice.loan.service.mapper;

import com.cron.libraryservice.loan.model.Loan;
import com.cron.libraryservice.loan.service.dto.LoanDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LoanMapper {

    LoanMapper INSTANCE = Mappers.getMapper(LoanMapper.class);

    LoanDto toDto(Loan loan);
    Loan toEntity(LoanDto loanDto);
}
