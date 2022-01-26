package com.example.test1.Service;

import com.example.test1.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {
    public List<Person> getAll () {
        return List.of(
                new Person(1L, "Face"),
                new Person(2L, "Kim")
        );
    }
}
