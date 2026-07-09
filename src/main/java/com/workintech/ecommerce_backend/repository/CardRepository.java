package com.workintech.ecommerce_backend.repository;

import com.workintech.ecommerce_backend.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByUserId(Long userId);
}

