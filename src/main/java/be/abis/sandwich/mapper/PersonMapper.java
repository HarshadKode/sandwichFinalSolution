package be.abis.sandwich.mapper;

import be.abis.sandwich.model.Person;
import dto.PersonDTO;

public class PersonMapper {

    public static PersonDTO toDTO(Person person) {
        return new PersonDTO(person.getFirstName().trim(),
                person.getLastName().trim());
    }

    public static Person toPerson(PersonDTO personDTO) {
        return new Person(personDTO.getFirstName(), personDTO.getLastName());
    }

}
