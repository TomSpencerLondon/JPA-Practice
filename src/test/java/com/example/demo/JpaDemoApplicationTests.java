package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaDemoApplication.class)
public class JpaDemoApplicationTests {

  @Autowired
  PersonRepository personRepository;

  @Test
  public void should_get_h2_db_records() {

    Person personActual = personRepository.save(new Person("H2 In Memory Demo"));

    Optional<Person> expected = personRepository.findById(personActual.getId());
    System.out.println("name is :" + expected.get().getName());
    Assert.assertEquals(personActual.getName(),expected.get().getName());
  }

}