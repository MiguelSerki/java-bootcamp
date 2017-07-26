package topic1;

public class CreditCardStrategy implements MethodOfPayment {

	private String name;
	private int creditNumber = 0;
	private CreditCardDiscount creditCardDiscount;

	public CreditCardStrategy(String name, int creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
		CreditCardDiscount creditCardDiscount = new CreditCardDiscount();
		this.creditCardDiscount = creditCardDiscount;
	}

	@Override
	public void purchase(double money, User user) {
		if (this.name == null || this.creditNumber == 0) {
			System.out.println("You must provide a name and a credit card number to procede");
		} else {
			double initialMoney = money;
			double discountedMoney = money - this.creditCardDiscount.discount(money, user.getCart());
			initialMoney = this.creditCardDiscount.discount(money, user.getCart());
			System.out.println("The discount is : " + initialMoney);
			user.payMoney(discountedMoney);
			System.out.println("User paid " + discountedMoney + " with credit card.\n");
		}
	}

	public CreditCardDiscount getCreditCardDiscount() {
		return creditCardDiscount;
	}

	public void setCreditCardDiscount(CreditCardDiscount creditCardDiscount) {
		this.creditCardDiscount = creditCardDiscount;
	}

}
