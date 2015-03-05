package pokerEngine;

public enum eCardRank {
	Two(1),
	Three(2),
	Four(4),
	Five(8),
	Six(16),
	Seven(32),
	Eight(64),
	Nine(128),
	Ten(256),
	Jack(512),
	Queen(1024),
	King(2048),
	Ace(4096);
	
	private int eCardRank;
	
	private eCardRank (int rank)
	{
		this.eCardRank = rank;
	}
	
	public int getCardRank() {
		return eCardRank;
	}
	}
