package pokerEngine;

public class Card {
	
	private eSuit suit;
	private eCardRank rank;
	
	public Card(eSuit suit, eCardRank rank){
		this.suit = suit;
		this.rank = rank;
	}
	
	private eCardRank getERank(){
		return rank;
	}
	
	private int getRank() {
		return rank.getCardRank();
	}
	
	private eSuit getSuit() {
		return suit;
	}
	
	
	/**
	public int rank;
	public int suit;
	
	private static String[] ranks = {
		"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
	};
	
	private static String[] suits = {
		"hearts", "spades", "diamonds", "clubs"
	};
	
	private static String getRank(int x) {
		if (x > ranks.length || x < 0)
			return "[unknown rank]";
		else
			return ranks[x];
	}
	
	private static String getSuit(int x) {
		if (x > suits.length || x < 0)
			return "[unknown suit]";
		else
			return suits[x];
	}
	
	@Override
	public String toString() {
		return getRank(rank) + " of " + getSuit(suit);
	}
	
	public Card(int n, int x) {
		this.rank = n;
		this.suit = x;
	}
	*/
	
}
