package ru.netology.hibernate.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@AllArgsConstructor
public class AppRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.city_of_living = :city order by p.city_of_living", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
