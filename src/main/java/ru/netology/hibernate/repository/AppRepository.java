package ru.netology.hibernate.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class AppRepository {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findAllByCity(city);
    }
    public List<Person> getPersonsByAge(int age) {
        return personRepository.findAllByAgeLessThanOrderByAge(age);
    }

    public Person getPersonsByNameAndSurname(String name, String surname) {
        Optional<Person> nameAndSurname = personRepository.findPersonByNameAndSurname(name,surname);
        return nameAndSurname.get();
    }

}
