package se.eda095.plumpkortspel;


public interface StackHandler_Interaface {
	//SetCard = Returnerar -1 om spelet inte till�ter det spelade kortet,
	//om spelet �r godk�nt returneras det nya v�rdet som ligget p� stacken,
	//detta v�rde kommer skickas ut till samtlig spelare
	public int setCard(Card card, Stack stack);
	public Card currentCard(Stack stack);
	
	
	
}
