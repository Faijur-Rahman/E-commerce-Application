package com.kanzcart.kanzcart.service;

import com.kanzcart.kanzcart.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();

    Long nextId = 1L;

    @Override
    public List<Category> getAllcategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categories.stream().filter(c -> c.getCategoryId().equals(categoryId)).findFirst().get();
        categories.remove(category);
        return "Category with CategoryId: " + categoryId + " removed successfully";
    }


}
