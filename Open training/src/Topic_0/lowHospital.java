package Topic_0;

public class lowHospital implements Hospital_builder {

	private Hospital hospital;

	public lowHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildFloors() {
		hospital.setFloors(1);
	}

	@Override
	public void buildDoctors() {
		hospital.setDoctors(6);
	}

	@Override
	public void buildNurses() {
		hospital.setNurses(8);
	}

	@Override
	public void buildAssistans() {
		hospital.setAssistants(5);
	}

	@Override
	public void buildOperation_theater() {
		hospital.setOperation_theater(false);
	}

	@Override
	public void buildMorgue() {
		hospital.setMorgue(false);
	}

	@Override
	public void buildIntensive_cares() {
		hospital.setIntensive_cares(false);
	}

	@Override
	public void buildType() {
		hospital.setType("Public");

	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}