package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WarGamesDemo {

    public static void main(String[] args) {

        Deck deck = new Deck();
        DeckGenerator generator = new DeckGenerator();
        Players players = new Players();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean playAgain = false;
        ArrayList<Card> tempCard = new ArrayList<Card>();
        int rounds = 1;


        System.out.println("Welcome to War Games.  Shall we play a game?\n");
        System.out.println("Press [1] for YES\nPress [2] for NO");
        userInput = scanner.nextInt();
        scanner.nextLine();

        switch (userInput) {
            case 1:
                do {

//                    Create a deck of cards to play with.
                    deck.setCardDeck(deckOfCards);

//                    Shuffle the deck of cards.
                    generator.shuffleDeckOfCards(deckOfCards);

//                    UNCOMMENT THE NEXT LINE TO TROUBLESHOOT.  THE NEXT LINE WILL SHOW ALL OF OF THE CARDS IN THE DECK.
//                    generator.showAllCardsInDeck(deckOfCards);

//                    Split the shuffled decked of cards into two equal decks.
                    ArrayList<Card> player1DeckOfCards = players.firstHalfOfSplitDeck(deckOfCards);
                    ArrayList<Card> player2DeckOfCards = players.secondHalfOfSplitDeck((deckOfCards));

//                        UNCOMMENT THE NEXT FEW LINES TO TROUBLESHOOT.  THE NEXT LINES WILL SHOW ALL OF OF THE
//                        CARDS IN TWO SPLIT DECKS.
//                        System.out.println("Player 1's Cards:");
//                        generator.showAllCardsInDeck(player1DeckOfCards);
//                        System.out.println("--------");
//                        System.out.println("Player 2's Cards:");
//                        generator.showAllCardsInDeck(player2DeckOfCards);

                    System.out.println("Great!  Let's get started!\n");

                    while (player1DeckOfCards.size() > 0 && player2DeckOfCards.size() > 0) {

                        System.out.println("-----Round " + rounds + "-----");
                        players.showCards(player1DeckOfCards, player2DeckOfCards);
                        rounds++;
                    }

                    if (player1DeckOfCards.size() == 0) {
                        System.out.println("Player 1 is the WINNER!");
                        String = 
                        System.out.println();
                    } else if (player2DeckOfCards.size() == 0) {
                        System.out.println("Player 2 is the WINNER!");
                    }

                } while (playAgain);
        }
    }
}
