package com.sepideh.inheritance.controller.singletable;

import com.sepideh.inheritance.dto.singletable.ProductDto;
import com.sepideh.inheritance.service.singletable.ProductService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public ResponseEntity<List<ProductDto>> getProducts() {
    return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
  }

}
