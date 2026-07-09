package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Category;
import java.util.List;

public interface ICategoryService {
    List<Category> getAll();
}