package com.example.thing.controller;

import com.example.thing.entity.Thing;
import com.example.thing.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ThingController {

//    @Autowired
//    private FormClient formClient;

    @Autowired
    private ThingRepository thingRepository;


    @GetMapping()
    public List<Thing> getThings() {
        return thingRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        System.err.println("TEST");
        return "test";
    }
}
