package pokerEngine;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int cardAmount = 5;
	private int HighCardValue = 0;
	
	/**public static void main(String[] args){
		Deck deck = new Deck();
		System.out.println(deck.NbrOfCards());
		Hand hand1 = new Hand(deck);
		Hand hand2 = new Hand(deck);		
		
		System.out.println("\n Player 1's Hand:");
		hand1.display();

		
		System.out.println("\n Player 2's Hand:");
		hand2.display();
		
		System.out.println(deck.NbrOfCards());
		
	}
*/
	
	public Hand(Deck deck){
		//this.cards = new ArrayList<Card>();

		for(int c = 0; c < this.cardAmount; c++){
			cards.add(deck.draw());
		}
		//this.arrange();
	}
	
	/** public void display(){
	for(Card x : this.cards){
		System.out.print(x.getERank());
		System.out.println(" of " + x.getSuit());
	}
	}
	
	public void arrange(){
		for (int i=0; i < cardAmount-1; i++){	
			if (this.cards.get(i).getRank() > this.cards.get(i+1).getRank()){
				Card temp = this.cards.get(i);
				this.cards.set(i, this.cards.get(i+1));
				this.cards.set(i+1, temp);
				this.arrange();		// Recursive
			}
		}
		
	**/
	
}