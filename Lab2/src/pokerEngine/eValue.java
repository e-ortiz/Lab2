package pokerEngine;

public enum eValue {
	RoyalFlush(2000000), StraightFlush(100000000), FourofaKind(90000000), FullHouse(50000000), Flush(10000000), Straight(1000000), ThreeofaKind(100000), TwoPair(
			10000), Pair(2000);

	private int eValue;

	private eValue(int value) {
		this.eValue = value;
	}

	protected int getValue() {
		return this.eValue;
	}
}
