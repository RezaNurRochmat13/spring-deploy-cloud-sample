package com.fly.io.deploy.FlyIODeploy.service;

import com.fly.io.deploy.FlyIODeploy.entity.Person;
import com.fly.io.deploy.FlyIODeploy.repository.PersonRepository;
import com.fly.io.deploy.FlyIODeploy.util.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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

    @Override
    public Person doDetailPerson(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found id " + id));
    }

    @Override
    public Person doUpdatePerson(Long id, Person payload) {
        Person personById = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found id " + id));

        personById.setName(payload.getName());
        personById.setAddress(payload.getAddress());
        personById.setStreet(payload.getStreet());

        personRepository.save(personById);

        return personById;
    }
}
