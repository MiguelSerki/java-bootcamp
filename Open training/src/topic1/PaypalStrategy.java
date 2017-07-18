package topic1;

public class PaypalStrategy implements MethodOfPayment {

	private String email;
	private String password;

	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void purchase(double money, User user) {
		if (this.email == null || this.password == null) {
			System.out.println("You must provide an email and a password to procede");
		} else {
			user.payMoney(money);
			System.out.println("You payed " + money + " with Paypal.");
		}
	}

}
