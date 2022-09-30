package com.fly.io.deploy.FlyIODeploy.service;

import com.fly.io.deploy.FlyIODeploy.entity.Person;
import com.fly.io.deploy.FlyIODeploy.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> listPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person doCreatePerson(Person person) {
        return personRepository.save(person);
    }
}
