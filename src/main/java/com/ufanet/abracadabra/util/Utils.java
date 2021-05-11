package com.ufanet.abracadabra.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ufanet.abracadabra.model.PredicateGroup;

import java.util.Map;

public class Utils {

    public static PredicateGroup jsonToObject(String data) {
        ObjectMapper mapper = new ObjectMapper();
        PredicateGroup predicateGroup = null;
        try {
            predicateGroup = mapper.readValue(data, PredicateGroup.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return predicateGroup;
    }

    public static String mapToJson(Map<String, String> map) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(mapper);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
