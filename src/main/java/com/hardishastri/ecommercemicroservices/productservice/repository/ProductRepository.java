package com.hardishastri.ecommercemicroservices.productservice.repository;

import com.hardishastri.ecommercemicroservices.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
