package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name="customer")

public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    int customerId;

    @Column(name="customer_name")
    String customerName;

    @Column(name="customer_status")
    String customerStatus;

    @Column(name = "flight_number")
    String flightNumber;

    @Column(name= " total_customer_milage")
    int customerMilage;


    public int getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCustomerMilage() {
        return customerMilage;
    }

    public void setCustomerMilage(int customerMilage) {
        this.customerMilage = customerMilage;
    }
}
