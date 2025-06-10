package com.ecommerce.kanzcart.controller;

import com.ecommerce.kanzcart.model.Product;
import com.ecommerce.kanzcart.payload.ProductDTO;
import com.ecommerce.kanzcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody Product product,
                                                 @PathVariable Long categoryId) {
        ProductDTO productDTO = productService.addProduct(product, categoryId);
        return productDTO;
    }
}
