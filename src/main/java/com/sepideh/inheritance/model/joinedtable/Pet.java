package com.sepideh.inheritance.model.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
//@PrimaryKeyJoinColumn(name = "petId")
public class Pet extends Animal {

  private String name;

}
