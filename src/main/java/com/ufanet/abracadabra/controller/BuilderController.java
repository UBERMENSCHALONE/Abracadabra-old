package com.ufanet.abracadabra.controller;

import com.ufanet.abracadabra.entity.Predicates;
import com.ufanet.abracadabra.model.Response;
import com.ufanet.abracadabra.service.impl.PredicatesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/builder")
public class BuilderController {

    @Autowired
    private PredicatesServiceImpl predicatesServiceImpl;

    @PostMapping(path = "/getInfo")
    public List<Integer> getData(@RequestBody Map<String, String> map) {
        try {
            return predicatesServiceImpl.getInfo(map);
        } catch (NullPointerException e) {
            throw new NullPointerException("Пустые занчения");
        }
    }

    @PostMapping(path = "/create")
    public int createData(@RequestBody String map) {
        return predicatesServiceImpl.create(map);
    }

    @PostMapping(path = "/update/{Id}")
    public Response updateData(@PathVariable int Id, @RequestBody Map<String, String> map) {
        return predicatesServiceImpl.updateByID(Id, map);
    }

    @PostMapping(path = "/delete/{Id}")
    public Response deleteData(@PathVariable int Id) {
        return predicatesServiceImpl.deleteById(Id);
    }

    @PostMapping(path = "/get/{Id}")
    public String getDataById(@PathVariable int Id) {
        return predicatesServiceImpl.getById(Id);
    }

    @PostMapping(path = "/getAll")
    public List<Predicates> getAllData() {
        return predicatesServiceImpl.getAll();
    }
}