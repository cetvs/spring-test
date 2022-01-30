package com.example.test1;
import com.example.test1.model.Person;
import com.example.test1.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args -> {
            Person alex = new Person(
                    "Alex",
                    34
            );

            Person sony = new Person(
                    "Sony",
                    21
            );

            personRepository.saveAll(
                    List.of(alex, sony)
            );
        };


    }
}
