package Insurance;

public class Health extends Insurance {

	public Health() {
		super("Health");
		setCost(196);
	}

	@Override
	public void setCost(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	
	@Override
	void display() {
		System.out.println("The type of insurance is : " + insuranceType + " insurance.");
	System.out.println("The cost per month is : " + monthlyPrice);
		
	}
	
}
