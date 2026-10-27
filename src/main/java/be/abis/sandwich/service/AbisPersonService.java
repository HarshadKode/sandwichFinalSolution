package be.abis.sandwich.service;

import be.abis.sandwich.model.Person;
import be.abis.sandwich.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisPersonService implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person findPerson(Long id) {
        return personRepository.findPersonById(id);
    }

    @Override
    public Person findPerson(String firstname, String lastname) {
        return personRepository.findPersonByFirstNameOrLastName(firstname,lastname);
    }
}
