package Chapter11Ex;

public class PhoneCallArray {

	public static void main(String[] args) {

		PhoneCall phoneCallArray[] = {new IncomingPhoneCall("236-866-0900"),  
				new OutgoingPhoneCall("778-907-1034", 21),
				new IncomingPhoneCall("236-866-0900"), 
				new OutgoingPhoneCall("778-451-1045", 15),
				new IncomingPhoneCall("236-864-0909"),
				new OutgoingPhoneCall("778-450-1067", 7),
				new IncomingPhoneCall("236-864-0909"), 
				new OutgoingPhoneCall("778-345-9010", 34),
		};
		
		for(int x =0; x< phoneCallArray.length; x++) {
			phoneCallArray[x].display();
		}
		

	}

}
