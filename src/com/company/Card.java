package com.company;

public class Card {

    private String suit;
    private String rank;
    private int cardValue;
    private int numericWeightOfCard;

    public void printDetails(){
        System.out.println("Card is: " + this.suit + " : " + this.rank + " With a value of:  " + this.cardValue);
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getCardValue(Card newCard) {
        if (this.getRank().equalsIgnoreCase("Ace")) {
            numericWeightOfCard = 1;
        } else if (rank.equalsIgnoreCase("2")) {
            numericWeightOfCard = 2;
        } else if (rank.equalsIgnoreCase("3")) {
            numericWeightOfCard = 3;
        } else if (rank.equalsIgnoreCase("4")) {
            numericWeightOfCard = 4;
        } else if (rank.equalsIgnoreCase("5")) {
            numericWeightOfCard = 5;
        } else if (rank.equalsIgnoreCase("6")) {
            numericWeightOfCard = 6;
        } else if (rank.equalsIgnoreCase("7")) {
            numericWeightOfCard = 7;
        } else if (rank.equalsIgnoreCase("8")) {
            numericWeightOfCard = 8;
        } else if (rank.equalsIgnoreCase("9")) {
            numericWeightOfCard = 9;
        } else if (rank.equalsIgnoreCase("10")) {
            numericWeightOfCard = 10;
        } else if (rank.equalsIgnoreCase("Jack")) {
            numericWeightOfCard = 11;
        } else if (rank.equalsIgnoreCase("Queen")) {
            numericWeightOfCard = 12;
        } else if (rank.equalsIgnoreCase("King")) {
            numericWeightOfCard = 13;
        }
        return  numericWeightOfCard;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getNumericWeightOfCard() {
        return numericWeightOfCard;
    }

    public void setNumericWeightOfCard(int numericWeightOfCard) {
        this.numericWeightOfCard = numericWeightOfCard;
    }

}
