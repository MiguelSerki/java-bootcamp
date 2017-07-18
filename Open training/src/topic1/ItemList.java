package topic1;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ItemList extends ArrayList<Item> {

	private ArrayList<Item> itemList;

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void addToItemList(Item item) {
		itemList.add(item);
	}

	public void subtractItemFromList(Item item) {
		itemList.remove(item);
	}

	public Item returnItem(ItemList itemList, String name) {
		int i = 0;
		while (itemList.get(i).getName() != name) {
			i++;
		}
		return itemList.get(i);
	}

	public double sumAllItems(ArrayList<Item> itemList) {
		double totalPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice = totalPrice + itemList.get(i).getPrice();
		}
		return totalPrice;

	}

}
