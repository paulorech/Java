package Chapter7;
import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myName = "Paulo";
		String anotherName = new String("Gustavo");
		String lastName;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your last name? ");
		lastName = input.nextLine();
		
		System.out.println(myName.indexOf('u'));
		System.out.println(myName.charAt(2));
		System.out.println(myName.length());
		
		System.out.println("My name is: " +myName + " " + anotherName + " " + lastName);
		
		if (myName.equals(anotherName)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		if (myName.equals(lastName)) {
			System.out.println("Your first name and your last name are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		
		if (myName.compareTo(lastName)<0) {
			System.out.println("Your first name is less than your last name");
		} else {
			System.out.println("Your first name is more than your last name");
		}
		
		
		
		
	}

}
