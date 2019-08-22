package Chapter10;

public class DinnerPartyWithConstructor extends PartyWithConstructor{

	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party!");
	}
	
}
