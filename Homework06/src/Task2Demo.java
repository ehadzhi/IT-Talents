
public class Task2Demo {

	public static void main(String[] args) {
		Call.priceForAMinute = 0.2f;
		
		GSM nokia = new GSM();
		nokia.insertSimCard("0884422331");
		nokia.model = "Nokia";
		
		GSM samsung = new GSM();
		samsung.insertSimCard("0889922330");
		samsung.model = "Samsung";
		
		nokia.call(samsung, 40);
		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println(samsung.getSumForCall());
		System.out.println(nokia.getSumForCall());
	}

}
