package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Freelance extends Employee {

  private String email;

}
