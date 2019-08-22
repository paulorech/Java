package Chapter11Ex;
import java.util.Scanner;

public class CreateLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loanArray[] = new Loan[5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the current prime interest rate: ");
		Loan.setInterestRate(input.nextDouble());
		
		for (int i =0; i< loanArray.length; i++) {
			System.out.println("What type of loan would you like: 1 for Business or 2 for Personal");
			int choice = input.nextInt();
			
			switch (choice) {
			case 1:  {
				System.out.println("Loan Number: ");
				int loanNumber = input.nextInt();
				System.out.println("Customer Last Name: ");
				String lastName = input.nextLine();	
				System.out.println("Loan Amount: ");
				double loanAmount = input.nextDouble();	
				System.out.println("Term : ");		
				int term = input.nextInt();	
	
				BusinessLoan bl = new BusinessLoan(loanNumber, lastName, loanAmount, term);
				System.out.println(bl.toString());
				loanArray[i] = bl;
				break;
			}
			case 2: {
				System.out.println("Loan Number: ");
				int loanNumber = input.nextInt();
				System.out.println("Customer Last Name: ");
				String lastName = input.nextLine();	
				System.out.println("Loan Amount: ");
				double loanAmount = input.nextDouble();	
				System.out.println("Term: ");		
				int term = input.nextInt();	
				
				PersonalLoan pl = new PersonalLoan(loanNumber, lastName, loanAmount, term);
				System.out.println(pl.toString());
				loanArray[i] = pl;
				break;
				
			}
			default:
				System.out.println("Invalid entry, please choose 1 or 2");
			
			}	
		}
	}
}
