package com.lynn.customers.responses;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CustomerResponse {
    int customerId;
    String message;
    boolean status;
}
