package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Card;
import com.workintech.ecommerce_backend.entity.User;
import com.workintech.ecommerce_backend.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements ICardService {

    private final CardRepository cardRepository;

    @Override
    public List<Card> getAllByUser(User user) {
        return cardRepository.findByUserId(user.getId());
    }

    @Override
    public Card save(User user, Card card) {
        card.setUser(user);
        return cardRepository.save(card);
    }

    @Override
    public void delete(User user, Long id) {
        Card card = cardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Card not found"));
        if (!card.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized");
        }
        cardRepository.delete(card);
    }
}