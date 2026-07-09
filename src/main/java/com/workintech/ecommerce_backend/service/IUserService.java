package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.dto.LoginRequest;
import com.workintech.ecommerce_backend.dto.SignupRequest;
import com.workintech.ecommerce_backend.entity.User;

public interface IUserService {
    User save(SignupRequest request);
    User login(LoginRequest request);
    User verify(String email);
}