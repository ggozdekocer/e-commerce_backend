package com.workintech.ecommerce_backend.controller;

import com.workintech.ecommerce_backend.entity.Category;
import com.workintech.ecommerce_backend.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final ICategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.getAll();
    }
}