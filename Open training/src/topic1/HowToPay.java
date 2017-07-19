package topic1;

public class HowToPay {

	MethodOfPayment method;
	
	public HowToPay (MethodOfPayment method) {
		this.method = method;
	}
	
	public void setMethod (MethodOfPayment method) {
		this.method = method;
	}
	
	public MethodOfPayment getMethod () {
		return this.method;
	}
}
