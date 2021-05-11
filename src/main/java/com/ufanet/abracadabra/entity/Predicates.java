package com.ufanet.abracadabra.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Predicates {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Lob
    private String predicates;

    public Predicates(int id, String predicates) {
        this.id = id;
        this.predicates = predicates;
    }

    public Predicates(String predicates) {
        this.predicates = predicates;
    }

    public Predicates() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPredicates() {
        return predicates;
    }

    public void setPredicates(String predicates) {
        this.predicates = predicates;
    }
}
