package Chapter9;
import java.util.Scanner;

public class TimesAndInstructors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String[][] courses = {{"CSIS1275", "Mon 9:00", "Mewish"},
							{"CSIS1175", "Tue 15:30", "Pryia"},
							{"ECON1001", "Tue 8:30", "Dambele"},
							{"BUSN1001", "Fri 19:00", "Russell"},
							{"CSIS2200", "Wed 7:30", "Rupa"}
							}; 
		
		System.out.println("Enter course name: ");
		String choice = input.nextLine();
		boolean found = false;
		for (int x=0; x < courses.length; x++) {
			if (courses[x][0].equals(choice)) {
				System.out.println("Schedule " + courses[x][1]+ " Professor " + courses[x][2]);
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("Invalid entry. Course dos not exist");
		}
	}
}
