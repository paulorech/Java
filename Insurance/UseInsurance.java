package Insurance;
import java.util.Scanner;

public class UseInsurance{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What type of insurance do you want to be displayed: ");
		System.out.println("Press 1 for Health or 2 for Life");
		int choice = input.nextInt();
		
		if (choice == 1 ) {
			Health h = new Health();
			h.display();
		}
		if (choice == 2 ) {
			Life l = new Life();
			l.display();
		}
		
		
	}

}
