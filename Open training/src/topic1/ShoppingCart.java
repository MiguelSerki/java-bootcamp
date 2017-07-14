package topic1;

//this class is both a facade and a mediator

public class ShoppingCart {

	ItemList itemList;
	ItemList userItemList;
	User user;

	public ShoppingCart() {

	}

	public void registrerUser(User user) {
		this.user = user;
	}

	public void setItemList() {

		ItemBuilder item = new ItemConcreteBuilder().buildName("Coke")//
				.buildPrice(20);

		this.itemList.addToItemList(item.getItem());

		item = new ItemConcreteBuilder().buildName("Computer")//
				.buildPrice(1500);

		this.itemList.addToItemList(item.getItem());

		item = new ItemConcreteBuilder().buildName("Sofa")//
				.buildPrice(500);

		this.itemList.addToItemList(item.getItem());
	}

	public void userAddsItemToHisCart(User user, ItemList itemList, ItemList userItemList, int index) {
		user.addItemToCart(itemList.getItemList().get(index), userItemList);
	}

	public void userSubstractsItemFromHisCart(User user, ItemList itemList, ItemList userItemList) {

	}

	public void userConfirmsThePurchase(User user, ItemList itemList) {
		if (user.getCart() == null) {
			System.out.println("Your chart is empty");

		} else {

		}
	}
}
