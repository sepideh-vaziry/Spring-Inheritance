package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Employee extends Person {

  private String company;

}
