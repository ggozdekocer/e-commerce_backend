package com.workintech.ecommerce_backend.controller;

import com.workintech.ecommerce_backend.dto.LoginRequest;
import com.workintech.ecommerce_backend.dto.SignupRequest;
import com.workintech.ecommerce_backend.entity.User;
import com.workintech.ecommerce_backend.security.JwtUtil;
import com.workintech.ecommerce_backend.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final IUserService userService;
    private final JwtUtil jwtUtil;

    @PostMapping("/signup")
    public Map<String, Object> signup(@RequestBody SignupRequest request) {
        User user = userService.save(request);
        String token = jwtUtil.generateToken(user.getEmail());
        return Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", user.getRole(),
                "token", token
        );
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest request) {
        User user = userService.login(request);
        String token = jwtUtil.generateToken(user.getEmail());
        return Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", user.getRole(),
                "token", token
        );
    }

    @GetMapping("/verify")
    public Map<String, Object> verify(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        String token = jwtUtil.generateToken(user.getEmail());
        return Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", user.getRole(),
                "token", token
        );
    }
}