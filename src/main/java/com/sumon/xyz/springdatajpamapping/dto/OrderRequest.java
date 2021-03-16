package com.sumon.xyz.springdatajpamapping.dto;


import com.sumon.xyz.springdatajpamapping.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;
}
