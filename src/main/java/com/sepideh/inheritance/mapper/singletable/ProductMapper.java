package com.sepideh.inheritance.mapper.singletable;

import com.sepideh.inheritance.dto.singletable.ProductDto;
import com.sepideh.inheritance.model.singletable.Product;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  ProductDto toDto(Product product);

  List<ProductDto> toDto(List<Product> products);

  Product create(ProductDto productDto);

  Product update(ProductDto productDto, @MappingTarget Product product);

}
