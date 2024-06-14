package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product{
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private String productID;
    private String productName;
    private Integer price;
    private float rating;
    private Integer discount;
    private String availability;
}
