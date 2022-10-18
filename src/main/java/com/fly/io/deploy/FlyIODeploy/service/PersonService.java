package com.fly.io.deploy.FlyIODeploy.service;

import com.fly.io.deploy.FlyIODeploy.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> listPersons();
    Person doCreatePerson(Person person);
    Person doDetailPerson(Long id);
    Person doUpdatePerson(Long id, Person payload);
}
