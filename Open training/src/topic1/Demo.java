package topic1;

public class Demo {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart ();

		ItemList list = new ItemList ();
			shoppingCart.setCartItemList(list);
			shoppingCart.setItemList (shoppingCart.getCartItemList());
			}
		/*
		User user = new User (2500);
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), "Coke");
		shoppingCart.userAddsItemToHisCart(user, shoppingCart.getCartItemList(), "Sofa");
		shoppingCart.userConfirmsThePurchase(user, shoppingCart.getCartItemList(), user.getMethodOfPayment());
		*/
	}

