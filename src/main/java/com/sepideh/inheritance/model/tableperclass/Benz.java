package com.sepideh.inheritance.model.tableperclass;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Benz extends Vehicle {

  private String benzClass;

}
