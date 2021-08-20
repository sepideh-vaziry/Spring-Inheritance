package com.sepideh.inheritance.model.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name = "petId")
public class Pet extends Animal {

  private String name;

}
