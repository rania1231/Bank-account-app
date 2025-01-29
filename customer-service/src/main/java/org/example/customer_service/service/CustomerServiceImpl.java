package org.example.customer_service.service;

import jakarta.transaction.Transactional;
import org.example.customer_service.dto.CustomerDTO;
import org.example.customer_service.entities.Customer;
import org.example.customer_service.exceptions.CustomerNotFoundException;
import org.example.customer_service.exceptions.EmailAlreadyUsedException;
import org.example.customer_service.mapper.CustomerMapper;
import org.example.customer_service.respository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> listCustomers() {
        System.out.println("listAll we are using impl1");
        return customerRepository.findAll().stream().map(customerMapper::from).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findCustmerById(Long id)throws CustomerNotFoundException {
        if(customerRepository.findById(id)==null){
            throw new CustomerNotFoundException("This id is not found");
        }
        else
            return customerMapper.from(customerRepository.findById(id).get());

    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        System.out.println("save we are using impl1");

        Customer customer=customerMapper.from(customerDTO);
        Customer customerSaved=customerRepository.save(customer);
         return customerMapper.from(customerSaved);
    }
}
