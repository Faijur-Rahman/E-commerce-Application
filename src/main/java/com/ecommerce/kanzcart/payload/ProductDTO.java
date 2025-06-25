package com.ecommerce.kanzcart.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long productId;
    private Long categoryId;
    @NotBlank
    @Size( min = 3, message = "Product name must contain atleast 5 characters")
    private String productName;
    private String image;
    @NotBlank
    @Size( min = 6, message = "Description must contain atleast 6 characters")
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;
}
