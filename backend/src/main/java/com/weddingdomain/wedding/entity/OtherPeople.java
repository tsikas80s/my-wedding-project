package com.weddingdomain.wedding.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.*;

@Entity
public class OtherPeople extends PanacheEntity {

    public String name;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    public Guest guest;
}
