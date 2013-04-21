package se.eda095.plumpkortspel;

public class Stack {
	private int id;
	private Card cardOnStack;

	public Stack(int idOnStack) {
		this.id = idOnStack;
	}

	public void setCard(Card cardToPut) {
		this.cardOnStack = cardToPut;
	}

	public Card getCardOnStack() {
		return cardOnStack;
	}
}
