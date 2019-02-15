package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckGenerator {

    private ArrayList<String> suits = new ArrayList<String>(Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds"));
    private ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("Ace",  "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King"));
    private Card newCard;
    private int cardValue;

    public void showAllCards(ArrayList<Card> deck) {
        for (Card cards : deck) {
            cards.printDetails();
            Collections.shuffle(deck);
        }

    }

    public ArrayList<Card> makeDeck() {

        ArrayList<Card> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                newCard = new Card(suit, rank);
                deck.add(newCard);
                newCard.setCardValue(newCard.getCardValue(newCard));
            }
        }
        return deck;
    }

    public Card getNewCard() {
        return newCard;
    }

    public void setNewCard(Card newCard) {
        this.newCard = newCard;
    }
}
