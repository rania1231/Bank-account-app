package org.example.account_service.service;

import org.example.account_service.dto.BankAccountDTO;
import org.example.account_service.exceptions.AccountNotFoundException;

import java.util.List;

public interface BankAccountService {
     List<BankAccountDTO>listAccounts();
     BankAccountDTO findAccountById(String id)throws AccountNotFoundException;
     BankAccountDTO save(BankAccountDTO bankAccountDTO);
}
