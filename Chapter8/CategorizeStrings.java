package Chapter8;
import java.util.Scanner;
import java.util.ArrayList;

public class CategorizeStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int count;
		
		String[] longS = new String[20];
		String[] shortS = new String[20];
		
		String line = "";
		int shortL = 0, longL = 0;
		count = 0;
		
		while (!line.equalsIgnoreCase("QUIT") && count < 20) {
			System.out.println("Enter data or enter QUIT to quit: ");
			line = input.nextLine();
			count++;
			if(line.equalsIgnoreCase("QUIT"))
				break;
				if(line.length()<=10) {
					shortS[shortL] = line;
					shortL++;
				} 
				if(line.length()>10) {
					longS[longL] = line;
					longL++;
				} 
		}
		
		System.out.print("Which type of string would you like to display? "
				+ "\nPress 1 to display Short List or 2 to display Long List: ");
		int choice = input.nextInt();
		switch (choice) {
			case 1: 
				if(shortS.equals(null) ) {
					System.out.println("Short String List is empty");
				} else {
					for (int x=0; x<shortL; x++) {
					System.out.println(shortS[x]);
					}
				}
				break;
			case 2: 
				if(shortS.equals(null)) {
					System.out.println("Long String List is empty");
				} else {
					for (int x=0; x<longL;x++) {
					System.out.println(longS[x]);
					}
				}
				break;
			default: 
				System.out.println("Invalid option, please select 1 or 2");
		}
				
	}

}
