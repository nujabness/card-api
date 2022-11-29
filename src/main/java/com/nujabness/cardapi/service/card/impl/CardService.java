package com.nujabness.cardapi.service.card.impl;

import com.nujabness.cardapi.bean.Card;
import com.nujabness.cardapi.bean.Deck;
import com.nujabness.cardapi.bean.card.Color;
import com.nujabness.cardapi.bean.card.Rank;
import com.nujabness.cardapi.service.card.ICardService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService implements ICardService {

    public Deck getDeck() {
        Deck deck = new Deck();
        deck.setOrderRanks(getShuffledRanks());
        deck.setOrderColors(getShuffledColors());
        deck.setShuffledCards(getShuffledHand());
        deck.setSortedCards(getSortedCards(deck.getOrderColors(), deck.getOrderRanks(), deck.getShuffledCards()));

        return deck;
    }

    private List<Card> getSortedCards(List<Color> orderColors, List<Rank> orderRanks, Set<Card> cards) {
        List<Card> sortedCards = new ArrayList<>();
        orderColors.forEach(color -> {
            sortedCards.addAll(cards.stream().filter(card -> card.getColor() == color).sorted(Comparator.comparing(card -> orderRanks.indexOf(card.getRank()))).toList());
        });

        return sortedCards;
    }

    private Set<Card> getShuffledHand() {
        Set<Card> cards = new HashSet<>();
        while (cards.size() < 10) {
            Card card = new Card(Color.randomColor(), Rank.randomRank());
            cards.add(card);
        }

        return cards;
    }

    private List<Color> getShuffledColors() {
        List<Color> colors = new ArrayList<>(EnumSet.allOf(Color.class));
        Collections.shuffle(colors);
        return colors;
    };

    private List<Rank> getShuffledRanks() {
        List<Rank> ranks = new ArrayList<>(EnumSet.allOf(Rank.class));
        Collections.shuffle(ranks);
        return ranks;
    }
}
