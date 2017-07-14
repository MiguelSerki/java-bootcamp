package topic1;

public class User {

	private int money;
	private ShoppingCart cart;

	public User(ShoppingCart cart, int money) {
		this.cart = cart;
		this.money = money;
		cart.registrerUser(this);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	public void addItemToCart (Item item, ItemList userList) {
		userList.addToItemList(item);
	}

}
