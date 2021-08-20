package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class Person {

  @Id
  private long personId;
  private String name;

}
