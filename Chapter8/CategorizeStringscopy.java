package Chapter8;
import java.util.Scanner;
import java.util.ArrayList;

public class CategorizeStringscopy {

	public static void main(String[] args) {
		
		ArrayList<String> longStrings = new ArrayList<String>();
		ArrayList<String> shortStrings = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter String (zzz) to exit");
		line = input.nextLine();
		int count = 0;
		
		while (!line.equalsIgnoreCase("ZZZ") && count < 20) {
			count++;
				if(line.length()<=10) {
					shortStrings.add(line);
				} else {
					longStrings.add(line);
				} 
				System.out.println("Enter String (zzz) to exit");
				line = input.nextLine();
			}
		
		System.out.print("Which type of string would you like to display? "
				+ "\nPress 1 to display Short List or 2 to display Long List: ");
		int choice = input.nextInt();
		switch (choice) {
			case 1: 
				if(shortStrings.size() == 0) {
					System.out.println("Short String List is empty");
				} else {
					System.out.println(shortStrings);
				}
				break;
			case 2: 
				if(longStrings.size() == 0) {
					System.out.println("Long String List is empty");
				} else {
					System.out.println(longStrings);
				}
				break;
			default: 
				System.out.println("Invalid option, please select 1 or 2");
		}
				
	}

}
