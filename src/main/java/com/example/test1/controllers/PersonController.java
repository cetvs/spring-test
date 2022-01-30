package com.example.test1.controllers;


import com.example.test1.service.PersonService;
import com.example.test1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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


    @GetMapping
    public List<Person> getAll () {
        return personService.getAll();
    }


}