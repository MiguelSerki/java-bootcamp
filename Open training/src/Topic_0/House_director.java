package Topic_0;

public class House_director {

	private House_concrete_builder house_builder = null;

	public House_director(House_concrete_builder house) {
		this.house_builder = house;
	}

	public void Construct_house() {
		house_builder.buildFoundation();
		house_builder.buildRooms();
		house_builder.buildEntryPoints();
		house_builder.buildFloor();
		house_builder.buildWindows();
		house_builder.buildServices();
	}

	public House getHouse() {
		return house_builder.getHouse();
	}

	public static void main(String[] args) {

		House_concrete_builder house_builder = new House_concrete_builder();
		House_director house_director = new House_director(house_builder);
		house_director.Construct_house();
		House house = house_director.getHouse();
		System.out.println(house.my_House());
	}

}
