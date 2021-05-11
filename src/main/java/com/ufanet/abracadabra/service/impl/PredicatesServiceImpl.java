package com.ufanet.abracadabra.service.impl;

import com.ufanet.abracadabra.entity.Predicates;
import com.ufanet.abracadabra.model.PredicateGroup;
import com.ufanet.abracadabra.model.Response;
import com.ufanet.abracadabra.repository.PredicateRepository;
import com.ufanet.abracadabra.service.PredicateGroupResolver;
import com.ufanet.abracadabra.service.PredicatesService;
import com.ufanet.abracadabra.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class PredicatesServiceImpl implements PredicatesService {

    @Autowired
    private PredicateRepository predicateRepository;

    @Override
    public String getById(int Id) {
        return predicateRepository.getById(Id).getPredicates();
    }

    @Override
    public List<Predicates> getAll() {
        return predicateRepository.findAll();
    }

    @Override
    public List<Integer> getInfo(Map<String, String> map) {

        List<Integer> list = new LinkedList<>();
        List<Predicates> all = predicateRepository.findAll();
        List<PredicateGroup> predicateGroupList = new LinkedList<>();

        for (Predicates predicate : all) {
            PredicateGroup predicateGroup = Utils.jsonToObject(predicate.getPredicates());
            PredicateGroupResolver predicateGroupResolver = new PredicateGroupResolver();
            if (predicateGroupResolver.resolve(predicateGroup, map)) {
                list.add(predicate.getId());
            }
            predicateGroupList.add(predicateGroup);
        }
        return list;
    }

    @Override
    public Response deleteById(int Id) {
        try {
            predicateRepository.deleteById(Id);
        } catch (EmptyResultDataAccessException e){
            throw new EmptyResultDataAccessException("Id не найдены", Id, e);
        }
        return new Response("Ok");
    }

    @Override
    public Response updateByID(int Id, Map<String, String> map) {
        Predicates predicates = predicateRepository.getById(Id);
        predicates.setPredicates(map.toString());
        predicateRepository.save(predicates);
        return new Response("Ok");
    }

    @Override
    public int create(String map) {
        Predicates predicates = new Predicates(map);
        predicateRepository.save(predicates);
        return predicates.getId();
    }
}
























