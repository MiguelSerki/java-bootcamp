package topic1;

public class CreditCardStrategy implements MethodOfPayment {

	private String name;
	private int creditNumber = 0;

	public CreditCardStrategy(String name, int creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
	}

	@Override
	public void purchase(double money, User user) {
		if (this.name == null || this.creditNumber == 0) {
			System.out.println("You must provide a name and a credit card number to procede");
		} else {
			user.payMoney(money);
			System.out.println("User paid " + money + " with credit card.");
		}
	}

}
