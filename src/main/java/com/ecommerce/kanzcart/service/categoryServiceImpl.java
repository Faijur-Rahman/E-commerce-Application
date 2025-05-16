package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class categoryServiceImpl implements CategoryService{
    private List<Category> categories = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public String removeCategory(Long categoryId) {
        Category category1 = categories.stream().filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst().orElse(null);

        if (category1 == null)
            return "Category not found";

        categories.remove(category1);
        return "Category with categoryId: " + categoryId + " removed Successfully !!";
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }
}
