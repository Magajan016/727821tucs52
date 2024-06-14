package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity
@NoArgsConstructor
@AllArgsConstructor
// @Table(name="user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String clientID;
    private String clientSecret;
    private Integer rollNo;
    private String companyName;
    private String ownerName;
    private String ownerEmail;
    private String accessCode;
}
