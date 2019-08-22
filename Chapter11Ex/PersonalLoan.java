package Chapter11Ex;
import java.util.Scanner;

public class PersonalLoan extends Loan{

	public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term) {
		super(loanNumber, customerLastName, loanAmount, term);
		
		double rate = getInterestRate() + 2;
	}
	
	

}
