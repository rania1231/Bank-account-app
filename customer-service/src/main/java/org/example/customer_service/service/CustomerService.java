package org.example.customer_service.service;

import org.example.customer_service.dto.CustomerDTO;
import org.example.customer_service.exceptions.CustomerNotFoundException;
import org.example.customer_service.exceptions.EmailAlreadyUsedException;

import java.util.List;

public interface CustomerService {
    public List<CustomerDTO> listCustomers();
    public CustomerDTO findCustmerById(Long id)throws CustomerNotFoundException;
    public CustomerDTO save(CustomerDTO customerDTO);
}
