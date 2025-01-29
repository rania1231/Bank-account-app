package org.example.account_service.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Transient;
import org.example.account_service.enums.AccountType;
import org.example.account_service.model.Customer;

import java.time.LocalDate;

public class BankAccountDTO {

    private String accountId;
    private double balance;
    private LocalDate createdAt;
    private String currency;

    private AccountType type;
    private Customer customer;
    private Long customerId;

    public BankAccountDTO(){
    }

    public BankAccountDTO(String accountId, double balance, LocalDate createdAt, String currency, AccountType type, Long customerId) {
        this.accountId = accountId;
        this.balance = balance;
        this.createdAt = createdAt;
        this.currency = currency;
        this.type = type;

        this.customerId = customerId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
