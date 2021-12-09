package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByCity(String city);

    List<Person> findAllByAgeLessThanOrderByAge(int age);

    Optional<Person> findPersonByNameAndSurname(String name, String Surname);
}
