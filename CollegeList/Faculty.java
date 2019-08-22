package CollegeList;

import java.util.Scanner;

public class Faculty extends CollegeEmployee{

	private static final boolean True = false;
	private boolean isTenured;

	public Faculty(String firstName, String lastName, String address, String zip, String phone, String sSNumber,
			double annualSalary, String deptName, boolean isTenured) {
		super(firstName, lastName, address, zip, phone, sSNumber, annualSalary, deptName);
		this.isTenured = isTenured;
	}
	
	public Faculty() {
	}

	@Override
	public void setPersonData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String first = input.nextLine(); 
		this.setFirstName(first);
		
		System.out.println("Enter last name: ");
		String last = input.nextLine();
		this.setLastName(last);
		
		System.out.println("Enter Street Address: ");
		String address = input.nextLine();
		this.setAddress(address);
		
		System.out.println("Enter zip code: ");
		String zip = input.nextLine();
		this.setZip(zip);
		
		System.out.println("Enter phone number: ");
		String phone = input.nextLine();
		this.setPhone(phone);
		
		System.out.println("Is tenured (True or False)");
		boolean tenured = input.nextBoolean();
		if ((tenured != True) || (!tenured))
			System.out.println("Please enter: True or False");
		this.setTenured(tenured);
	}
	
	@Override
	public void display() {
		System.out.print("First Name: " + super.getFirstName() + ", Last Name: " + super.getLastName() +
				", Address: " + super.getAddress() + ", Zip Code: " + super.getZip() +
				", Phone Number: " + super.getPhone() + ", Social Security Number: " + getSSNumber() + 
				", Annual Salary: "+ getAnnualSalary() + ", Department Name: " + getDeptName() +
				", Is Tenured: " + isTenured());
	}

	public boolean isTenured() {
		return isTenured;
	}

	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}

	
}
