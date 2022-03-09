/*
  Write a Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.

1. Ability to work with GIT
2. Expected to have OOPs
3. Expected to have Data Structures

 Moving forward we need to have more than 2 players and Max 4 Players, Create Players Class to add Players from console.

 */

package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckofCards {
	Scanner scanner = new Scanner(System.in);
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

	// Created a method for how many players will play the game
	public void noOfPlayers() {
		System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println("\n" + player + " players will play the game");
		} else {
			System.out.println("Please enter number of players in the Range");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards the Game");
		DeckofCards deckofCards = new DeckofCards();
		deckofCards.deckofCards();
		deckofCards.noOfPlayers();
	}
}
