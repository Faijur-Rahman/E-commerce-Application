package com.ecommerce.kanzcart.controller;

import com.ecommerce.kanzcart.model.Category;
import com.ecommerce.kanzcart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
     private CategoryService categoryService;

     @GetMapping("/public/categories")
     public ResponseEntity<List<Category>> getAllCategories() {
         List<Category> categories = categoryService.getAllcategories();
         return new ResponseEntity<>(categories, HttpStatus.OK);
     }

     @PostMapping("/public/categories")
     public ResponseEntity<String> createCategory(@RequestBody Category category) {
         categoryService.createCategory(category);
         return new ResponseEntity<>("Category Added Successfully", HttpStatus.CREATED);
     }

     @DeleteMapping("/admin/categories/{categoryId}")
     public ResponseEntity<String> deleteCategory(@PathVariable("categoryId") Long categoryId) {
         try {
             String status = categoryService.deleteCategory(categoryId);
             return new ResponseEntity<>(status,HttpStatus.OK);
         } catch (ResponseStatusException e) {
             return new ResponseEntity<>(e.getReason(), e.getStatusCode());
         }
     }

     @PutMapping("/admin/categories/{categoryId}")
     public ResponseEntity<String> updateCategory(@RequestBody Category category, @PathVariable("categoryId") Long categoryId) {
         try {
             Category savedCategory = categoryService.updateCategory(category, categoryId);
             return new ResponseEntity<>("Category with categoryId: " + categoryId + " Updated successfully",HttpStatus.OK);
         } catch (ResponseStatusException e) {
             return new ResponseEntity<>(e.getReason(), e.getStatusCode());
         }
     }
}
