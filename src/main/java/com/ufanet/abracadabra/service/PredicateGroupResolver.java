package com.ufanet.abracadabra.service;

import com.ufanet.abracadabra.model.OperationFactory;
import com.ufanet.abracadabra.model.PredicateGroup;
import com.ufanet.abracadabra.model.enums.LogicalType;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PredicateGroupResolver {
    public static boolean resolve(PredicateGroup predicateGroup, Map<String, String> map) {

        if (predicateGroup.getLogicalType() == LogicalType.ALL) {
            return (getPredicateGroupAll(predicateGroup, map)) && (getPredicateAll(predicateGroup, map));
        } else {
            return (getPredicateGroupAny(predicateGroup, map)) && (getPredicateAny(predicateGroup, map));
        }
    }

    private static boolean getPredicateGroupAll(PredicateGroup predicateGroup, Map<String, String> map) {
        return predicateGroup.getPredicateGroups().stream().allMatch(s ->
                PredicateGroupResolver.resolve(s, map));
    }

    private static boolean getPredicateAll(PredicateGroup predicateGroup, Map<String, String> map) {
        return predicateGroup.getPredicates().stream().allMatch(s ->
                OperationFactory.getInstance(s.getOperationType()).test(map.get(s.getActualKey()), s.getArgument()));
    }

    private static boolean getPredicateGroupAny(PredicateGroup predicateGroup, Map<String, String> map) {
        return predicateGroup.getPredicateGroups().stream().anyMatch(s ->
                PredicateGroupResolver.resolve(s, map));
    }

    private static boolean getPredicateAny(PredicateGroup predicateGroup, Map<String, String> map) {
        return predicateGroup.getPredicates().stream().anyMatch(s ->
                OperationFactory.getInstance(s.getOperationType()).test(map.get(s.getActualKey()), s.getArgument()));
    }
}