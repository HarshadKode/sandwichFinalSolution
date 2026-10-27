package be.abis.sandwich.service;


import be.abis.sandwich.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    List<Person> getAllPersons();
    Person findPerson(Long id);
    Person findPerson(String firstname, String lastname);
}
