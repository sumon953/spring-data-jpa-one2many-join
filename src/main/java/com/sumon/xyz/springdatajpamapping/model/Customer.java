package com.sumon.xyz.springdatajpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mail;
    private String gender;


    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "id")
    private List<Product> products;



}
