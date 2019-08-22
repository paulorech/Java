package Chapter9;
import java.util.Scanner;

public class Majors {
	
			//Create a class named Majors that includes an enumeration 
			//for the six majors offered by a college as follows: ACC, 
			//CHEM, CIS, ENG, HIS, PHYS. Display the enumeration values 
			//for the user, and then prompt the user to enter a major. 
			//Display the college division in which the major falls. 
			//ACC and CIS are in the Business Division, CHEM and PHYS 
			//are in the Science Division, and ENG and HIS are in the 
			//Humanities Division. Save the file as Majors.java.		
	
	enum Major {CHEM, CIS, ENG, HIS, PHYS};

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Major major;
		
		System.out.println("Majors: ");
		System.out.println();
		for (Major values: Major.values()) {
			System.out.println(values);
		}
		System.out.println();
		System.out.println("Enter a major: ");
		String userInput = input.nextLine();
		
		if ((userInput.equalsIgnoreCase("CHEM")) || (userInput.equalsIgnoreCase("PHIS"))){
			System.out.println("Science Division");
		} else if ((userInput.equalsIgnoreCase("ACC")) || (userInput.equalsIgnoreCase("CIS"))){
			System.out.println("Business Division");
		} else if ((userInput.equalsIgnoreCase("ENG")) || (userInput.equalsIgnoreCase("HIS"))) {
			System.out.println("Humanities Division");
		} else {
			System.out.println("Please enter one of the Major codes above");
		}
	}

}
