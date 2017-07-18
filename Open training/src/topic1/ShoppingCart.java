package topic1;

//this class is a facade

public class ShoppingCart {

	private ItemList cartItemList;

	public ItemList getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(ItemList cartItemList) {
		this.cartItemList = cartItemList;
	}

	public void setItemList(ItemList itemList) {

		Item item = new ItemConcreteBuilder().buildName("Coke")//
				.buildPrice(20)//
				.getItem();

		itemList.addToItemList(item);

		item = new ItemConcreteBuilder().buildName("Computer")//
				.buildPrice(1500)//
				.getItem();

		itemList.addToItemList(item.getItem());

		item = new ItemConcreteBuilder().buildName("Sofa")//
				.buildPrice(500)//
				.getItem();

		itemList.addToItemList(item.getItem());

		this.setCartItemList(itemList);
	}

	public void userAddsItemToHisCart(User user, ItemList itemList, String name) {
		user.addItemToCart(user.getCart().returnItem(itemList, name));
	}

	public void userSubstractsItemFromHisCart(User user, ItemList itemList, String name) {
		user.subtractItemFromCart(user.getCart().returnItem(itemList, name));
	}

	public void userHasPurchasedAndNowWeEmptyHisCart(User user) {
		int i = 0;
		while (user.getCart().isEmpty() == false) {
			user.subtractItemFromCart(user.getCart().get(i));
			i++;
		}
	}

	public void userConfirmsThePurchase(User user, ItemList itemList, MethodOfPayment methodOfPayment) {
		if (user.getCart() == null) {
			System.out.println("Your chart is empty");

		} else {
			if (user.confirmPurchase(itemList, user.getMoney())) {
				user.setMethodOfPayment(methodOfPayment);
				user.getMethodOfPayment().purchase(user.getMoney(), user);
				userHasPurchasedAndNowWeEmptyHisCart(user);
			} else {
				System.out.println("You don't have enough money in your account for this transaction.");
			}
		}
	}

}