package Chapter11Ex;

import java.util.Scanner;

public class BusinessLoan extends Loan{

	public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term) {
		super(loanNumber, customerLastName, loanAmount, term);
		
		double rate = getInterestRate() + 1;
		
	}
	
	@Override
	public String toString() {
		String data = "Loan Number: " + getLoanNumber() + "\n" +
		"Customer Last Name: " + getCustomerLastName() + "\n" +
		"Loan Amount: " + getLoanAmount() + "\n" +
		"Interest Rate:  " + getInterestRate() + "\n" +
		"Term: " + getTerm() + "\n" +
		"Total Amount Owed: " + ((getLoanAmount() * (getInterestRate()/100)) * getTerm())+ getLoanAmount();
		return data;
	}
}
