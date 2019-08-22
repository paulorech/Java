package Chapter11Ex;

public class DemoPhoneCalls {

	public static void main(String[] args) {

		IncomingPhoneCall iPC = new IncomingPhoneCall("236-865-0909");
		OutgoingPhoneCall oPC = new OutgoingPhoneCall("778-829-0807", 43);
		
		iPC.display();
		oPC.display();

	}

}
