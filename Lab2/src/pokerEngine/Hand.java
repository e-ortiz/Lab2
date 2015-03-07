package pokerEngine;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int cardAmount = 5;
	private int Score = 0;
	private int HighCard = 0;
	private int WinStatus = 0;
	
	public static Hand evaluate(Hand[] hands) {
		for (int i=0; i < hands.length; i++) {
			evaluate(hands[i]);
		}
		for (int i=0; i < hands.length; i++) {
			for (int j = i; j < hands.length; j++) {
				while (hands[i].Score >= hands[j].Score) {
					hands[i].WinStatus++;
				}
			}
		}
		for (int i=0; i < hands.length-1; i++) {
			if (hands[i].WinStatus == hands.length) {
				return hands[i];
			}
		}
		return hands[hands.length];
	}
	
	public Hand(Deck deck){
		this.cards = new ArrayList<Card>();

		for(int c = 0; c < this.cardAmount; c++){
			cards.add(deck.draw());
		}
		this.arrange();
	}
	
	public void display() {
		for(Card x : this.cards){
			System.out.print(x.getERank());
			System.out.println(" of " + x.getESuit());
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
	}
	
	protected eCardRank CardERank(int i) {
		return this.cards.get(i).getERank();
	}
	
	protected eSuit CardESuit(int i) {
		return this.cards.get(i).getESuit();
	}
	
	protected int CardRank(int i) {
		return this.cards.get(i).getRank();
	}
	protected boolean isRoyalFlush() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected boolean isFlush() {
		for (int i=0; i < cardAmount-1; i++){	
			if (this.CardESuit(i) != this.CardESuit(i+1))
				return false;
		}
		return true;
	}
	
	protected boolean isStraight() { //not finished
		return false;
		/**for (int i=0; i < cardAmount -1; i++) {
			if (this.CardERank(i+5)) == (eCardRank.values()[this.cards.get(i).getERank.ordinal()+5])) { 
				eCardRank.values()[j];
				Card card = new Card(Clubs, Two);
				
			}
		}
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
		**/
	}
	
	protected boolean isFourofaKind() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected boolean isFullHouse() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected boolean isThreeofaKind() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected boolean isTwoPair() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected boolean isPair() {
		return this.CardERank(0) == eCardRank.Ten && this.CardERank(4) == eCardRank.Ace && isFlush();
	}
	
	protected int HighCard() {
		for (int i=0; i < this.cardAmount; i++) {
			this.HighCard = this.HighCard + this.CardRank(i);
		}
		return this.HighCard;
	}
	
	protected static void evaluate(Hand hand) { //Not finished
		if (hand.isRoyalFlush())
			hand.Score = eValue.RoyalFlush.getValue();
		else if(hand.isFlush() && hand.isStraight())
			hand.Score = eValue.StraightFlush.getValue();
		else if(hand.isFourofaKind())
			hand.Score = eValue.FourofaKind.getValue();
		else if(hand.isFullHouse())
			hand.Score = eValue.FullHouse.getValue();
		else if(hand.isFlush())
			hand.Score = eValue.Flush.getValue();
		else if(hand.isStraight())
			hand.Score = eValue.Straight.getValue();
		else if(hand.isThreeofaKind())
			hand.Score = eValue.ThreeofaKind.getValue();
		else if(hand.isTwoPair())
			hand.Score = eValue.TwoPair.getValue();
		else if(hand.isPair())
			hand.Score = eValue.Pair.getValue();
		else 
			hand.Score = hand.Score - 7809;
		hand.Score = hand.Score + hand.HighCard();
	}
	
	
}