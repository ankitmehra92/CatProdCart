package com.example.cats.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cats.entities.CategoryAttributes;

@Repository
public interface CategoryAttributesRepository extends JpaRepository<CategoryAttributes,Long> {

}
