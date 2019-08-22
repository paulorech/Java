import java.util.Scanner;
public class EmpDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] empArray  = new Employee[10];
		Scanner input = new Scanner(System.in);
		//After asking for each id number and salary, it adds to the EmpArray as a new object of Employee
		for (int i=0; i<empArray.length;i++) {
		System.out.println("Enter ID Number for employee " + (i+1)+ ":");
		int empId = input.nextInt();
		System.out.println("Enter Annual Salary for employee " + (i+1)+ ":");
		double salary = input.nextDouble();
	
		empArray[i] = new Employee(empId, salary);
		
		}
		
		//Asking user to sort by ID or Salary
		System.out.println("How would you like to sort this list? ");
		System.out.println("Select (1) to sort by ID or (2) to sort by Salary: ");
	       int option = input.nextInt();
	       if(option == 1) {
	           sortById(empArray);
	       } else if (option == 2){
	           sortBySalary(empArray);
	       } else {
	           System.out.println("Invalid option. Please choose 1 or 2");
	       }
		
	
		
	}
		//sort by Id
	   public static void sortById(Employee[] array) {
		   int comparison = array.length-1;
		   //bubble sort
		   for (int a = 0; a < array.length-1; a++) {
			   for (int b = 0; b < comparison; b++) {
				   if (array[b].getEmpNum() > array[b+1].getEmpNum()) {
					   	Employee temp = array[b];
						array[b] = array[b+1];
						array[b+1] = temp;
				   }
			   }
			   comparison--;
		   }
		   System.out.println("Employees sorted by ID: ");
		   for( int i=0 ; i < array.length ; i++ ) {
				System.out.println("ID #" + array[i].getEmpNum() + "	$" +
						array[i].getSalary() + " ");
			}
		   
			System.out.println();

	   }
	   
	   //sort by Salary
	   public static void sortBySalary(Employee[] array) {
			int comparison = array.length-1;
			for(int a = 0 ; a < array.length-1 ; a++) {
				for(int b = 0 ; b < comparison ; b++) {
					if(array[b].getSalary() > array[b+1].getSalary()) {
						Employee temp = array[b];
						array[b] = array[b+1];
						array[b+1] = temp;
					}
				}
				comparison--;
			}
			System.out.println("Employees sorted by Salary: ");
			for( int i=0 ; i< array.length ; i++ ) {
				System.out.println("ID #" + array[i].getEmpNum() + "	$" +
						array[i].getSalary() + " ");
			}
			System.out.println();
		}
	
}
