package com.workintech.ecommerce_backend.entity;

public class OrderItem {
    private Long id;
    private Integer count;
    private String detail;
    private Order order;
    private Product product;
}
