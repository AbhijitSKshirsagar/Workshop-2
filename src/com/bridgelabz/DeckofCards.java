/*
 * Write a Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.

1. Ability to work with GIT
2. Expected to have OOPs
3. Expected to have Data Structures

UC1 : Setup the initial game with deck of cards and make sure we have unique cards, 
The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare
 */

package com.bridgelabz;

import java.util.ArrayList;

public class DeckofCards {
	public ArrayList<String> cardsDeck = new ArrayList<String>();

	public void deckofCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck is : " + numOfCards);
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "-->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}

	// creating methods to display the cards
	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards the Game");
		// calling to deck of cards class
		DeckofCards deckofCards = new DeckofCards();
		deckofCards.deckofCards();

	}
}
