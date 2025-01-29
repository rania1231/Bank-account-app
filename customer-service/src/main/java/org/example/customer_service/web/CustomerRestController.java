package org.example.customer_service.web;

import org.example.customer_service.dto.CustomerDTO;

import org.example.customer_service.exceptions.CustomerNotFoundException;

import org.example.customer_service.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    //Injection des dependences
    private CustomerService customerService;
    //Injection des dependences
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<CustomerDTO>customerList(){
        return customerService.listCustomers();
    }
    @GetMapping("/customers/{id}")
    public CustomerDTO customerById(@PathVariable Long id)throws CustomerNotFoundException {
        return  customerService.findCustmerById(id);
    }
}
