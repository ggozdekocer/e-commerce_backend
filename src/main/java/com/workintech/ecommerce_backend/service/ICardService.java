package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Card;
import com.workintech.ecommerce_backend.entity.User;
import java.util.List;

public interface ICardService {
    List<Card> getAllByUser(User user);
    Card save(User user, Card card);
    void delete(User user, Long id);
}