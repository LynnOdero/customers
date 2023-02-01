package com.lynn.customers.requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CustomerInfo {

    public int id;

    public String name;
    public String phoneNumber;
    public  String gender;
}
