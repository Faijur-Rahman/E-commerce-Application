package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.model.Category;

import java.util.List;


public interface CategoryService {
    List<Category> getAllcategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
