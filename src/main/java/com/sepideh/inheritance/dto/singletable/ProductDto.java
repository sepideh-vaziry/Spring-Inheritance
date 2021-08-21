package com.sepideh.inheritance.dto.singletable;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {

  private Long productId;
  private String name;
  private BigDecimal price;

}
