package pauloAssignment3;

public class EmployeeDemo {
	
	public static void main(String[] args) throws InvalidEmpNumberException, InvalidShiftException {
		
		System.out.println("Object 1 from Construction Worker class");
		try {

		//Instantiating new object from ConstructionWoker class
		ConstructionWorker cw = new ConstructionWorker("Jennifer", "025-J", "29/06/2018", 1, 45.00);
		
		//Printing object from the toString method
		System.out.println(cw);

		//catch invalid number exception
		} catch(InvalidEmpNumberException ex){
			System.out.println(ex.getMessage());
			
		//catch invalid shift exception
		} catch(InvalidShiftException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Object 2 from Team Leader class");
		try {

			//Instantiating new object from TeamLeader class
			TeamLeader tl = new TeamLeader("Thomas", "610-M", "30/05/2010", 1, 250.20, 5000.00, 200, 160);
			
			//Printing object from the toString method
			System.out.println(tl);
			
			//catch invalid number exception
			} catch(InvalidEmpNumberException ex){
				System.out.println(ex.getMessage());
				
			//catch invalid shift exception
			} catch(InvalidShiftException ex) {
				System.out.println(ex.getMessage());
			}
		
		System.out.println("Object 3 from Construction Worker class ");
		try {
			
			//Instantiating new object
			ConstructionWorker cw1 = new ConstructionWorker("Lara", "245-N", "01/05/2011", 1, 32.50);
			
			//Printing object and showing employee number exception
			System.out.println(cw1);
			
			//catch invalid number exception
			} catch(InvalidEmpNumberException ex){
				System.out.println(ex.getMessage());
				
			//catch invalid shift exception
			} catch(InvalidShiftException ex) {
				System.out.println(ex.getMessage());
			}
		System.out.println();
		System.out.println("Object 4 from Team Leader class ");
		try {

			//Instantiating new object
			TeamLeader tl1 = new TeamLeader("Kenzo", "456-K", "01/06/2012", 3, 32.00, 1000.00, 100, 40);
			
			//Printing object and showing shift exception
			System.out.println(tl1);
			
			//catch invalid number exception
			} catch(InvalidEmpNumberException ex){
				System.out.println(ex.getMessage());
				
			//catch invalid shift exception
			} catch(InvalidShiftException ex) {
				System.out.println(ex.getMessage());
			}
		
	}

}
