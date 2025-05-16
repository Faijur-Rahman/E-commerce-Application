package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.model.Category;

import java.util.List;


public interface CategoryService {

    List<Category> getAllCategories();
    void createCategory(Category category);
    String removeCategory(Long category);

}
