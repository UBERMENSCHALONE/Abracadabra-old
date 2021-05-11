package com.ufanet.abracadabra.model.operations;

public class GreaterOrEqual implements Operation {

    @Override
    public boolean test(String first, String second) {
        return Integer.parseInt(first) <= Integer.parseInt(second);
    }
}