package com.example.test1.service;

import com.example.test1.model.Person;
import com.example.test1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getAll () {
        return personRepository.findAll();
    }
}
