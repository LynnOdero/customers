package com.lynn.customers.services;

import com.lynn.customers.entities.Customer;
import com.lynn.customers.repositories.CustomerRepository;
import com.lynn.customers.requests.CustomerInfo;
import com.lynn.customers.responses.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository repository;

    public CustomerResponse createCustomer(CustomerInfo info) {
     Customer customer = Customer.builder()
             .name(info.getName())
             .phoneNumber(info.getPhoneNumber())
             .gender(info.getGender())
             .build();

     repository.save(customer);

     return CustomerResponse
             .builder()
             .customerId(customer.getId())
             .message("Customer created successfully")
             .status(true)
             .build();

    }

}
