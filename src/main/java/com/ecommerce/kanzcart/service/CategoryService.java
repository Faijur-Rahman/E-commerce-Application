package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.payload.CategoryDTO;
import com.ecommerce.kanzcart.payload.CategoryResponse;


public interface CategoryService {
    CategoryResponse getAllcategories(Integer pageNumber,Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
