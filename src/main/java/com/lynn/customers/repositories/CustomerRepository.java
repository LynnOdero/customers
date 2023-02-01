package com.lynn.customers.repositories;

import com.lynn.customers.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer>{

}
