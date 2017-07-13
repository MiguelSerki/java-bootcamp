package Topic_0;

public interface House_builder {

	House getHouse();

	House_builder buildFoundation(int area);

	House_builder buildRooms(int rooms);

	House_builder buildEntryPoints(int entryPoints);

	House_builder buildWindows(int windows);

	House_builder buildFloor(int floor);

	House_builder buildServices(Boolean services);
}
