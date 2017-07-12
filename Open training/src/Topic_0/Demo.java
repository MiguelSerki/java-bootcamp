package Topic_0;

public class Demo {


public static void main(String[] args) {

	House_concrete_builder house_builder = new House_concrete_builder();
	House_director house_director = new House_director(house_builder);
	house_director.Construct_house();
	House house = house_director.getHouse();
	System.out.println("casa 1:\n" + house.my_House());
	
	House_concrete_builder house_builder2 = new House_concrete_builder();
	house_builder2.buildEntryPoints(1).buildFloor(2).buildFoundation(3).buildRooms(4).buildServices(false).buildWindows(5);
	House house2 = house_builder2.getHouse();
	System.out.println("casa 2:\n" + house2.my_House());
}

}
