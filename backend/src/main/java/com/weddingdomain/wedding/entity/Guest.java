package com.weddingdomain.wedding.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Guest extends PanacheEntity {
    @Column(name = "name")
    public String name;

    @Column(name = "mail")
    public String mail;

    @Column(name = "phone_number")
    public Long phoneNumber;

    @Column(name = "selected_option")
    public String selectedOption;

    @Column(name = "plus_one_name")
    public String plusOneName;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OtherPeople> otherPeople;
}
