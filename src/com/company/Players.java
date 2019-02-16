package com.company;

import java.util.ArrayList;

public class Players {

    private ArrayList<Card> player1;
    private ArrayList<Card> player2;
    private ArrayList<Card> tempCardHolder;
    private int counter = 0;

    public void showCards(ArrayList<Card> player1HalfOfDeck, ArrayList<Card> player2HalfOfDeck) {

            Card player1Card = player1HalfOfDeck.remove(counter);
            Card player2Card = player2HalfOfDeck.remove(counter);

            System.out.print("Player 1's Card is:  ");
            player1Card.printDetails();

            System.out.print("Player 2's Card is:  ");
            player2Card.printDetails();

            if (player1Card.getValueOfCard(player1Card) > player2Card.getValueOfCard(player2Card)) {
                player1HalfOfDeck.add(player1Card);
                player1HalfOfDeck.add(player2Card);

                System.out.println("Player 1 wins this round.");
            } else if (player2Card.getValueOfCard(player2Card) > player1Card.getValueOfCard(player1Card)) {
                player2HalfOfDeck.add(player2Card);
                player2HalfOfDeck.add(player1Card);

                System.out.println("Player 2 wins this round.");
            }
        }


        public ArrayList<Card> firstHalfOfSplitDeck (ArrayList < Card > deck) {
            ArrayList<Card> firstHalf = new ArrayList<Card>(deck.subList(0, 26));
            return firstHalf;
        }

        public ArrayList<Card> secondHalfOfSplitDeck (ArrayList < Card > deck) {
            ArrayList<Card> secondHalf = new ArrayList<Card>(deck.subList(26, 52));
            return secondHalf;
        }

        public ArrayList<Card> getPlayer1 () {
            return player1;
        }

        public void setPlayer1 (ArrayList < Card > player1) {
            this.player1 = player1;
        }

        public ArrayList<Card> getPlayer2 () {
            return player2;
        }

        public void setPlayer2 (ArrayList < Card > player2) {
            this.player2 = player2;
        }

    public ArrayList<Card> getTempCardHolder() {
        return tempCardHolder;
    }

    public void setTempCardHolder(ArrayList<Card> tempCardHolder) {
        this.tempCardHolder = tempCardHolder;
    }
}



