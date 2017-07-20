package topic1;

public interface ItemBuilder {

	Item getItem();

	ItemBuilder buildName(String name);

	ItemBuilder buildId(int id);

	ItemBuilder buildPrice(double price, ShoppingCart shoppingCart);
}
