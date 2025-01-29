package org.example.customer_service.service;

import jakarta.transaction.Transactional;
import org.example.customer_service.dto.CustomerDTO;
import org.example.customer_service.exceptions.CustomerNotFoundException;
import org.example.customer_service.mapper.CustomerMapper;
import org.example.customer_service.respository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service //we put it with comments cause we want to use the first implementaion
@Transactional
public class CustomerServiceImpl2 implements CustomerService{
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl2(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> listCustomers() {
        System.out.println("listAll we are using impl2");
        return List.of();
    }

    @Override
    public CustomerDTO findCustmerById(Long id) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        System.out.println("save we are using impl2");
        return null;
    }
}
