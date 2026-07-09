package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Address;
import com.workintech.ecommerce_backend.entity.User;
import java.util.List;

public interface IAddressService {
    List<Address> getAllByUser(User user);
    Address save(User user, Address address);
    void delete(User user, Long id);
}