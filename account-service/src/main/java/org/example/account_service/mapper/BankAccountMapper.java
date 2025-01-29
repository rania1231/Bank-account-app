package org.example.account_service.mapper;

import org.example.account_service.dto.BankAccountDTO;
import org.example.account_service.entities.BankAccount;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public BankAccountDTO from(BankAccount bankAccount){
        return modelMapper.map(bankAccount,BankAccountDTO.class);
    }

    public BankAccount from(BankAccountDTO bankAccountDTO){
        return modelMapper.map(bankAccountDTO,BankAccount.class);
    }

}
