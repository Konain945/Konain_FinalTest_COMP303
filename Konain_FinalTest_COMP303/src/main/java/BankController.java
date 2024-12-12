package com.yourname.konainfinaltestcomp303.controller;

import com.yourname.konainfinaltestcomp303.entity.Bank;
import com.yourname.konainfinaltestcomp303.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    @Autowired
    private BankRepository bankRepository;

    @PostMapping
    public Bank addBank(@RequestBody @Valid Bank bank) {
        return bankRepository.save(bank);
    }

    @GetMapping("/{bankId}")
    public Bank getBankById(@PathVariable Long bankId) {
        return bankRepository.findById(bankId).orElse(null);
    }

    @GetMapping("/name/{bankName}")
    public Bank getBankByName(@PathVariable String bankName) {
        return bankRepository.findByBankName(bankName);
    }

    @GetMapping
    public List<Bank> getAllBanks() {
        return (List<Bank>) bankRepository.findAll();
    }

    @DeleteMapping("/{bankId}")
    public void deleteBank(@PathVariable Long bankId) {
        bankRepository.deleteById(bankId);
    }

    @PutMapping("/{bankId}")
    public Bank updateBank(@PathVariable Long bankId, @RequestBody @Valid Bank bank) {
        if (bankRepository.existsById(bankId)) {
            bank.setBankId(bankId);
            return bankRepository.save(bank);
        }
        return null;
    }
}
