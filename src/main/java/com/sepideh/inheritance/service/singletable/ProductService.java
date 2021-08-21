package com.sepideh.inheritance.service.singletable;

import com.sepideh.inheritance.dto.singletable.ProductDto;
import com.sepideh.inheritance.mapper.singletable.ProductMapper;
import com.sepideh.inheritance.model.singletable.Product;
import com.sepideh.inheritance.repository.singletable.ProductRepository;
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

  public ProductDto create(ProductDto productDto) {
    productDto.setProductId(null);
    Product product = productRepository.save(
        productMapper.create(productDto)
    );

    return productMapper.toDto(product);
  }

  public ProductDto update(ProductDto productDto) throws NotFoundException {
    Product product = productRepository.findById(productDto.getProductId())
        .orElseThrow(NotFoundException::new);

    productDto = productMapper.toDto(
        productRepository.save(productMapper.update(productDto, product))
    );

    return productDto;
  }

  public ProductDto getProduct(Long id) throws NotFoundException {
    Product product = productRepository.findById(id)
        .orElseThrow(NotFoundException::new);

    return productMapper.toDto(product);
  }

  public void delete(Long id) {
    productRepository.deleteById(id);
  }

}
