package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
//List created to hold the deck of 52 cards
	
	List <Card> cards = new ArrayList<Card>();
	
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Jack", "Queen", "King", "Ace"};
		
//Deck method to hold the deck.
//Two for loops used to combine the card numbers and card suits into one string.
//Enhanced for loops didn't allow the card value to be assigned.
//By using a normal for loop, the int from the loops can be used to set the name and set the value.
		
		
		Deck () {
			
			for (int v = 2; v < 15; v++) {
				for (int s = 0; s < suits.length; s++) {
					Card c = new Card();
					c.setValue(v);
					c.setName(numbers[v-2] + " of " + suits[s]);
					cards.add(c);
				}
			}
					
			}

		
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
//Describe method that uses an enhanced for loop to go through each card in the deck.
//Uses the describe method from the Card class.
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	
		}

//Method to shuffle the deck for each game.
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
//Method to remove the top card from the deck. 
//The top card would represented by the element at the 0 index.
	
	public Card draw () {
		Card card = this.cards.remove(0);
//		card.describe();
		return card;
	}
	
	

}


