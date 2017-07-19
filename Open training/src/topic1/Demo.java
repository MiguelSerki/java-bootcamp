package topic1;

public class Demo {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		User user = new User(2500);
		shoppingCart.displayShoppingCartList();
		System.out.println(user.getMoney());
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), 01);
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), 02);
		shoppingCart.userSubstractsItemFromHisCart(user, shoppingCart.getCartItemList(), 02);
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), 03);
		System.out.println("your cart cost: " + user.getCart().sumAllItems(user.getCart()));
		// shoppingCart.userPaysWithCash(user);
		// shoppingCart.userPaysWithCreditCard(user, "Juan", 777);
		shoppingCart.userPaysWithPaypal(user, "aloha@gmail.com", "password");
		shoppingCart.userConfirmsThePurchase(user, shoppingCart.getCartItemList());
		System.out.println(user.getMoney());
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), 01);
		System.out.println("your cart cost: " + user.getCart().sumAllItems(user.getCart()));
		shoppingCart.userPaysWithPaypal(user, "aloha@gmail.com", "password");
		shoppingCart.userConfirmsThePurchase(user, shoppingCart.getCartItemList());
		System.out.println(user.getMoney());
		OfferComposite offer = new OfferComposite("Super Offer!", 1000);
		OfferComposite offer2 = new OfferComposite("Mini Offer", 500);
		shoppingCart.createOffer(offer);
		shoppingCart.createOffer(offer2);
		offer.showOffer();
		offer2.showOffer();
	}
}