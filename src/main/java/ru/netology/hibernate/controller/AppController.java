package ru.netology.hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.AppRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class AppController {

    private AppRepository appRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return appRepository.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam int age) {
        return appRepository.getPersonsByAge(age);
    }

    @GetMapping("/person")
    public Person getPersonsByAge(@RequestParam String name, String surname) {
        return appRepository.getPersonsByNameAndSurname(name, surname);
    }


}
