package Chapter12;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.*;
import javax.swing.JOptionPane;

public class ExceptionDemo2 {

	public static void main(String[] args) {
	
		int numerator = 0, denominator = 0, result = 0;
		String inputString;
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter numerator");
			numerator = input.nextInt();
			
			System.out.println("Enter denominator");
			denominator = input.nextInt();
			
			result = numerator / denominator;
			
		} catch(ArithmeticException exception) {
			
			System.out.println(exception.getMessage());
			result = 0;
			
		} catch(InputMismatchException exception) {
			
			System.out.println("This application accepts digits only!");
			
		}
		
		System.out.println(numerator + "/" + denominator + " = " + result );

	}

}
