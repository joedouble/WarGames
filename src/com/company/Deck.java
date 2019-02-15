package com.company;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private ArrayList<Card> cardDeck;

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(ArrayList<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    public ArrayList<Card> first26OfDeck(ArrayList<Card> deck) {
        ArrayList<Card> first26 = new ArrayList<Card>(deck.subList(0, 26));
        return first26;
    }

    public ArrayList<Card> second26OfDeck(ArrayList<Card> deck) {
        ArrayList<Card> last26 = new ArrayList<Card>(deck.subList(26, 52));
        return last26;
    }

}
