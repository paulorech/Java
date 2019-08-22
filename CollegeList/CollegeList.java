package CollegeList;
import java.util.Scanner;
public class CollegeList {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int empCount = 0, stuCount = 0, facCount = 0;
		
		CollegeEmployee[] empArray = new CollegeEmployee[4];
		Faculty[] facArray = new Faculty[3];
		Student[] stuArray = new Student[7];
		
		
		System.out.println("Which type of person's data you want to enter? "
				+ "\n(C) for College Employee, \n(F) for Faculty, \n(S) for Student or \n(Q) to quit: ");
		String choice = input.nextLine();
		
		while(choice != "Q" || choice !="q") {
		
			switch (choice) {
			case "c":
			case "C":
				if (empCount > 4) {
					System.out.println("Cannot enter more than 4 entries");
					break;
				} else {
				System.out.println("Enter College Employee Data: ");
				CollegeEmployee employee = new CollegeEmployee();
					employee.setPersonData();
					empArray[empCount] = employee; 
					empCount++;
					break;
				}
			case "f":
			case "F": 
				if (facCount >3) {
					System.out.println("Cannot enter more than 3 entries");
					break;
				} else {
					System.out.println("Enter Faculty Data: ");
					Faculty faculty = new Faculty();
						faculty.setPersonData();
						facArray[facCount] = faculty;
						facCount++;
						break;
				}
			case "s":
			case "S":
				if (stuCount >7) {
					System.out.println("Cannot enter more than 7 entries");
					break;
				} else {
					System.out.println("Enter Student Data: ");
					Student student = new Student();
						student.setPersonData();
						stuArray[stuCount] = student;
						stuCount++;
						break;
				}
			case "q":
			case "Q":
				System.out.println("Quit");
					break;
			}
		}
		
		if (stuCount == 0) {
			System.out.println("No data entered");
		} else {
			System.out.println("Students");
			for (int x=0; x<facCount; x++) {
				stuArray[x].display();
			}
		}
		if (facCount == 0) {
			System.out.println("No data entered");
		} else {
			System.out.println("Faculty members");
			for (int x=0; x<facCount; x++) {
				facArray[x].display();
			}
		}
		
		if (empCount == 0) {
			System.out.println("No data entered");
		} else {
			System.out.println("College Employees");
			for (int x=0; x<empCount; x++)
				empArray[x].display();
		}
	}
}
