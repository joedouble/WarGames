package com.company;

import java.util.ArrayList;

public class WarGamesDemo {

    public static void main(String[] args) {

        DeckGenerator generator = new DeckGenerator();
        Deck deck = new Deck();
        ArrayList<Card> deckOfCards = generator.makeDeck();


        deck.setCardDeck(deckOfCards);

        generator.showAllCards(deckOfCards);

        ArrayList<Card> tempFirstHalf = deck.first26OfDeck(deckOfCards);
        ArrayList<Card> tempSecondHalf = deck.second26OfDeck((deckOfCards));

        System.out.println(" ------------------------- ");

        System.out.println("First Half");
        generator.showAllCards(tempFirstHalf);
        System.out.println("\n");
        System.out.println("Second Half");
        generator.showAllCards(tempSecondHalf);
    }
}
