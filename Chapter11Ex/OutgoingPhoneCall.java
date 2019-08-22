package Chapter11Ex;

public class OutgoingPhoneCall extends PhoneCall{
	
	int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public OutgoingPhoneCall(String phoneNumber, int minutes) {
		super(phoneNumber);
		this.minutes = minutes;
		setPrice(0.04);
	}
	
	@Override
	public void display() {
		System.out.println("Phone number: " + getPhoneNumber() + " , Rate: $" + getPrice() +
				" , Number of Minutes: " + getMinutes() + " , Call Price: $" + getPrice() * getMinutes());
	}

}
