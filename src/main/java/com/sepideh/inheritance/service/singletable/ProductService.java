package com.sepideh.inheritance.service.singletable;

import com.sepideh.inheritance.dto.singletable.ProductDto;
import com.sepideh.inheritance.mapper.singletable.ProductMapper;
import com.sepideh.inheritance.model.singletable.Product;
import com.sepideh.inheritance.repository.singletable.ProductRepository;
import java.util.List;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  public ProductDto getProduct(Long id) throws NotFoundException {
    Product product = productRepository.findById(id)
        .orElseThrow(NotFoundException::new);

    return productMapper.toDto(product);
  }

  public List<ProductDto> getAllProducts() {
    return productMapper.toDto(productRepository.findAll());
  }

}
