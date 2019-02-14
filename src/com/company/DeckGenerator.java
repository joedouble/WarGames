package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DeckGenerator {

    private ArrayList<String> suits = new ArrayList<String>(Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds"));
    private ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("Ace", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "10"));
    private Card newCard;
    private ArrayList<Card> deck = new ArrayList<Card>();

    public void showAllCards(){
        for (Card cards : deck){
            cards.printDetails();
        }

    }

    public void createCard() {

        for (String suit : suits) {
            for (String rank : ranks) {
                newCard = new Card(suit, rank);
                deck.add(newCard);
            }
        }
    }

    public Card getNewCard() {
        return newCard;
    }

    public void setNewCard(Card newCard) {
        this.newCard = newCard;
    }
}
