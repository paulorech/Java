package pauloAssignment3;

public class Employee {
	
	String name;
	String eNumber;
	String hDate;
	
	//constructor with the required fields and throws the exception for invalid employee number.
	public Employee(String name, String eNumber, String hDate) throws InvalidEmpNumberException {
		super();
		setName(name);
		setENumber(eNumber);
		setHDate(hDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getENumber() {
		return eNumber;
	}

	// this set method test if the employee number entered is valid, otherwise throws an exception
	public void setENumber(String eNumber) throws InvalidEmpNumberException {
		if (isValidEmpNum(eNumber)) {
			this.eNumber = eNumber;
		} else {
			throw new InvalidEmpNumberException("Employee Number does not exist.");
		}
	}

	public String getHDate() {
		return hDate;
	}

	public void setHDate(String hDate) {
		this.hDate = hDate;
	}

	//this method test if the employee number entered, meet all the requirements for the number 000-a
	private boolean isValidEmpNum(String e) {
		boolean status = true;
		if (e.length()!=5) {
			status = false;
		} else {
			if ((!Character.isDigit(e.charAt(0))) || 
				(!Character.isDigit(e.charAt(1))) || 
				(!Character.isDigit(e.charAt(2))) ||
				((e.charAt(3) != '-')) 			  || 
				(!Character.isLetter(e.charAt(4)))||
				(!(e.charAt(4) >= 'A' && e.charAt(4) <= 'M'))) {
				status = false;
			}
		}
		return status;
	}
	
}
