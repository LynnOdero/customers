package com.lynn.customers.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@Table(name = "customers")
public class Customer {

    public Customer(){


    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;
    public String name;
    public String phoneNumber;
    public  String gender;
}
