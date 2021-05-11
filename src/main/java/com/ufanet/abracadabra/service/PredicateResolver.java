package com.ufanet.abracadabra.service;

import com.ufanet.abracadabra.model.OperationFactory;
import com.ufanet.abracadabra.model.Predicate;
import org.springframework.stereotype.Component;

@Component
public class PredicateResolver {
    public boolean resolve(Predicate predicate) {
        return OperationFactory.getInstance(predicate.getOperationType()).test(predicate.getActualKey(), predicate.getArgument());
    }
}
