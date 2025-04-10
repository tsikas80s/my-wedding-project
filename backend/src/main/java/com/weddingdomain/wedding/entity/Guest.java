package com.weddingdomain.wedding.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;


import java.util.List;

@Entity
public class Guest extends PanacheEntity {
    public String name;
    public String plusOneName;  // Single string
    public List<String> otherPeople;  // List of strings

}
