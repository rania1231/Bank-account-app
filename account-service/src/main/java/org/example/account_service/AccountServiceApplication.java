package org.example.account_service;

import org.example.account_service.dto.BankAccountDTO;
import org.example.account_service.enums.AccountType;
import org.example.account_service.model.Customer;
import org.example.account_service.service.BankAccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class AccountServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(BankAccountService bankAccountService){
		return  args -> {
			bankAccountService.save(new BankAccountDTO(UUID.randomUUID().toString(),20.12, LocalDate.now(),"dollar", AccountType.SAVING_ACCOUNT,(long)1));

			bankAccountService.save(new BankAccountDTO(UUID.randomUUID().toString(),10.32, LocalDate.now(),"euro", AccountType.SAVING_ACCOUNT, (long)2));

			bankAccountService.save(new BankAccountDTO(UUID.randomUUID().toString(),6.87, LocalDate.now(),"dinar", AccountType.SAVING_ACCOUNT, (long)3));

			bankAccountService.save(new BankAccountDTO(UUID.randomUUID().toString(),500.12, LocalDate.now(),"dollar", AccountType.SAVING_ACCOUNT, (long)4));
		};
	}

}
