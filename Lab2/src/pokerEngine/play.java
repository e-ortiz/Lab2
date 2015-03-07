package pokerEngine;
import pokerEngine.Hand;;

public class play {
	
	//public play(Deck deck) {
		//super(deck);
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args){

		Deck deck = new Deck();
		System.out.println(deck.NbrOfCards());
		Hand hand1 = new Hand(deck);
		Hand hand2 = new Hand(deck);		
		
		System.out.println("\n Player 1's Hand:");
		hand1.display();

		
		System.out.println("\n Player 2's Hand:");
		hand2.display();
		
		System.out.println(deck.NbrOfCards());
		
		Hand[] hands = {hand1, hand2};
		
		if (hand1==Hand.evaluate(hands)) {
			System.out.println("player 1 wins");
		}
		else {
			System.out.println("player 2 wins");
		}
		
	}
	
}
