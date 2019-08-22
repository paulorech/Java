package Calculator;

import java.util.Random;
import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		double num1 = rand.nextInt(5000)+1;
		double num2 = rand.nextInt(5000)+1;
		double answer = num1 + num2;
		double usersAnswer;
		int count = 0;
		
		while (count<5) {
		System.out.print("What is the sum of " + num1 + " and " + num2 + "? >> ");
	     usersAnswer = input.nextDouble();
	     count++;
	     if(usersAnswer == answer)
	        System.out.println("Correct!");
	     else
	        System.out.println("Sorry - the answer is " + answer);
		}
	 
			
			
	}

	private static double rand(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
