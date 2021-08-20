package com.sepideh.inheritance.model.joinedtable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The disadvantage of this inheritance mapping (Joined Table) method is that retrieving entities
 * requires joins between tables
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {

  @Id
  private long animalId;
  private String species;

}
