package be.abis.sandwich.repository;


import be.abis.sandwich.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findPersonByFirstNameOrLastName(String firstName, String lastName);

    Person findPersonById(Long id);

}
