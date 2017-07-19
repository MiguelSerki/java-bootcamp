package topic1;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ItemList extends ArrayList<Item> {

	private ArrayList<Item> itemList;

	public ItemList() {
		itemList = new ArrayList<Item>();
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void subtractItemFromList(Item item) {
		itemList.remove(item);
	}

	public Item returnItem(ItemList itemList, int id) {
		int i = 0;
		for (int a = 0; a < itemList.size(); a++) {
			if (itemList.get(a).getId() == id) {
				return itemList.get(i);
			} else {
				i++;
			}
		}
		return itemList.get(i);
	}

	public double sumAllItems(ItemList itemList) {
		double totalPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice = totalPrice + itemList.get(i).getPrice();
		}
		return totalPrice;

	}

}
