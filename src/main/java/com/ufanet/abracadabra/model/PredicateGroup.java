package com.ufanet.abracadabra.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufanet.abracadabra.model.enums.LogicalType;

import java.util.List;

public class PredicateGroup {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("logicalType")
    private LogicalType logicalType;
    @JsonProperty("predicates")
    private List<Predicate> predicates;
    @JsonProperty("predicateGroups")
    private List<PredicateGroup> predicateGroups;

    public PredicateGroup() {
    }

    public PredicateGroup(int id, String name, LogicalType logicalType, List<Predicate> predicates, List<PredicateGroup> predicateGroups) {
        this.id = id;
        this.name = name;
        this.logicalType = logicalType;
        this.predicates = predicates;
        this.predicateGroups = predicateGroups;
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

    public LogicalType getLogicalType() {
        return logicalType;
    }

    public void setLogicalType(LogicalType logicalType) {
        this.logicalType = logicalType;
    }

    public List<Predicate> getPredicates() {
        return predicates;
    }

    public void setPredicates(List<Predicate> predicates) {
        this.predicates = predicates;
    }

    public List<PredicateGroup> getPredicateGroups() {
        return predicateGroups;
    }

    public void setPredicateGroups(List<PredicateGroup> predicateGroups) {
        this.predicateGroups = predicateGroups;
    }
}