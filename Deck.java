package example;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;

import com.company.ArrayStack;

import homework_7.Dictionary;

public class Deck {
	public static int suit = 4;
	public static int rank = 13;
	public static int numberOfCards = suit*rank;

	Dictionary<String, Card> cards = new Dictionary<String, Card>(numberOfCards);

	public Deck() {
		for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
			for (int rank = Card.ACE; rank <= Card.KING; rank++) {
				cards.put(suit +""+rank, new Card(rank, suit));
			}
		}
	}

	public Card getCard(int suit, int rank) {
		return (Card) cards.get(suit+""+rank);
	}
	
	public Dictionary<String, Card> shuffle() {
		
		LinkedList<String> suit;
		suit = (LinkedList<String>) cards.keySet();
		
		ArrayStack<String> deck = new ArrayStack<String>(cards.size());
        while (suit.size() > 0) {
        int i = (int) (Math.random() * suit.size());
        deck.push(suit.remove(i));
    }
		return cards;
	}
}
