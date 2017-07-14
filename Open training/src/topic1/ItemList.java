package topic1;

import java.util.ArrayList;

public class ItemList {

	private ArrayList<Item> itemList;

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void addToItemList(Item item) {
		itemList.add(item);
	}

	public void returnItem(ItemList itemList) {

	}

	public int sumAllItems(ArrayList<Item> itemList) {
		int totalPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice = totalPrice + itemList.get(i).getPrice();
		}
		return totalPrice;

	}

}
