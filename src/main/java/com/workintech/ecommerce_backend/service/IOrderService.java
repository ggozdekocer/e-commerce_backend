package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.dto.OrderRequest;
import com.workintech.ecommerce_backend.entity.Order;
import com.workintech.ecommerce_backend.entity.User;
import java.util.List;

public interface IOrderService {
    Order create(User user, OrderRequest request);
    List<Order> getAllByUser(User user);
}