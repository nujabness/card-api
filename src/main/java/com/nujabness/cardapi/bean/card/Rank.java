package com.nujabness.cardapi.bean.card;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Random;

public enum Rank {
    UN("2"),
    DEUX("3"),
    TROIS("4"),
    QUATRE("5"),
    CINQ("6"),
    SIX("7"),
    SEPT("8"),
    HUIT("9"),
    NEUF("10"),
    J("J"),
    Q("Q"),
    K("K"),
    A("A");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    @JsonValue
    public String getRank() {
        return rank;
    }
    private static final Random RAND = new Random();

    public static Rank randomRank()  {
        Rank[] ranks = values();
        return ranks[RAND.nextInt(ranks.length)];
    }

}
