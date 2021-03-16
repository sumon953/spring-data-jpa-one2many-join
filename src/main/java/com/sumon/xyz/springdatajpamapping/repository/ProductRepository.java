package com.sumon.xyz.springdatajpamapping.repository;

import com.sumon.xyz.springdatajpamapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {


}
