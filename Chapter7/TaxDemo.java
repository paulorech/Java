package Chapter7;

import java.util.Scanner;

public class TaxDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String sin="";
		String zip="";
		double income;
		String marital="";
		
		
		
		do{
			System.out.print("Enter Social Security Number: ");
			sin = input.nextLine();
		} while (!validSinNumber(sin));
		
		System.out.print("Enter Last Name: " );
		String lastName = input.nextLine();
		System.out.print("Enter First Name: " );
		String firstName = input.nextLine();
		System.out.print("Enter Address: " );
		String address = input.nextLine();
		System.out.print("Enter City: ");
		String city = input.nextLine();
		System.out.print("Enter State: " );
		String state = input.nextLine();
		do{
			System.out.print("Enter Zip Code: " );
			zip = input.nextLine();
		} while (!validZip(zip));
			
		do{
			System.out.print("Enter Marital Status: " );
			marital = input.nextLine();
		} while (!validMaritalStatus(marital));
		
		
		do{
			System.out.print("Enter Annual Income: " );
			income = input.nextDouble();
		} while (!validAnnualIncome(income));
		

		TaxReturn tr = new TaxReturn(sin, lastName, firstName, address, city, state, zip, income, marital);
		System.out.println(tr.toString());
	
	}

	
	public static boolean validSinNumber(String sinNumber){
		boolean inputData = false;
		if (sinNumber.matches("\\d{3}-\\d{2}-\\d{4}")) {
			inputData = true;
		}
		return inputData;
	}
	
	public static boolean validZip(String zip){
		boolean inputData = false;
		if (zip.matches("\\d{5}")) {
			inputData = true;
		}
		return inputData;
	}
	
	public static boolean validMaritalStatus(String m){
		boolean valid = false;	
			if (m.equals("S") || m.equals("s") || m.equals("M") || m.equals("m"))
				valid = true;
			return valid;
	}

	
	public static boolean validAnnualIncome(double income) {
		boolean valid = false;	
		if (income > 0)
			valid = true;
		return valid;
		
	}
	
	
}
