package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Product;
import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product getById(Long id);
}