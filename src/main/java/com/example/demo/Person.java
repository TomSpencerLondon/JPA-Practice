package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @GeneratedValue(strategy = GenerationType.AUTO)
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public Person() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
//constructors, gettet and setters
}
