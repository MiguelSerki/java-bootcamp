package topic1;

//this class is a facade

public class ShoppingCart {

	private ItemList cartItemList;
	private Counter transactionCounter;
	private MailStation mailStation;
	private Email email;
	
	public ShoppingCart() {
		MailStation mailStation = new MailStation ();
		this.mailStation = mailStation;
		Email email = new Email ("Empty");
		this.email = email;
		ItemList list = new ItemList();
		this.cartItemList = list;
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
				.buildPrice(20, this)//
				.buildId(01)//
				.getItem();

		itemList.add(item);
		this.itemOrOfferAddedEmail();
		this.mailStation.sendEmail(email);

		item = new ItemConcreteBuilder().buildName("Computer")//
				.buildPrice(1500, this)//
				.buildId(02)//
				.getItem();

		itemList.add(item);
		this.itemOrOfferAddedEmail();
		this.mailStation.sendEmail(email);

		item = new ItemConcreteBuilder().buildName("Sofa")//
				.buildPrice(500, this)//
				.buildId(03)//
				.getItem();

		itemList.add(item);
		this.cartItemList.trimToSize();
		this.itemOrOfferAddedEmail();
		this.mailStation.sendEmail(email);
	}

	public void createOffer(OfferComposite offer) {
		
		OfferLeaf leaf1 = new OfferLeaf();
		OfferLeaf leaf2 = new OfferLeaf();

		ItemConcreteBuilder itemBuilder = new ItemConcreteBuilder();
		Item item = itemBuilder.buildName("Coke")//
				.buildPrice(20, this)//
				.buildId(01)//
				.getItem();
		leaf1.getOfferList().add(item);

		item = new ItemConcreteBuilder().buildName("Sofa")//
				.buildPrice(500, this)//
				.buildId(03)//
				.getItem();
		leaf1.getOfferList().add(item);

		item = new ItemConcreteBuilder().buildName("Computer")//
				.buildPrice(1500, this)//
				.buildId(02)//
				.getItem();
		leaf2.getOfferList().add(item);
		
		offer.addOffer(leaf1);
		offer.addOffer(leaf2);
		this.itemOrOfferAddedEmail();
		this.mailStation.sendEmail(email);
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

	// display the shopping cart list
	public void displayShoppingCartList() {
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
				this.purchaseEmail();
				this.mailStation.doNotify();
				userHasPurchasedAndNowWeEmptyHisCart(user);
			} else {
				System.out.println("Please add more money to your account before proceding.");
			}
		}
	}

	public void priceChangeEmail () {
		this.email.setEmail("A price has changed.");
	}
	public void itemOrOfferAddedEmail () {
		this.email.setEmail("A new item or offer is available.");
		}
	public void purchaseEmail () {
		this.email.setEmail("User has purchased something");
	}
	public MailStation getMailStation() {
		return this.mailStation;
	}
	public Email getEmail() {
		return this.email;
	}

}
