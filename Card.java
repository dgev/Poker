package example;

public class Card {
	private int rank;
	private int suit;

	// Suits
	public final static int DIAMONDS = 1;
	public final static int CLUBS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;

	// Ranks
	public final static int ACE = 1;
	public final static int DEUCE = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	//setting the rank to the given rank and the suit to the given suit of the card
	public Card(int rank, int suit) {
		setRank(rank);
		setSuit(suit);
	}

	//gets the suit
	public int getSuit() {
		return suit;
	}
	
	//sets the suit to the given suit after checking its availabiliy
	public void setSuit(int suit) {
		if(isValidSuit(suit)) {
			this.suit = suit;
		}
	}

	//gets the rank
	public int getRank() {
		return rank;
	}
	
	//sets the rank to the given rank after checking its availability
	public void setRank(int rank) {
		if(isValidRank(rank)) {
			this.rank = rank;
		}
	}
	
	//checks whether the rank is valid or not
	public static boolean isValidRank(int rank) {
		return (ACE <= rank && rank <= KING);
	}

	//checks whether the rank is valid or not
	public static boolean isValidSuit(int suit) {
		return (DIAMONDS <= suit && suit <= SPADES);
	}
	//giving each rank its proper name
	public static String rankToString(int rank) {
		switch (rank) {
		case ACE:
			return "Ace";
		case DEUCE:
			return "Deuce";
		case THREE:
			return "Three";
		case FOUR:
			return "Four";
		case FIVE:
			return "Five";
		case SIX:
			return "Six";
		case SEVEN:
			return "Seven";
		case EIGHT:
			return "Eight";
		case NINE:
			return "Nine";
		case TEN:
			return "Ten";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		default:
			return null;
		}
	}

	//giving each suit its proper name
	public static String suitToString(int suit) {
		switch (suit) {
		case DIAMONDS:
			return "Diamonds";
		case CLUBS:
			return "Clubs";
		case HEARTS:
			return "Hearts";
		case SPADES:
			return "Spades";
		default:
			return null;
		}
	}

}
