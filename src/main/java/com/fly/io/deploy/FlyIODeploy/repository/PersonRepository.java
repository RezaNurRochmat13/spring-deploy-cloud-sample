package com.fly.io.deploy.FlyIODeploy.repository;

import com.fly.io.deploy.FlyIODeploy.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
