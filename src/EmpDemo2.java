import java.util.Scanner;
public class EmpDemo2 {

	public static void main(String[] args) {
		
		Employeee[] empArray = new Employeee[25];
		
		int count = 0;
		
		Scanner input = new Scanner(System.in);

		while(true) 
		{
			System.out.println("What would you like to do: ");
			System.out.println("- Add a record to the database - press 1");
			System.out.println("- Delete a record from the database - press 2");
			System.out.println("- Change a record on the database - press 3");
			int choice = input.nextInt();
			
			switch (choice) 
			{
			case 1:
				count = addRecord(empArray, count);
				break;
			case 2:
				count = deleteRecord(empArray, count);
				break;
			case 3:
				changeRecord(empArray, count);
				break;
			default: 
				System.out.println("Please select a valid option");
			}	
		}
	}
	
	public static int addRecord(Employeee[] arrray, int count) 
	{
		Scanner input = new Scanner(System.in);
		int id;
		double salary; 
		boolean idExists;
		
		if (count >= arrray.length) 
			System.out.println("Cannot enter record. Database is full");
		else 
		{
			System.out.println("Enter employee ID: ");
			id = input.nextInt();
			idExists = false;
			for (int x = 0; x < count ;x++) 
				if (arrray[x].getId() == id) 
				{
					System.out.println("ID number already exists. Please choose another ID number");
	                idExists = true;
	            }
				if (idExists==false) 
				{
				System.out.println("Enter annual salary: ");
				salary = input.nextDouble();
				arrray[count] = new Employeee(id, salary);
				count++;
				}
		}
		sortById(arrray, count);
		input.nextLine();
		return count;
	}
	
	public static int deleteRecord(Employeee[] array, int count) {
		int position = 0;
		int id;
		Scanner input = new Scanner(System.in);
		if (count == 0)
			System.out.println("Database is empty. Cannot delete record!");
		else 
		{
			System.out.println("Please enter an ID number to delete: ");
			id = input.nextInt();
			boolean exists = false;
			for (int i = 0; i < count;i++) 
				if (array[i].getId()== id ) 
				{
					exists = true;
		            position = i;
				}
			if(!exists) 
			{	//if the id does not exist in the database
				System.out.println("ID number does not exist in the database");
			}
			else 
				for (int i = position; i < count-1 ;i++) 
					array[i] = array[i + 1];
				if (exists) 
				count--;	
			input.nextLine();
			sortById(array, count);
		}
		return count;
	}
	
	public static void changeRecord(Employeee[] array, int count) 
	{
		Scanner input = new Scanner(System.in);
		boolean exists = false;
		int position=0;
		int id;
		double salary;
		if (count==0) 
			System.out.println("Cannot delete record, database is empty");
		else 
		{
			System.out.println("Enter an ID number to change: ");
			id = input.nextInt();
			exists = false;
			for (int i=0;i<count;i++) 
				if (array[i].getId()==id) 
				{
					exists = true;
					position = i;
				}
			if (!exists) 
				System.out.println("ID number does not exist in the database ");
			else
			{
				System.out.println("Enter salary to change: ");
				salary = input.nextDouble();
				array[position].setSalary(salary);
			}
			input.nextLine();
			sortById(array, count);
		}
	}
	
	//sort by Id
	   public static void sortById(Employeee[] array, int count) 
	   {
		   int comparison = count-1;
		   int a, b;
		   //bubble sort
		   for (a = 0; a < comparison; a++) 
			   for ( b = 0; b < comparison; b++) 
			   {
				   if (array[b].getId() > array[b+1].getId()) 
				   {
					   	Employeee temp = array[b];
						array[b] = array[b+1];
						array[b+1] = temp;
				   }
			   }
		   comparison--;
		   System.out.println("Current Database: ");
		   for(a=0 ; a < count ; a++) 
			   System.out.println("ID #" + array[a].getId() + "	$" + array[a].getSalary() + " ");
			System.out.println();
	   }
}
