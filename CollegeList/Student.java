package CollegeList;

import java.util.Scanner;

public class Student extends Person {

	String major;
	double gpa;
	
	public Student(String firstName, String lastName, String address, String zip, String phone, String major,
			double gpa) {
		super(firstName, lastName, address, zip, phone);
		this.major = major; 
		this.gpa = gpa;
	}

	public Student() {
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
		
		System.out.println("Enter major: ");
		String major = input.nextLine();
		this.setMajor(major);
		
		System.out.println("Enter GPA: ");
		double gpa = input.nextDouble();
		this.setGpa(gpa);
		
	}
	

	@Override
	public void display() {
		System.out.print("First Name: " + getFirstName() + ", Last Name: " + getLastName() +
				", Address: " + getAddress() + ", Zip Code: " + getZip() +
				", Phone Number: " + getPhone() + ", Major: " + getMajor() + 
				", GPA: " + getGpa());
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
}
