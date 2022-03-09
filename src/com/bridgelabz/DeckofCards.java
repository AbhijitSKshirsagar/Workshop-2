/*
  Write a Program to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players.

1. Ability to work with GIT
2. Expected to have OOPs
3. Expected to have Data Structures

 Each time we distribute the cards with the Player, Condition is that we shuffle the cards. Make a function to shuffle the cards

 */

package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckofCards {
	Scanner scanner = new Scanner(System.in);
	private static final String[][] deckofCards = null;
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
			sequenceOfPlay(player);
		} else {
			System.out.println("Please enter number of players in the Range");
			noOfPlayers();
		}
		scanner.close();
	}

	// create a method to sequence the Players order and how they should receive the
	// cards and further order for play
	public void sequenceOfPlay(int player) {
		System.out.println("\nSequence of cards are below : ");
		toshuffle(cardsDeck, player);
	}

	// create a method to distribute the cards with the Player
	public static ArrayList<String> toshuffle(ArrayList<String> cardsDeck, int player) {
		System.out.println("Shuffling the cards before Distribution");
		ArrayList<String> temp = new ArrayList<String>();
		while (!cardsDeck.isEmpty()) {
			int loc = (int) (Math.random() * cardsDeck.size());
			temp.add(cardsDeck.get(loc));
			cardsDeck.remove(loc);
		}
		cardsDeck = temp;
		toDisplay(cardsDeck);
		return cardsDeck;
	}

	public static void main(String[] args) {

		DeckofCards deckofCards = new DeckofCards();
		deckofCards.deckofCards();
		deckofCards.noOfPlayers();

	}
}
