package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Role;
import java.util.List;

public interface IRoleService {
    List<Role> getAll();
}