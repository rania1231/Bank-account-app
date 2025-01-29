package org.example.customer_service.mapper;

import org.example.customer_service.dto.CustomerDTO;
import org.example.customer_service.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public CustomerDTO from(Customer customer){
        return modelMapper.map(customer,CustomerDTO.class);
    }
    public Customer from(CustomerDTO customerDTO){
        return  modelMapper.map(customerDTO,Customer.class);
    }
}
