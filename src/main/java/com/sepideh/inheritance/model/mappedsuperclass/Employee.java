package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

  private String company;

}
