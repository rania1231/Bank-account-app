package org.example.account_service.service;

import jakarta.transaction.Transactional;
import org.example.account_service.dto.BankAccountDTO;
import org.example.account_service.entities.BankAccount;
import org.example.account_service.exceptions.AccountNotFoundException;
import org.example.account_service.mapper.BankAccountMapper;
import org.example.account_service.model.Customer;
import org.example.account_service.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.Currency;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BankAcountServiceImpl implements BankAccountService {
    private BankAccountRepository bankAccountRepository;
    private BankAccountMapper bankAccountMapper;

    public BankAcountServiceImpl(BankAccountRepository bankAccountRepository, BankAccountMapper bankAccountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.bankAccountMapper = bankAccountMapper;
    }

    @Override
    public List<BankAccountDTO> listAccounts() {
        return bankAccountRepository.findAll().stream().map(bankAccountMapper::from).collect(Collectors.toList());
    }

    @Override
    public BankAccountDTO findAccountById(String id) throws AccountNotFoundException {
        Optional<BankAccount> bankAccount=bankAccountRepository.findById(id);
        if(bankAccount==null){
            throw  new AccountNotFoundException("This id of the account does not exit ");
        }
        else
            return bankAccountMapper.from(bankAccount.get());
    }

    @Override
    public BankAccountDTO save(BankAccountDTO bankAccountDTO) {
        BankAccount bankAccount=bankAccountMapper.from(bankAccountDTO);
        bankAccountRepository.save(bankAccount);
        return bankAccountDTO;
    }
}
