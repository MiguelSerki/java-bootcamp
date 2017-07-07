package Topic_0;

//2) Design a building like a house and provide a builder to build it.

public class House {

	private int square_foundation_area;// the area of the foundation, we'll
										// assume only square areas
	private int rooms; // how many rooms will the house have?
	private int entry_points; // how many ways to get in?
	private int windows; // amount of windows
	private int floor; // how many floors
	private Boolean services; // does it have light, water and gas services?

	// square_foundation_area getter and setter
	public int getSquare_foundation_area() {
		return square_foundation_area;
	}

	public void setSquare_foundation_area(int square_foundation_area) {
		this.square_foundation_area = square_foundation_area;
	}

	// rooms getter and setter
	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	// entry_point getter and setter
	public int getEntry_points() {
		return entry_points;
	}

	public void setEntry_points(int entry_points) {
		this.entry_points = entry_points;
	}

	// windows getter and setter
	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	// floor getter and setter
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	// services getter and setter
	public Boolean getServices() {
		return this.services;

	}

	public void setServices(Boolean services) {
		this.services = services;
	}

	// Does the house have light, water and gas services?
	public String haveServices(Boolean services) {
		if (services == true) {
			return "Yes";
		} else {
			return "No";
		}

	}

	// How is our house?
	public String my_House() {

		return "Area: " + square_foundation_area + "\nFloor: " + floor + "\nRooms: " + rooms + "\nEntry points: " + entry_points
				+ "\nWindows: " + windows + "\nServices: " + haveServices(this.services);

	}

}
