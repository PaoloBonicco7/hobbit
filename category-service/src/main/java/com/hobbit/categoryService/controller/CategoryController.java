package com.hobbit.categoryService.controller;

import com.hobbit.categoryService.model.Category;
import com.hobbit.categoryService.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor // Lombok annotation to create a constructor with all required fields
@Slf4j // Lombok annotation to create a logger field
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category) {
        return this.categoryRepository.save(category);
    }

    @GetMapping("/all")
    public Iterable<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable String id) {
        UUID categoryId = UUID.fromString(id);
        return categoryRepository.findById(categoryId);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable String id) {
        UUID categoryId = UUID.fromString(id);
        categoryRepository.deleteById(categoryId);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateCategory(@RequestBody Category category) {
        UUID categoryId = category.getId();
        Optional<Category> categoryData = categoryRepository.findById(categoryId);
        if (categoryData.isPresent()) {
            Category _category = categoryData.get();
            _category.setName(category.getName());
            _category.setDescription(category.getDescription());
            categoryRepository.save(_category);
        }
    }
}
