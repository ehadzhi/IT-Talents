
public class GSM {
	String model = "";
	boolean hasSimCard;
	String simMobileNumber = "No SIM";
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.length() == 10 && simMobileNumber.matches("(08)[0-9]{8}")) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
	}

	void removeSimCard() {
		simMobileNumber = "No SIM";
		hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (duration > 0 && !this.simMobileNumber.equals(receiver.simMobileNumber) && this.hasSimCard
				&& receiver.hasSimCard) {
			this.lastOutgoingCall = receiver.lastIncomingCall = new Call();
			this.lastOutgoingCall.caller = this;
			this.lastOutgoingCall.receiver = receiver;
			this.lastOutgoingCall.duration = duration;
			this.outgoingCallsDuration += duration;

		}
	}

	float getSumForCall() {
		return (float) this.outgoingCallsDuration * Call.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("You called " + this.lastOutgoingCall.receiver.simMobileNumber + " for "
					+ this.lastOutgoingCall.duration + " minutes.");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println(this.lastOutgoingCall.caller.simMobileNumber + " called you for "
					+ this.lastOutgoingCall.duration + " minutes.");
		}
	}

}
