package Chapter11Ex;

public abstract class Loan implements LoanConstants {

	private int loanNumber;
	private String customerLastName;
	private double loanAmount;
	private static double interestRate;
	private int term;
	
	
	public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
		super();
		this.loanNumber = loanNumber;
		this.customerLastName = customerLastName;
		this.term = term;
		this.loanAmount = loanAmount;
	}
	
	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount > MAXIMUM_LOAN_AMOUNT ) {
			System.out.println("Loan amount not allowed");
		} else {
			this.loanAmount = loanAmount;
		}
	}

	public double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double r) {
		interestRate = r;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		if (term != SHORT_TERM) {
			term = SHORT_TERM;
		} else if (term != MEDIUM_TERM)  {
			term = SHORT_TERM;
		} else if (term != LONG_TERM) {
			term = SHORT_TERM;
		} else {
		this.term = term;
		}
	}

	public String toString() {
		String data = "Loan Number: " + getLoanNumber() + "\n" +
		"Customer Last Name: " + getCustomerLastName() + "\n" +
		"Loan Amount: " + getLoanAmount() + "\n" +
		"Interest Rate:  " + getInterestRate() + " % APR\n" +
		"Term: " + getTerm() + "years \n";
		return data;
	}
	
}


