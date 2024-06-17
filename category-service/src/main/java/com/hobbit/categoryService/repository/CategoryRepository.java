package com.hobbit.categoryService.repository;

import com.hobbit.categoryService.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<Category, UUID> {
}
