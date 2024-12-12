package com.yourname.konainfinaltestcomp303.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankId;

    @NotNull
    @Column(nullable = false)
    private String bankName;

    @NotNull
    @Column(nullable = false)
    private Integer bankYear;

    @NotNull
    @Column(nullable = false)
    private Integer bankEmp;

    @NotNull
    @Column(nullable = false)
    private String bankAddress;

    @NotNull
    @Column(nullable = false)
    private Integer bankBranches;

    @NotNull
    @Column(nullable = false)
    private Integer bankATMs;

    // Getters and setters for each field
    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getBankYear() {
        return bankYear;
    }

    public void setBankYear(Integer bankYear) {
        this.bankYear = bankYear;
    }

    public Integer getBankEmp() {
        return bankEmp;
    }

    public void setBankEmp(Integer bankEmp) {
        this.bankEmp = bankEmp;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public Integer getBankBranches() {
        return bankBranches;
    }

    public void setBankBranches(Integer bankBranches) {
        this.bankBranches = bankBranches;
    }

    public Integer getBankATMs() {
        return bankATMs;
    }

    public void setBankATMs(Integer bankATMs) {
        this.bankATMs = bankATMs;
    }
}
