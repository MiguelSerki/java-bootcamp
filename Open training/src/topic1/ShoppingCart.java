package topic1;

//this class is a facade

public class ShoppingCart {

	private ItemList cartItemList;
	private Counter transactionCounter;

	public ShoppingCart() {
		ItemList list = new ItemList();
		setItemList(list);
		this.cartItemList = list;
		cartItemList.trimToSize();
		transactionCounter = Counter.getInstance();
	}

	public ItemList getCartItemList() {
		return this.cartItemList;
	}

	public void setCartItemList(ItemList cartItemList) {
		this.cartItemList = cartItemList;
	}

	// takes an item list and adds the specified items to it.
	public void setItemList(ItemList itemList) {

		ItemConcreteBuilder itemBuilder = new ItemConcreteBuilder();

		Item item = itemBuilder.buildName("Coke")//
				.buildPrice(20)//
				.buildId(01)//
				.getItem();

		itemList.add(item);
		// itemList.addToItemList(item);

		item = new ItemConcreteBuilder().buildName("Computer")//
				.buildPrice(1500)//
				.buildId(02)//
				.getItem();

		itemList.add(item);

		item = new ItemConcreteBuilder().buildName("Sofa")//
				.buildPrice(500)//
				.buildId(03)//
				.getItem();

		itemList.add(item);
	}

	// takes an user, and it adds to his personal cart an item from itemList
	// with the specific ID.
	public void userAddsItemToHisCart(User user, ItemList itemList, int id) {
		user.addItemToCart(itemList.returnItem(itemList, id));
	}

	// takes an user, and it takes out from his personal cart an item from
	// itemList with the specific ID.
	public void userSubstractsItemFromHisCart(User user, ItemList itemList, int id) {
		user.subtractItemFromCart(user.getCart().returnItem(itemList, id));
	}

	// after a purchase, we empty the cart of the user.
	public void userHasPurchasedAndNowWeEmptyHisCart(User user) {
		user.getCart().clear();
	}

	// returns the total cost of an item list.
	public double totalCostOfCart(ItemList itemList) {
		return itemList.sumAllItems(itemList);
	}

	// three strategies of payment.
	public void userPaysWithCash(User user) {
		CashStrategy method = new CashStrategy();
		user.setMethodOfPayment(method);
	}

	public void userPaysWithCreditCard(User user, String name, int accountNumber) {
		CreditCardStrategy method = new CreditCardStrategy(name, accountNumber);
		user.setMethodOfPayment(method);
	}

	public void userPaysWithPaypal(User user, String email, String password) {
		PaypalStrategy method = new PaypalStrategy(email, password);
		user.setMethodOfPayment(method);
	}
	
	//display the shopping cart list
	public void displayShoppingCartList () {
		this.cartItemList.displayList(cartItemList);
	}

	// the user confirms he wants to purchase. We check if the cart is empty
	// If it's not, we then check if the user has enough money in his account
	// if the user does, we must provide a valid method of payment
	// then we empty his cart.
 	public void userConfirmsThePurchase(User user, ItemList itemList) {
		if (user.getCart().isEmpty()) {
			System.out.println("Your chart is empty");

		} else {
			if (user.confirmPurchase(user.getCart(), user.getMoney())) {
				user.getMethodOfPayment().purchase(user.getCart().sumAllItems(user.getCart()), user);
				System.out.println("Your purchase ID is " + this.transactionCounter.getTransaction());
				userHasPurchasedAndNowWeEmptyHisCart(user);
			} else {
				System.out.println("Please add more money to your account before proceding.");
			}
		}
	}
}
