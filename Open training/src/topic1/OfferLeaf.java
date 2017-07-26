package topic1;

public class OfferLeaf implements Offers {

	private ItemList offerList;

	public OfferLeaf() {
		ItemList list = new ItemList();
		this.offerList = list;
	}

	@Override
	public void showOffer() {
		for (Item item : offerList)
			System.out.println("	*" + item.getName() + "....$" + item.getPrice());
	}

	public ItemList getOfferList() {
		return offerList;
	}

	public void setOfferList(ItemList offerList) {
		this.offerList = offerList;
	}

}
