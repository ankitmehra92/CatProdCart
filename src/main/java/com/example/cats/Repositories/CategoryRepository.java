package com.example.cats.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cats.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
