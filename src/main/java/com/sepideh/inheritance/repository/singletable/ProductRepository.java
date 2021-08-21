package com.sepideh.inheritance.repository.singletable;

import com.sepideh.inheritance.model.singletable.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
