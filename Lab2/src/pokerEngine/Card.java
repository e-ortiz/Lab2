package pokerEngine;

public class Card {

	private eSuit suit;
	private eCardRank rank;

	protected Card(eSuit suit, eCardRank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	protected eCardRank getERank() {
		return this.rank;
	}

	protected int getRank() {
		return this.rank.getCardRank();
	}

	protected eSuit getESuit() {
		return this.suit;
	}
}
