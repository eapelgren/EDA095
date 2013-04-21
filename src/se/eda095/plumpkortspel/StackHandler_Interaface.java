package se.eda095.plumpkortspel;


public interface StackHandler_Interaface {
	//SetCard = Returnerar -1 om spelet inte tillåter det spelade kortet,
	//om spelet är godkänt returneras det nya värdet som ligget på stacken,
	//detta värde kommer skickas ut till samtlig spelare
	public int setCard(Card card, Stack stack);
	public Card currentCard(Stack stack);
	
	
	
}
