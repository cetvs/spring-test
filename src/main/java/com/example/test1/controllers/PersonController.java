package com.example.test1.controllers;


import com.example.test1.Service.PersonService;
import com.example.test1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PersonController {
    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    @GetMapping("/greeting")
//    public String getAll (Model model) {
//        System.out.println("jopa");
//        return "greeting";
//    }


//    @GetMapping("/{id}")
//    @GetMapping("/{id}")
//    public String getById(@PathVariable Long id) {
//        return "greeting.html";
//    }

//    @GetMapping("/greeting")
    @GetMapping
    public List<Person> getAll () {
        return personService.getAll();
    }


}