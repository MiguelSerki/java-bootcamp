package Topic_0;

public class House_concrete_builder implements House_builder {

	private House house;

	public House_concrete_builder() {
		house = new House();
	}

	@Override
	public void buildFoundation() {
		house.setSquare_foundation_area(250);
	}

	@Override
	public void buildRooms() {
		house.setRooms(4);
	}

	@Override
	public void buildEntryPoints() {
		house.setEntry_points(2);
	}

	@Override
	public void buildWindows() {
		house.setWindows(10);
	}

	@Override
	public void buildFloor() {
		house.setFloor(2);
	}

	@Override
	public void buildServices() {
		house.setServices(true);
	}

	@Override
	public House getHouse() {
		return house;
	}

}