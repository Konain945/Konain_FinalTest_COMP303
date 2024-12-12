package com.yourname.konainfinaltestcomp303.repository;

import com.yourname.konainfinaltestcomp303.entity.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<Bank, Long> {
    // Custom queries can be added here
    Bank findByBankName(String bankName);
    Bank findByBankId(Long bankId);
}
