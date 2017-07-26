package topic1;

public class ItemConcreteBuilder implements ItemBuilder {

	private Item item;

	public ItemConcreteBuilder() {
		item = new Item();
	}

	@Override
	public Item getItem() {

		return item;
	}

	@Override
	public ItemBuilder buildPrice(double price, ShoppingCart shoppingCart) {
		item.setPrice(price);
		shoppingCart.priceChangeEmail();
		shoppingCart.getMailStation().sendEmail(shoppingCart.getEmail());
		return this;
	}

	@Override
	public ItemBuilder buildName(String name) {

		item.setName(name);
		return this;
	}

	@Override
	public ItemBuilder buildId(int id) {
		item.setId(id);
		return this;
	}

}
