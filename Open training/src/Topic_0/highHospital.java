package Topic_0;

public class highHospital implements Hospital_builder {

	private Hospital hospital;

	public highHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildFloors() {
		hospital.setFloors(6);
	}

	@Override
	public void buildDoctors() {
		hospital.setDoctors(30);
	}

	@Override
	public void buildNurses() {
		hospital.setNurses(60);
	}

	@Override
	public void buildAssistans() {
		hospital.setAssistants(30);
	}

	@Override
	public void buildOperation_theater() {
		hospital.setOperation_theater(true);
	}

	@Override
	public void buildMorgue() {
		hospital.setMorgue(true);
	}

	@Override
	public void buildIntensive_cares() {
		hospital.setIntensive_cares(true);
	}

	@Override
	public void buildType() {
		hospital.setType("Private");

	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}