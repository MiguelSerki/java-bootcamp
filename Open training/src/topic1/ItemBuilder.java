package topic1;

public interface ItemBuilder {

	Item  getItem();
	
	ItemBuilder buildPrice(int price);
	
	ItemBuilder buildName(String name);
}
