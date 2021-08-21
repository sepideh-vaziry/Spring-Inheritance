package com.sepideh.inheritance.mapper.singletable;

import com.sepideh.inheritance.dto.singletable.ProductDto;
import com.sepideh.inheritance.model.singletable.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

  ProductDto toDto(Product product);

  Product create(ProductDto productDto);

  Product update(ProductDto productDto, @MappingTarget Product product);

}
