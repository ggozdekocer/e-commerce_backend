package com.workintech.ecommerce_backend.controller;

import com.workintech.ecommerce_backend.entity.Product;
import com.workintech.ecommerce_backend.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getById(id);
    }
}