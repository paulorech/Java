package Lab13ClassWork;
import java.util.Scanner;
public class BirthdayReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] birthDates = new String[10][2];
		String name = "";
		String birthday = "";
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a name:");
		name = input.nextLine();
		birthDates[0][0] = name; 
		System.out.println("Enter birthdate:");
		birthday = input.nextLine();
		birthDates[0][1] = birthday;
		count++;
		
		while (!name.equalsIgnoreCase("ZZZ")) {
			
			System.out.println("Enter a name:");
			name = input.nextLine();
			if (name.equals("ZZZ"))
				break;
			birthDates[count][0] = name; 
		
			System.out.println("Enter birthdate:");
			birthday = input.nextLine();
			birthDates[count][1] = birthday;
			count++;
		}
		
		for (int i = 0; i < count-1; i++) 
		{
				System.out.println(birthDates[i][0]);
				
		}
		
		while (name.equalsIgnoreCase("ZZZ")) 
		{
			System.out.print("Enter a name to search for the birthday:");
			name = input.nextLine();
			for (int i = 0; i< count; i++) 
			{
				if(birthDates[i][0].equals(name)) 
				{
					System.out.println(birthDates[i][1]);
				}
			}
		}
		
		
	}

}
