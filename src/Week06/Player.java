package Week06;

import java.util.ArrayList;
import java.util.List;



public class Player {

//Variables that represent each player: their name, their score, and the cards they hold.
	
	
	int score;
	String name;
	List<Card> hand = new ArrayList<Card>();
	
//Constructor used to build each player.
//Only the player name and score are being used.
//The hand list is not added to the constructor.
	
	public Player (String name, int score, List<Card> hand) {
		this.name = name;
		this.score = 0;	
	}
	
	
	
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
//Describe method that will print the player name and the cards they hold.
//Used at the beginning of the game to list the each player's hand.
	
	public void describe () {
	System.out.println(this.name + " has a hand of:  \n---------------------------");
	for (Card card : hand) {
			card.describe();
		}
		
	}
	
//Flip method will remove the top card from the player's hand. 
//Then the player's name and card description are printed.
//The card is then returned.	
	
	public Card flip (List<Card> hand) {
		Card card = this.hand.remove(0);
		System.out.print(name + ": ");
		card.describe();
		return card;
	}
	
//Draw method is used to deal each player.
//The method will take the top card from the deck and add it the players hand.
//The players hand is the list created in this class.
//This wasn't working with the hand list in the constructor. 
		
	public void draw (Deck deck) {
		this.hand.add(deck.draw());
			}

//Method used to add a point to the player score with the higher card each round.	
	
	public void incrementScore (int point) {
			this.score += point;
	
		}
	
}
