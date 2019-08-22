package Chapter10;
import java.util.*;

public class UseDinnerParty {

	public static void main(String[] args) {
	
		int guests, choice;
		Party aParty = new Party();
		DinnerParty aDinnerParty = new DinnerParty();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of guests for the party:");
		guests = input.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests.");
		
		aParty.displayInvitation();
		System.out.println();
		
		System.out.print("Enter the number of guests for the dinner party: ");
		guests = input.nextInt();
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter a dinner choice -- 1 for chicken or 2 for beef: ");
		choice = input.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		
		System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests.");
		System.out.println("The dinner choice " + aDinnerParty.getDinnerChoice() + " will be served.");
		
		aDinnerParty.displayInvitation();

	}

}
