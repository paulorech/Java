package Insurance;

public abstract class Insurance {
	
	protected String insuranceType;
	protected double monthlyPrice;
	
	public Insurance(String insuranceType) {
		super();
		this.insuranceType = insuranceType;
	}
	public String getInsuranceType() {
		return insuranceType;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}

	
	abstract void setCost(double monthlyPrice);
	abstract void display();
		
	
	

}
