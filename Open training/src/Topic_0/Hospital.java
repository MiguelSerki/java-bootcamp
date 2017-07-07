package Topic_0;

//3) Design a hospital and provide classes to build it (builder, factories, etc).

// We'll assume "hospital" refers to the level of "luxury" it has,
//(how many doctors and nurses does it have? what type of rooms are available?)
//and not the construction of the building itself.

public class Hospital {

	private int floors; // how many floors does the hospital have?
	private int doctors; // how many doctors?
	private int nurses; // how many nurses?
	private int assistants; // how many helpers (janitors, secretary, etc) does
							// it have?
	private Boolean operation_theater; // does it have an operation theater?
	private Boolean intensive_cares; // does it have intensive cares unit?
	private Boolean morgue; // does it have a morgue?
	private String type; // Is it a private or public hospital?

	// getters and setters for all the classes
	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getDoctors() {
		return doctors;
	}

	public void setDoctors(int doctors) {
		this.doctors = doctors;
	}

	public int getNurses() {
		return nurses;
	}

	public void setNurses(int nurses) {
		this.nurses = nurses;
	}

	public int getAssistants() {
		return assistants;
	}

	public void setAssistants(int assistants) {
		this.assistants = assistants;
	}

	public Boolean getOperation_theater() {
		return operation_theater;
	}

	public void setOperation_theater(Boolean operation_theater) {
		this.operation_theater = operation_theater;
	}

	public Boolean getIntensive_cares() {
		return intensive_cares;
	}

	public void setIntensive_cares(Boolean intensive_cares) {
		this.intensive_cares = intensive_cares;
	}

	public Boolean getMorgue() {
		return morgue;
	}

	public void setMorgue(Boolean morgue) {
		this.morgue = morgue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// checks condition for special rooms and returns yes or no
	public String haveOperation_theater(Boolean operation_theater) {
		if (operation_theater == true) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public String haveMorgue(Boolean morgue) {
		if (morgue == true) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public String haveIntensive_cares(Boolean Intensive_cares) {
		if (operation_theater == true) {
			return "Yes";
		} else {
			return "No";
		}
	}

	// How is our hospital?
	public String my_hospital() {
		return "Floors: " + this.getFloors() + "\nDoctors: " + this.getDoctors() + "\n Nurses: " + this.getNurses() + "\nAssistans: "
				+ this.getAssistants() + "\nWhat kind of Hospital it is? : " + this.getType() + "\nDoes it have an operation theater? : "
				+ this.haveOperation_theater(getOperation_theater()) + "\nDoes it have a Morgue? : " + this.haveMorgue(getMorgue())
				+ "\nDoes it have an intensive cares unit? : " + this.haveIntensive_cares(getIntensive_cares());
	}
}
