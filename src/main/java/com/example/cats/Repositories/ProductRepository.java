package com.example.cats.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.cats.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
