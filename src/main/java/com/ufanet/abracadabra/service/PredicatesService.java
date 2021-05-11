package com.ufanet.abracadabra.service;

import com.ufanet.abracadabra.entity.Predicates;
import com.ufanet.abracadabra.model.Response;

import java.util.List;
import java.util.Map;

public interface PredicatesService {

    String getById(int Id);
    List<Predicates> getAll();
    List<Integer> getInfo(Map<String, String> map);
    Response deleteById(int Id);
    Response updateByID(int Id, Map<String, String> map);
    int create(String map);
}
