package com.ufanet.abracadabra.model.operations;

public class DoesNotContain implements Operation {

    @Override
    public boolean test(String first, String second) {
        return !first.contains(second);
    }
}