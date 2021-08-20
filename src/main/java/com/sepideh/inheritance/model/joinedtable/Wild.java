package com.sepideh.inheritance.model.joinedtable;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Wild extends Animal {

  private String name;

}
