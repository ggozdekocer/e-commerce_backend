package com.workintech.ecommerce_backend.entity;

import java.util.List;

public class Order {
    private Long id;
    private Long addressId;      // address_id
    private String orderDate;    // order_date
    private Double price;
    private String cardNo;       // card_no
    private String cardName;     // card_name
    private Integer cardExpireMonth; // card_expire_month
    private Integer cardExpireYear;  // card_expire_year
    private User user;
    private List<OrderItem> items;
}
