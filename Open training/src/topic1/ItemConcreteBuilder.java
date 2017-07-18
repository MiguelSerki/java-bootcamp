package topic1;

public class ItemConcreteBuilder implements ItemBuilder{

	private Item item;
	ItemConcreteBuilder (){
		Item item = new Item();
		this.item = item;
	}
	@Override
	public Item getItem() {

		return item;
	}

	@Override
	public ItemBuilder buildPrice(double price) {
		
		item.setPrice(price);
		return this;
	}

	@Override
	public ItemBuilder buildName(String name) {

		item.setName(name);
		return this;
	}

}
