package com.nujabness.cardapi.bean.card;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Random;

public enum Color {
    SPADES,
    CLUBS,
    HEARTS,
    DIAMONDS;

    private static final Random RAND = new Random();

    public static Color randomColor()  {
        Color[] colors = values();
        return colors[RAND.nextInt(colors.length)];
    }
}
