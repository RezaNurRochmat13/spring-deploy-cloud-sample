package com.fly.io.deploy.FlyIODeploy.controller;

import com.fly.io.deploy.FlyIODeploy.entity.Person;
import com.fly.io.deploy.FlyIODeploy.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    @GetMapping("/persons")
    public ResponseEntity<Object> getAllPersons() {
        return new ResponseEntity<>(personService.listPersons(), HttpStatus.OK);
    }

    @PostMapping("/persons")
    public ResponseEntity<Object> createNewPersons(@RequestBody Person payload) {
        return new ResponseEntity<>(personService.doCreatePerson(payload), HttpStatus.OK);
    }
}