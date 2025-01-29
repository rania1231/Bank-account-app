package org.example.account_service.web;

import org.example.account_service.dto.BankAccountDTO;
import org.example.account_service.exceptions.AccountNotFoundException;
import org.example.account_service.service.BankAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountRestController {
    private BankAccountService bankAccountService;

    public BankAccountRestController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @GetMapping("/accounts")
    public List<BankAccountDTO> bankAccountList(){
        return bankAccountService.listAccounts();
    }
    @GetMapping("/accounts/{id}")
    public BankAccountDTO bankAccountById(@PathVariable String id) throws AccountNotFoundException {
        return bankAccountService.findAccountById(id);
    }
}
