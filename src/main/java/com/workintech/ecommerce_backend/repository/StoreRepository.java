package com.workintech.ecommerce_backend.repository;

import com.workintech.ecommerce_backend.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
