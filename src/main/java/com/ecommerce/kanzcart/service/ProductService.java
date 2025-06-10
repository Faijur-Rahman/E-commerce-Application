package com.ecommerce.kanzcart.service;

import com.ecommerce.kanzcart.model.Product;
import com.ecommerce.kanzcart.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Product product, Long categoryId);
}
