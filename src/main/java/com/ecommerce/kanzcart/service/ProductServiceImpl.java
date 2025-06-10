package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.exceptions.ResourceNotFoundException;
import com.ecommerce.kanzcart.model.Category;
import com.ecommerce.kanzcart.model.Product;
import com.ecommerce.kanzcart.payload.ProductDTO;
import com.ecommerce.kanzcart.repositories.CategoryRepository;
import com.ecommerce.kanzcart.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO addProduct(Product product, Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category","categoryId",categoryId));
        product.setCategory(category);
        double specialPrice =
        return null;
    }
}
