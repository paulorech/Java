package CollegeList;
import java.util.Scanner;

public class Person {
	
	private String firstName, lastName, address, zip, phone;
	
	public Person(String firstName, String lastName, String address, String zip, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zip = zip;
		this.phone = phone;
	}

	
	public Person() {
	
	}


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
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void display() {
		System.out.print("First Name: " + getFirstName() + ", Last Name: " + getLastName() +
				", Address: " + getAddress() + ", Zip Code: " + getZip() +
				", Phone Number: " + getPhone());
	}

}
