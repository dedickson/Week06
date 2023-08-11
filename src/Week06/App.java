package Week06;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
//Each player name is assigned below.
		
		String name1 = "Bob";
		String name2 = "Joe";
		
//Deck method to create a new deck.
//Shuffle method to shuffle the new deck.
		
		Deck gameDeck = new Deck ();
		gameDeck.shuffle();
		
//Hand list for each player in the game.		
		
		List<Card> hand1 = new ArrayList<>();
		List<Card> hand2 = new ArrayList<>();

//Each player being created for the game.
//Name is pulled from above.
//Score is set to zero for both to start the game.
//The players hand is the list above that will be populated from the deck.		
		
		Player player1 = new Player(name1, 0, hand1);
		Player player2 = new Player(name2, 0, hand2);
		
//Loop to deal each player 26 cards from the deck.
//If function uses the modulo operator to deal every other card to each player.
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 1) {
				player1.draw(gameDeck);
			} if (i % 2 == 0) {
				player2.draw(gameDeck);
			}
		}

//Describe method from Player class to list player name and their hand.
		
		player1.describe();
		System.out.println("---------------------------");
		player2.describe();
		
//For loop to run the game 26 times.
//Will print out the score board for each round. 
		
		for (int i = 0; i < 26 ; i++) {
			
			
			System.out.println("---------------------------");
			System.out.println("SCOREBOARD ROUND " + i);
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
			System.out.println("---------------------------");
			
//The loop then has IF functions to compare the players' cards.
//The flip method is used to draw the top card, print the description and return the card.
//The increment score function is used to add 1 point for the higher card.			
			
			if(player1.flip(hand1).getValue() > player2.flip(hand2).getValue()){
				player1.incrementScore(1);
				} else {
					player2.incrementScore(1);			

//The above loop starts at round zero with score 0-0.
//That makes the 25th round the 26th iteration of the loop.
//To avoid out of bound index errors, the 26th round score board is printed below outside the loop.
			
		}
	}
		
		System.out.println("---------------------------");
		System.out.println("SCOREBOARD ROUND " + 26);
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		System.out.println("---------------------------");
	
//If function that will compare total score and print the winner or if there is a draw.
		
	if (player1.getScore() > player2.getScore()) {
		System.out.println(player1.getName() + " is the winner!");
	} else if (player1.getScore() < player2.getScore()) {
		System.out.println(player2.getName() + " is the winner!");
	} else {
		System.out.println("The game is a draw.");
	}
	
	

	
		}
	}

	

