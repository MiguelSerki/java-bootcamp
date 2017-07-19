package topic1;

public class PaypalDiscount implements Discount {

	@Override
	public double discount(double money, ItemList itemList) {
		double smallestPrice = 99999;
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getPrice() < smallestPrice) {
				smallestPrice = itemList.get(i).getPrice();
			}
		}
		return smallestPrice;
	}

}
