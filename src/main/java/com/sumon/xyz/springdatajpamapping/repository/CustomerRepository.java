package com.sumon.xyz.springdatajpamapping.repository;


import com.sumon.xyz.springdatajpamapping.dto.OrderResponse;
import com.sumon.xyz.springdatajpamapping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.sumon.xyz.springdatajpamapping.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
