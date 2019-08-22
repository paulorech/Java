package Chapter12;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		int numerator = 0, denominator = 0, result;
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
			
		}
		System.out.println(numerator + "/" + denominator + " = " + result );

	}

}
