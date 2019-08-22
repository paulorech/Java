package Chapter11Ex;

public abstract class PhoneCall {
	
	String phoneNumber;
	double price;
	
	public PhoneCall(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		price = 0.0;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void display() {
		System.out.println("Phone number: " + getPhoneNumber() + " , Call Price: $" + getPrice());
	}
	
	
	

}
