package com.ecommerce.kanzcart.controller;

import com.ecommerce.kanzcart.model.Category;
import com.ecommerce.kanzcart.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Category added successfully";
    }
    @DeleteMapping("/api/admin/categories/{categoryId}")
    public String removeCategory(@PathVariable Long categoryId) {
        String status = categoryService.removeCategory(categoryId);
        return status;
    }

}
