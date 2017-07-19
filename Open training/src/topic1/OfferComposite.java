package topic1;

import java.util.ArrayList;
import java.util.List;

public class OfferComposite implements Offers {

	private List<OfferLeaf> offerList;
	private double price;
	private String name;

	public OfferComposite(String name, double price) {
		this.name = name;
		this.price = price;
		List<OfferLeaf> list = new ArrayList<OfferLeaf>();
		this.offerList = list;

	}

	@Override
	public void showOffer() {
		System.out.println("°" + this.getName() + "....$" + this.getPrice());
		for (OfferLeaf offer : offerList) {
			offer.showOffer();
		}
	}

	public List<OfferLeaf> getOfferList() {
		return offerList;
	}

	public void setOfferList(List<OfferLeaf> offerList) {
		this.offerList = offerList;
	}

	public void addOffer(OfferLeaf leaf) {
		offerList.add(leaf);
	}

	public void removeOffer(OfferLeaf leaf) {
		offerList.remove(leaf);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
