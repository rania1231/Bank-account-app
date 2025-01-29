package org.example.customer_service;

import org.example.customer_service.dto.CustomerDTO;
import org.example.customer_service.service.CustomerService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerService customerService){
		return args -> {
			customerService.save(
					new CustomerDTO(null,"Rania","Hamdi","rania.hamdi@etudiant-enit.utm.tn")
			);
			customerService.save(
					new CustomerDTO(null,"Mohamed","Segni","mohamed.segni@etudiant-enit.utm.tn")
			);

		};
	}
}
