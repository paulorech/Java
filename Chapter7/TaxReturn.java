package Chapter7;


public class TaxReturn {
	
	String sinNumber, lastName, firstName, address, city, state, zip,  maritalStatus;
	double annualIncome, taxLiability;
	
	
	public TaxReturn(String sinNumber, String lastName, String firstName, String address, String city, String state,
			String zip, double annualIncome, String maritalStatus) {
		super();
		this.sinNumber = sinNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.annualIncome = annualIncome;
		this.maritalStatus = maritalStatus;
		if(maritalStatus.toUpperCase().equals("M")) {
			if (annualIncome <= 20000) {
				taxLiability = 14;
			} else if (annualIncome > 20000 && annualIncome <=50000){
				taxLiability = 20;
			} else {
				taxLiability = 28;
			}
			} else if (maritalStatus.toUpperCase().equals("S")){
				if (annualIncome <= 20000) {
					taxLiability = 15;
				} else if (annualIncome > 20000 && annualIncome <=50000){
					taxLiability = 22;
				} else {
					taxLiability = 30;
				}
			}
	}
	
	

	public String getSinNumber() {
		return sinNumber;
	}
	public void setSinNumber(String sinNumber) {
		this.sinNumber = sinNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public double getTaxLiability() {
		return taxLiability;
	}
	public void setTaxLiability(double taxLiability) {
		this.taxLiability = taxLiability;
	}
	
	public String toString() {
		String data;
		data = "Social Security Number: " + getSinNumber() + "\n" +
				"Last Name: " + getLastName() + "\n" +
				"First Name: " + getFirstName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"City: " + getCity() + "\n" +
				"State: " + getState() + "\n" +
				"Zip Code: " + getZip() + "\n" +
				"Annual Income: " + getAnnualIncome() + "\n" +
				"Marital Status: " + getMaritalStatus() + "\n" +
				"Tax Liability: " + getTaxLiability() + "\n";
		return data;
	}
	
}

