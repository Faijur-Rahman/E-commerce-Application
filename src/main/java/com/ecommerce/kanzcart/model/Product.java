package com.ecommerce.kanzcart.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank
    @Size( min = 3, message = "Product name must contain atleast 5 characters")
    private String productName;
    private String image;
    @NotBlank
    @Size( min = 6, message = "Description must contain atleast 6 characters")
    private String description;
    private Integer quantity;
    private double price; // 100
    private double discount; // 25
    private Double specialPrice; // 75

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
