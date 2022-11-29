package com.nujabness.cardapi.bean;

import com.nujabness.cardapi.bean.card.Color;
import com.nujabness.cardapi.bean.card.Rank;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class Deck {

    private Set<Card> shuffledCards;
    private List<Card> sortedCards;
    private List<Color> orderColors;
    private List<Rank> orderRanks;
}
