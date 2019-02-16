package com.company;

import java.util.ArrayList;

public class WarGamesDemo {

    public static void main(String[] args) {

        Deck deck = new Deck();
        DeckGenerator generator = new DeckGenerator();
        Players players = new Players();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();


        deck.setCardDeck(deckOfCards);

//        generator.shuffleDeckOfCards(deckOfCards);

        generator.showAllCardsInDeck(deckOfCards);


        ArrayList<Card> tempFirstHalf = players.firstHalfOfSplitDeck(deckOfCards);
        ArrayList<Card> tempSecondHalf = players.secondHalfOfSplitDeck((deckOfCards));


        System.out.println(" ------------------------- ");

        System.out.println("First Half");
        generator.showAllCardsInDeck(tempFirstHalf);
        System.out.println("\n");
        System.out.println("Second Half");
        generator.showAllCardsInDeck(tempSecondHalf);

        System.out.println(" ------------------------- ");

        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);
        players.showCards(tempFirstHalf, tempSecondHalf);

        players.showCards(tempFirstHalf, tempSecondHalf);


        System.out.println(" ------------------------- ");

        System.out.println("First Half After Round");
        generator.showAllCardsInDeck(tempFirstHalf);
        System.out.println("\n");
        System.out.println("Second Half After Round");
        generator.showAllCardsInDeck(tempSecondHalf);


    }
}
