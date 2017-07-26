package topic1;

public class CashStrategy implements MethodOfPayment {

	private CashDiscount discount;

	public CashStrategy() {
		CashDiscount cashDiscount = new CashDiscount();
		this.discount = cashDiscount;
	}

	@Override
	public void purchase(double money, User user) {
		double initialMoney = money;
		double discountedMoney = money - this.discount.discount(money, user.getCart());
		initialMoney = this.discount.discount(money, user.getCart());
		System.out.println("The discount is : "+ discountedMoney);
		user.payMoney(initialMoney);
		System.out.println("User paid " + initialMoney + " in cash.\n");
	}

	public CashDiscount getDiscount() {
		return discount;
	}

	public void setDiscount(CashDiscount discount) {
		this.discount = discount;
	}

}
