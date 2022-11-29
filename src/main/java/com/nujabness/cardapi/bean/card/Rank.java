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
    J("11"),
    Q("12"),
    K("13"),
    A("14");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    @JsonValue
    public String getRank() {
        return switch (rank) {
            case "11" -> "J";
            case "12" -> "Q";
            case "13" -> "K";
            case "14" -> "A";
            default -> rank;
        };
    }
    private static final Random RAND = new Random();

    public static Rank randomRank()  {
        Rank[] ranks = values();
        return ranks[RAND.nextInt(ranks.length)];
    }

}
