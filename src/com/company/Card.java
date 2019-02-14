package com.company;

public class Card {

    private String suit;
    private String rank;
    private int numericWeightOfCard;

    public void printDetails(){
        System.out.println("Card is: " + this.suit + ":" + this.rank);
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int cardValue(Card card) {
        if (this.rank.equalsIgnoreCase("Ace")) {
            numericWeightOfCard = 1;
        } else if (this.rank.equalsIgnoreCase("2")) {
            numericWeightOfCard = 2;
        } else if (this.rank.equalsIgnoreCase("3")) {
            numericWeightOfCard = 3;
        } else if (this.rank.equalsIgnoreCase("4")) {
            numericWeightOfCard = 4;
        } else if (this.rank.equalsIgnoreCase("5")) {
            numericWeightOfCard = 5;
        } else if (this.rank.equalsIgnoreCase("6")) {
            numericWeightOfCard = 6;
        } else if (this.rank.equalsIgnoreCase("7")) {
            numericWeightOfCard = 7;
        } else if (this.rank.equalsIgnoreCase("8")) {
            numericWeightOfCard = 8;
        } else if (this.rank.equalsIgnoreCase("9")) {
            numericWeightOfCard = 9;
        } else if (this.rank.equalsIgnoreCase("10")) {
            numericWeightOfCard = 10;
        } else if (this.rank.equalsIgnoreCase("Jack")) {
            numericWeightOfCard = 11;
        } else if (this.rank.equalsIgnoreCase("Queen")) {
            numericWeightOfCard = 12;
        } else if (this.rank.equalsIgnoreCase("King")) {
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
