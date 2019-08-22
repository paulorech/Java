package Chapter11Ex;

public class IncomingPhoneCall extends PhoneCall{

	public IncomingPhoneCall(String phoneNumber) {
		super(phoneNumber);
		setPrice(0.02);
	}
	
	@Override
	public void display() {
		System.out.println("Phone number: " + getPhoneNumber() + " , Rate: $" + getPrice() + " , Call Price: $" + getPrice());
	}

}
