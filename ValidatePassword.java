import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
	
		String password;
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter new password: ");
		password = input.nextLine();
		
		validate(password);
		
	}
	
	public static void validate(String password) {
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		boolean validPassword = true;
		
		for (Character ch: password.toCharArray()) {

			if(ch.isUpperCase(ch)) 
				upperCount++;

			if(ch.isLowerCase(ch)) 
				lowerCount++;

			if(ch.isDigit(ch)) 
				digitCount++;
			
		}
		
		if(upperCount < 2) {
			validPassword = false;
			System.out.println("The password must contain at least two upper case letters");
		}
			
		if(lowerCount < 3) {
			validPassword = false;
			System.out.println("The password must contain at least three lower case letters");
		}

		if(digitCount < 1) {
			validPassword = false;
			System.out.println("The password must contain at least one digit");
		}
		
		if(validPassword) {
			System.out.println("The password is valid");
		}else {
			System.out.println("The password is invalid");
		}
		
	}
	
}
