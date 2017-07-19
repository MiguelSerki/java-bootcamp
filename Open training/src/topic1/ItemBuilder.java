package topic1;

public interface ItemBuilder {

	Item  getItem();
	
	ItemBuilder buildPrice(double price);
	
	ItemBuilder buildName(String name);
	
	ItemBuilder buildId (int id);
}
