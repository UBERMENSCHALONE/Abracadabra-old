package com.ufanet.abracadabra.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufanet.abracadabra.model.enums.OperationType;

public class Predicate {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("operationType")
    private OperationType operationType;
    @JsonProperty("actualKey")
    private String actualKey;
    @JsonProperty("argument")
    private String argument;

    public Predicate() {
    }

    public Predicate(int id, String name, OperationType operationType, String actualKey, String argument) {
        this.id = id;
        this.name = name;
        this.operationType = operationType;
        this.actualKey = actualKey;
        this.argument = argument;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getActualKey() {
        return actualKey;
    }

    public void setActualKey(String actualKey) {
        this.actualKey = actualKey;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
}