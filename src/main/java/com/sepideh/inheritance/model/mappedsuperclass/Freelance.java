package com.sepideh.inheritance.model.mappedsuperclass;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Freelance extends Person {

  private String email;

}
