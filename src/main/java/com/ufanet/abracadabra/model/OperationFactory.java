package com.ufanet.abracadabra.model;


import com.ufanet.abracadabra.model.enums.OperationType;
import com.ufanet.abracadabra.model.operations.*;

public class OperationFactory {
    public static Operation getInstance(OperationType operationType) {
        switch (operationType) {
            case CONTAINS:
                return new Contains();
            case DOES_NOT_CONTAIN:
                return new DoesNotContain();

            case EQUALS:
                return new Equals();
            case NOT_EQUALS:
                return new NotEquals();

            case GREATER:
                return new Greater();
            case GREATER_OR_EQUAL:
                return new GreaterOrEqual();

            case LESS:
                return new Less();
            case LESS_OR_EQUAL:
                return new LessOrEqual();

            case EQUAL:
                return new Equal();

            case NOT_EQUAL:
                return new NotEqual();

            default: throw new IllegalArgumentException(String.valueOf(operationType));
        }
    }
}