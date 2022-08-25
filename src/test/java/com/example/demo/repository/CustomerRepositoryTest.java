package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @AfterEach
    public void tearDown(){
        //customerRepository.deleteAll();
    }

    @Test
    public void test_createCustomer(){
        Customer customer = new Customer();
        //customer.setCustomerId(17);
        customer.setCustomerName("Antonio");
        customer.setCustomerStatus("Gold");
        customer.setFlightNumber("DL143");
        customer.setCustomerMilage(25000);

        customerRepository.save(customer);

        Optional<Customer> customerFromDb = customerRepository.findById(String.valueOf(customer.getCustomerId()));

        assertTrue(customerFromDb.isPresent());
        assertEquals(customer.getCustomerId(), customerFromDb.get().getCustomerId());
        assertEquals(customer.getCustomerName(), customerFromDb.get().getCustomerName());
        assertEquals(customer.getCustomerStatus(), customerFromDb.get().getCustomerStatus());
        assertEquals(customer.getFlightNumber(),customerFromDb.get().getFlightNumber());
        assertEquals(customer.getCustomerMilage(), customerFromDb.get().getCustomerMilage());


    }

    @Test
    public void test_searchCustomerByName(){
        Customer customer = new Customer();
        customer.setCustomerName("Antonio");
        customer.setCustomerStatus("Gold");
        customer.setFlightNumber("DL143");
        customer.setCustomerMilage(25000);

        customerRepository.save(customer);

        Optional<Customer> customerFromDb = Optional.ofNullable(customerRepository.findByCustomerName("Antonio"));
        assertTrue(customerFromDb.isPresent());
        assertEquals(customer.getCustomerId(), customerFromDb.get().getCustomerId());
        assertEquals(customer.getCustomerName(), customerFromDb.get().getCustomerName());
        assertEquals(customer.getCustomerStatus(), customerFromDb.get().getCustomerStatus());
        assertEquals(customer.getFlightNumber(),customerFromDb.get().getFlightNumber());
        assertEquals(customer.getCustomerMilage(), customerFromDb.get().getCustomerMilage());
    }

    @Test
    public void test_findAllByCustomerStatus(){
         List<Customer> a = customerRepository.findAllByCustomerStatus("Gold");
         Integer size = a.size();

         assertEquals(4,size);




    }




}