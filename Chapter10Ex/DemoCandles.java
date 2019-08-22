package Chapter10Ex;

import java.util.Scanner;

public class DemoCandles {

	public static void main(String[] args) {

		Candle aCandle = new Candle(null, 0);
		ScentedCandle aSCandle = new ScentedCandle(null, 0, null);
		
		Scanner input = new Scanner(System.in);
		
		//Candle
		System.out.println("Candle: ");
		System.out.println("What color is the candle: ");
		aCandle.setColor(input.nextLine());
		
		System.out.println("What is the candle height: ");
		aCandle.setHeight(input.nextDouble());
		
		System.out.println();
		
		//Scented Candle
		System.out.println("Scented Candle: ");
		System.out.println("What is the candle color: ");
		aSCandle.setColor(input.nextLine());
		
		System.out.println("What is the candle scent: ");
		aSCandle.setScent(input.nextLine());
		
		
		System.out.println("What is the candle height: ");
		aSCandle.setHeight(input.nextDouble());
		
		System.out.println(aCandle.toString());
		System.out.println();
		System.out.println(aSCandle.toString());
		
		

	}
	
	

}
