package com.fly.io.deploy.FlyIODeploy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public ResponseEntity<Object> index() {
        return new ResponseEntity<>("Service is up", HttpStatus.OK);
    }
}
