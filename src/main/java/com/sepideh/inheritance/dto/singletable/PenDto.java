package com.sepideh.inheritance.dto.singletable;

import com.sepideh.inheritance.model.singletable.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PenDto extends Product {

  private String color;

}
