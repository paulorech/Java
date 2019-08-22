import java.util.Scanner;
public class Alphabetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String message1, message2, message3;
		
		System.out.println("Enter the first string: ");
		message1 = input.nextLine();
		
		System.out.println("Enter the second string: ");
		message2 = input.nextLine();
		
		System.out.println("Enter the third string: ");
		message3 = input.nextLine();
		
		System.out.println("Alphabetical order: ");
		if (message1.compareToIgnoreCase(message2)<0) {
			if (message2.compareToIgnoreCase(message3)<0)
				System.out.println(message1 + "\n" + message2 + "\n" + message3);
			else
				System.out.println(message1 + "\n" +  message3 + "\n" +  message2);
		} else if (message2.compareToIgnoreCase(message1)<0) {
			if (message1.compareToIgnoreCase(message3)<0)
				System.out.println(message2 + "\n" +  message1 + "\n" +  message3);
			else
				System.out.println(message2 + "\n" +  message3 + "\n" +  message1);
		} else if (message3.compareToIgnoreCase(message1)<0) {
			if (message1.compareToIgnoreCase(message2)<0)
				System.out.println(message3 + "\n" +  message1 + "\n" +  message2);
			else 
				System.out.println(message3 + "\n" +  message2 + "\n" +  message1);
		}

	}

}
