package pauloAssignment3;

public class ConstructionWorker extends Employee {
	
	int shift;
	double hourlyPayRate;
	
	//constructor with the required field,  inheriting shift and hourly pay rate from employee class
	//and  throwing the exception for shift.
	public ConstructionWorker(String name, String eNumber, String hDate, int s, double hpr) throws InvalidEmpNumberException, InvalidShiftException {
		super(name, eNumber, hDate);
		setShift(s);
		setHourlyPayRate(hpr);
	}

	public int getShift() {
		return shift; 
	}
	
	// this set method test if the shift entered is valid, otherwise throws an exception
	public void setShift(int s) throws InvalidShiftException {
		if (s==1 || s==2) {
			this.shift = s;
		} else {
			throw new InvalidShiftException("Shift does not exist. Please enter 1 or 2.");
		}
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hpr) {
		hourlyPayRate = hpr;
	}
	
	// method to show the items.
	public String toString() {
		return  "Construction Worker: " + "\n" + 
				"Employee Name: " + super.getName() + "\n" + 
				"Employee Number: " + super.getENumber() + "\n" + 
				"Hiring Date: " + super.getHDate()+ "\n" + 
				"Shift: " + getShift() + "\n" + 
				"Hourly Pay Rate: " + getHourlyPayRate() + "\n";
	}


}
