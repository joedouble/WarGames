package com.company;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private ArrayList<Card> cardDeck;

//    public ArrayList<Card> firstHalfOfSplitDeck(ArrayList<Card> deck) {
//        ArrayList<Card> firstHalf = new ArrayList<Card>(deck.subList(0, 26));
//        return firstHalf;
//    }
//
//    public ArrayList<Card> secondHalfOfSplitDeck(ArrayList<Card> deck) {
//        ArrayList<Card> secondHalf = new ArrayList<Card>(deck.subList(26, 52));
//        return secondHalf;
//    }

    public void setCardDeck(ArrayList<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }
}
