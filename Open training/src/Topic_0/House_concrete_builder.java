package Topic_0;

public class House_concrete_builder implements House_builder {

	private House house;

	public House_concrete_builder() {
		house = new House();
	}

	@Override
	public House_builder buildFoundation(int area) {
		house.setSquare_foundation_area(area);
		return this;
	}

	@Override
	public House_builder buildRooms(int rooms) {
		house.setRooms(rooms);
		return this;
	}

	@Override
	public House_builder buildEntryPoints(int entryPoints) {
		house.setEntry_points(entryPoints);
		return this;
	}

	@Override
	public House_builder buildWindows(int windows) {
		house.setWindows(windows);
		return this;
	}

	@Override
	public House_builder buildFloor(int floor) {
		house.setFloor(floor);
		return this;
	}

	@Override
	public House_builder buildServices(Boolean services) {
		house.setServices(services);
		return this;
	}

	@Override
	public House getHouse() {
		return house;
	}

}