package com.kanzcart.kanzcart.controller;

import com.kanzcart.kanzcart.model.Category;
import com.kanzcart.kanzcart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
     private CategoryService categoryService;

     @GetMapping("/api/public/categories")
     public List<Category> getAllCategories() {
         return categoryService.getAllcategories();
     }

     @PostMapping("/api/public/categories")
     public String createCategory(@RequestBody Category category) {
         categoryService.createCategory(category);
         return "Category Added Successfully";
     }

     @DeleteMapping("/api/admin/categories/{categoryId}")
     public String deleteCategory(@PathVariable Long categoryId) {
         String status = categoryService.deleteCategory(categoryId);
         return status;
     }
}
