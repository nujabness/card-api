package com.nujabness.cardapi.api.controller;

import com.nujabness.cardapi.bean.Deck;
import com.nujabness.cardapi.service.card.ICardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cards")
public class CardController {

    private final ICardService cardService;

    public CardController(ICardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/deck")
    public ResponseEntity<?> getDeck() {
        Deck deck = cardService.getDeck();
        return new ResponseEntity<>(deck, HttpStatus.OK);
    }
}
