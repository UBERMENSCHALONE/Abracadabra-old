package com.ufanet.abracadabra.model.operations;

public class Equals implements Operation {

    @Override
    public boolean test(String first, String second) {
        return first.equals(second);
    }
}