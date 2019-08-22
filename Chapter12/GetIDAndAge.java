package Chapter12;
import java.util.*;
import java.util.Scanner;

public class GetIDAndAge {

	public static void main(String[] args) throws DataEntryException, InputMismatchException {
		
			Scanner input = new Scanner(System.in);
			int id = 1, age = 1;
			while (id != 0 && age != 0) 
			{
			System.out.println("Enter ID number: ");
			id = input.nextInt();
			System.out.println("Enter an age: ");
			age = input.nextInt();
			
			if (id < 0 || id > 999) 
			{
				try 
				{
					throw new DataEntryException();
				}
				catch (DataEntryException ex)
				{
					System.out.println(ex.getMessage());	
				}
			}
			if (age < 0 || age > 119)
			{
				try
				{
					throw new DataEntryException();
				}
				catch (DataEntryException ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		}
	}
}
