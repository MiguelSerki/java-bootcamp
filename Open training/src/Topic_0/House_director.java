package Topic_0;

public class House_director {

	private House_concrete_builder house_builder = null;

	public House_director(House_concrete_builder house) {
		this.house_builder = house;
	}

	public void Construct_house() {
		house_builder.buildFoundation(30);
		house_builder.buildRooms(2);
		house_builder.buildEntryPoints(2);
		house_builder.buildFloor(1);
		house_builder.buildWindows(5);
		house_builder.buildServices(true);
	}

	public House getHouse() {
		return house_builder.getHouse();

	}
}