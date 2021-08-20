package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Person {

  @Id
  private long personId;
  private String name;

}
