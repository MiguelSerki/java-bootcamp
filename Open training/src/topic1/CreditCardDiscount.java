package topic1;

public class CreditCardDiscount implements Discount {

	@Override
	public double discount(double money, ItemList itemList) {
		return (money * 10) / 100;
	}

}
