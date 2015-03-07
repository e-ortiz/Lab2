package pokerEngine;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	protected Deck() {
		for (int i = 0; i < 4; i++) {
			eSuit suit = eSuit.values()[i];
			for (int j = 0; j < 13; j++) {
				eCardRank rank = eCardRank.values()[j];
				Card c = new Card(suit, rank);
				DeckCards.add(c);
			}
		}

		Collections.shuffle(DeckCards);
	}

	protected Card draw() {
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;
	}

	protected int NbrOfCards() {
		return DeckCards.size();
	}

}