package com.nujabness.cardapi.bean;

import com.nujabness.cardapi.bean.card.Color;
import com.nujabness.cardapi.bean.card.Rank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {

    private Color color;
    private Rank rank;
}
