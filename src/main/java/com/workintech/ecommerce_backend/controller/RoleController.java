package com.workintech.ecommerce_backend.controller;

import com.workintech.ecommerce_backend.entity.Role;
import com.workintech.ecommerce_backend.service.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoleController {

    private final IRoleService roleService;

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roleService.getAll();
    }
}