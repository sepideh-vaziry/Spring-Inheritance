package com.sepideh.inheritance.model.tableperclass;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Bmw extends Vehicle {

  private String series;

}
