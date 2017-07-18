package topic1;

public class User {

	private double money = 0;
	private ItemList cart;
	private MethodOfPayment methodOfPayment;

	public User(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void addMoney(double money) {
		this.money = this.money + money;
	}

	public void payMoney(double money) {
		this.money = this.money - money;
	}

	public ItemList getCart() {
		return cart;
	}

	public void setCart(ItemList cart) {
		this.cart = cart;
	}

	public void addItemToCart(Item item) {
		cart.addToItemList(item);
	}

	public void subtractItemFromCart(Item item) {
		this.cart.subtractItemFromList(item);
	}

	public MethodOfPayment getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(MethodOfPayment methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public Boolean confirmPurchase(ItemList cart, double money) {
		if (cart.sumAllItems(cart) > money) {
			System.out.println("You don't have enough money to complete the operation");
			return false;
		} else {
			return true;
		}
	}

}
