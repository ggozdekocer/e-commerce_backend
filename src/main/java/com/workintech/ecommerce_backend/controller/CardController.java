package com.workintech.ecommerce_backend.controller;

import com.workintech.ecommerce_backend.entity.Card;
import com.workintech.ecommerce_backend.entity.User;
import com.workintech.ecommerce_backend.service.ICardService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/card")
@RequiredArgsConstructor
public class CardController {

    private final ICardService cardService;

    @GetMapping
    public List<Card> getCards(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return cardService.getAllByUser(user);
    }

    @PostMapping
    public Card addCard(@RequestBody Card card, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return cardService.save(user, card);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        cardService.delete(user, id);
    }
}