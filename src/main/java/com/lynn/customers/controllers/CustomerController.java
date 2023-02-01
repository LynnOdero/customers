package com.lynn.customers.controllers;

import com.lynn.customers.requests.CustomerInfo;
import com.lynn.customers.responses.CustomerResponse;
import com.lynn.customers.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping("customer/create")
    public CustomerResponse create(@RequestBody CustomerInfo info) {
        return service.createCustomer(info);
    }

}
