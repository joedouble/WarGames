package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckGenerator {

    private ArrayList<String> suits = new ArrayList<String>(Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds"));
    private ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("Ace",  "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King"));
    private Card newCard;
//  private int cardValue;

    public void shuffleDeckOfCards(ArrayList<Card> deck){
        Collections.shuffle(deck);
    }

    public void showAllCardsInDeck(ArrayList<Card> deck) {
        for (Card cards : deck) {
            cards.printDetails();
        }
    }

    public ArrayList<Card> makeADeckOfCards() {
        ArrayList<Card> deckOfCards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                newCard = new Card(suit, rank);
                newCard.setValueOfCard(newCard.getValueOfCard(newCard));
                deckOfCards.add(newCard);
            }
        }
        return deckOfCards;
    }

    public Card getNewCard() {
        return newCard;
    }

    public void setNewCard(Card newCard) {
        this.newCard = newCard;
    }
}
