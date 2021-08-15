package com.example.cats.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cats.entities.ProductAttributes;

public interface ProductAttributeRepository extends JpaRepository<ProductAttributes, Long> {

}
