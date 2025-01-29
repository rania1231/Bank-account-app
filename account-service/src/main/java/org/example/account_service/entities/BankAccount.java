package org.example.account_service.entities;

import jakarta.persistence.*;
import org.example.account_service.enums.AccountType;
import org.example.account_service.model.Customer;

import java.time.LocalDate;

@Entity
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient //pour ignorer l'attribut customer lors de lagenerationde la base de donnes
    private Customer customer;
    //relation entre 2 entities de 2 microservices
    //mais pas de contrainte d'integrité predefinies , il faut les faire à la main
    private Long customerId;

    public BankAccount(){
    }

    public BankAccount(String accountId, double balance, LocalDate createdAt, String currency, AccountType type,  Long customerId) {
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
