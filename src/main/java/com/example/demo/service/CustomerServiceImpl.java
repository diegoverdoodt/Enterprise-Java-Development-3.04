package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }

    //@Override
   /* public Customer getCustomerByName(String name) {
        return customerRepository.findByCustomerName(name);
    }*/

}
