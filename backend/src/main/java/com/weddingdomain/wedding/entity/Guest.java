package com.weddingdomain.wedding.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Guest extends PanacheEntity {
    public String name;
    public String plusOneName;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OtherPerson> otherPeople;
}
