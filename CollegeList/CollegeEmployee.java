package CollegeList;

import java.util.Scanner;

public class CollegeEmployee extends Person{

	private String SSNumber;
	private double annualSalary;
	private String deptName;

	
	public CollegeEmployee(String firstName, String lastName, String address, String zip, String phone, String sSNumber,
			double annualSalary, String deptName) {
		super(firstName, lastName, address, zip, phone);
		this.SSNumber = sSNumber;
		this.annualSalary = annualSalary;
		this.deptName = deptName;
	}
	
	public CollegeEmployee() {
		
	}



	@Override
	public void setPersonData() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String first = input.nextLine(); 
		super.setFirstName(first);
		
		System.out.println("Enter last name: ");
		String last = input.nextLine();
		super.setLastName(last);
		
		System.out.println("Enter Street Address: ");
		String address = input.nextLine();
		super.setAddress(address);
		
		System.out.println("Enter zip code: ");
		String zip = input.nextLine();
		super.setZip(zip);
		
		System.out.println("Enter phone number: ");
		String phone = input.nextLine();
		super.setPhone(phone);
		
		System.out.println("Enter Social Security Number: ");
		String sin = input.nextLine();
		this.setSSNumber(sin);
		
		System.out.println("Enter Annual Salary: ");
		double salary = input.nextDouble();
		this.setAnnualSalary(salary);
		
		System.out.println("Enter Department Name: ");
		deptName = input.nextLine();
		this.setDeptName(deptName);
	}

	
	@Override
	public void display() {
		System.out.print("First Name: " + getFirstName() + ", Last Name: " + getLastName() +
				", Address: " + getAddress() + ", Zip Code: " + getZip() +
				", Phone Number: " + getPhone() + ", Social Security Number: " + getSSNumber() + 
				", Annual Salary: "+ getAnnualSalary() + ", Department Name: " + getDeptName());
	}
	
	public String getSSNumber() {
		return SSNumber;
	}
	public void setSSNumber(String sSNumber) {
		SSNumber = sSNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double salary) {
		this.annualSalary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
	
}
