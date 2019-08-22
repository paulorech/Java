package Chapter10;

public class DinnerPartyWithConstructor2 extends PartyWithConstructor2{

	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}
	
	public DinnerPartyWithConstructor2 (int numGuests) {
		super(numGuests);
	}

	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party!");
	}
	
}
