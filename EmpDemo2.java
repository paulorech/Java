import java.util.Scanner;
public class EmpDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] empArray = new Employee[25];
		Scanner input = new Scanner(System.in);
		//variable to select an option
		int option = 0;
		
		//variable to count 
		int count = 0;
		
		// Menu options to select
		while (true) {
			System.out.println("Menu\nSelect one of the options:");
			System.out.println("Add Record - press 1");
			System.out.println("Delete Record - press 2");
			System.out.println("Change Record - press 3");
			option = input.nextInt();
			switch (option) {
			case 1:
				count = addOption(empArray, count);
				break;
			case 2:
				count = deleteOption(empArray, count);
				break;
			case 3:
				changeOption(empArray, count);
				break;
			default: 
				System.out.println("Invalid option. Please choose 1, 2 or 3");
			}  	
		}	
	}
	//method to add an entry to the database
	 public static int addOption(Employee[] array, int count)
	 {
	      Scanner input = new Scanner(System.in);
	      int id;
	      double salary;
	      boolean idAlreadyEntered;
	      //if the employee count is equal to the length of the database array
	      if(count >= array.length)
	         System.out.println("The database is full, cannot add record");
	      else //otherwise enter a new employee
	      {
	          System.out.print("Enter employee ID: ");
	          id = input.nextInt();
	          idAlreadyEntered = false;
	          for(int x = 0; x < count; x++)
	        	  //if in the employee database has the id that has been entered
	             if(array[x].getEmpNum() == id)
	             {
	                System.out.println("ID number already exists. Please choose another ID number");
	                idAlreadyEntered = true;
	             }
	          //if the id has not been entered than enter salary for the id entered
	          if(!idAlreadyEntered)
	          {
	             System.out.print("Enter salary: ");
	             salary = input.nextDouble();
	             array[count] = new Employee(id, salary);
	             count++;
	          }
	      }
	      display(array, count);
	      input.nextLine();
	      return count;
	   }
	 
	 
	 
	//method to delete an entry
	 public static int deleteOption(Employee[] array, int count)
	   {
	      Scanner input = new Scanner(System.in);
	      int id;
	      int position = 0;
	      //if the database is empty show error
	      if(count == 0)
	         System.out.println("Cannot delete record, database is empty");
	      else
	      {
	    	 // otherwise enter id to delete
	         System.out.print("Enter ID to delete: ");
	         id = input.nextInt();
	         boolean exists = false;
	         // for goes through the array 
	         for(int x = 0; x < count; x++)
	            if(array[x].getEmpNum() == id)
	            {
	               exists = true;
	               position = x;
	            }
	         if(!exists)
	         {//if the id does not exist in the database
	            System.out.println("ID number does not exist in the database");
	         }
	         else // if exists, search for the id
	            for(int x = position; x < count - 1; x++)
	               array[x] = array[x + 1];    
	         if(exists)
	            count--; //entry deleted
	         input.nextLine();
	         display(array, count);
	      }
	      return count;
	   }
	 
	 //method to change an entry
	 public static void changeOption(Employee[] array, int count)
	 {
	      Scanner input = new Scanner(System.in);
	      int position = 0;
	      int id;
	      double salary;
	      if(count == 0) //if database is equal to zero
	         System.out.println("Database is empty, cannot change record");
	      else //otherwise change the entry
	      { 
	         System.out.print("Enter ID to change: ");
	         id = input.nextInt();
	         boolean exists = false; //check the id entered through the loop
	         for(int x = 0; x < count; x++)
	            if(array[x].getEmpNum() == id)
	            {
	               exists = true;
	               //position receives the location of the entry to be changed
	               position = x;
	            }
	         if(!exists)
	            System.out.println("ID number does not exist in the database");
	         else
	         {
	            System.out.print("Enter salary: ");
	            salary = input.nextDouble();
	            //change the salary to the position found in the for loop above by calling the set method in the employee class
	            array[position].setSalary(salary);
	         }
	         input.nextLine();
	         display(array, count);
	      }
	   }
	 
	 
	 //method to display the array
	 public static void display(Employee[] array, int count)
	 {
	       int a,b;
	       Employee temp;
	       int comparison = count - 1;
	       //bubble sort
	       for(a = 0; a < comparison; a++)
	          for(b = 0; b < comparison; b++)
	          {
	             if(array[b].getEmpNum() > array[b + 1].getEmpNum())
	             {
	                  temp = array[b];
	                  array[b] = array[b + 1];
	                  array[b + 1] = temp;
	             }
	          }
	       comparison--;
	       System.out.println("\nCurrent database:");
	       for(a = 0; a < count; a++)
	    	   System.out.println("ID #" + array[a].getEmpNum() + "   $" + array[a].getSalary());
	       System.out.println();
	    }
	}
