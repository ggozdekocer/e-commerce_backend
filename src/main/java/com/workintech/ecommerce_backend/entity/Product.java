package com.workintech.ecommerce_backend.entity;

import java.util.List;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private Integer stock;
    private Double rating;
    private Integer sellCount;   // sell_count
    private Category category;
    private List<ProductImage> images;
}
