package topic1;

public class ItemConcreteBuilder implements ItemBuilder{

	private Item item;
	@Override
	public Item getItem() {

		return item;
	}

	@Override
	public ItemBuilder buildPrice(int price) {
		
		item.setPrice(price);
		return this;
	}

	@Override
	public ItemBuilder buildName(String name) {

		item.setName(name);
		return this;
	}

}
