package com.nujabness.cardapi.bean;

import com.nujabness.cardapi.bean.card.Color;
import com.nujabness.cardapi.bean.card.Rank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card implements Comparable<Card> {
    private Color color;
    private Rank rank;

    @Override
    public int compareTo(Card card) {
        if (getRank() == null || card.getRank() == null) {
            return 0;
        }
        return getRank().compareTo(card.getRank());
    }
}
