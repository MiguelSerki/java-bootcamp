package topic1;

public class CashStrategy implements MethodOfPayment {

	@Override
	public void purchase(double money, User user) {
		user.payMoney(money);
		System.out.println("User paid " + money + " in cash.\n");
	}

}
