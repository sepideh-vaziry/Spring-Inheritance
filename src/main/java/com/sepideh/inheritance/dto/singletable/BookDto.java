package com.sepideh.inheritance.dto.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDto extends ProductDto {

  private String author;

}
