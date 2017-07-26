package topic1;

public class PaypalStrategy implements MethodOfPayment {

	private String email;
	private String password;
	private PaypalDiscount paypalDiscount;

	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
		PaypalDiscount paypalDiscount = new PaypalDiscount();
		this.paypalDiscount = paypalDiscount;
	}

	@Override
	public void purchase(double money, User user) {
		if (this.email == null || this.password == null) {
			System.out.println("You must provide an email and a password to procede");
		} else {
			double initialMoney = money;
			double discountedMoney = money - this.paypalDiscount.discount(money, user.getCart());
			initialMoney = this.paypalDiscount.discount(money, user.getCart());
			System.out.println("The discount is : " + initialMoney);
			user.payMoney(discountedMoney);
			System.out.println("User paid " + discountedMoney + " with Paypal.\n");
		}
	}

	public PaypalDiscount getPaypalDiscount() {
		return paypalDiscount;
	}

	public void setPaypalDiscount(PaypalDiscount paypalDiscount) {
		this.paypalDiscount = paypalDiscount;
	}

}
