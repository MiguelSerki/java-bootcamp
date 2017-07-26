package topic1;

public class CashDiscount implements Discount {

	@Override
	public double discount(double money, ItemList itemList) {
		double biggerPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getPrice() > biggerPrice) {
				biggerPrice = itemList.get(i).getPrice();
			}
		}

		biggerPrice = (biggerPrice * 90) / 100;
		money = money - biggerPrice;
		return money;
	}

}
