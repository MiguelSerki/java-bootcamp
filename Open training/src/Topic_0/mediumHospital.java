package Topic_0;

public class mediumHospital implements Hospital_builder {

	private Hospital hospital;

	public mediumHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildFloors() {
		hospital.setFloors(2);
	}

	@Override
	public void buildDoctors() {
		hospital.setDoctors(10);
	}

	@Override
	public void buildNurses() {
		hospital.setNurses(12);
	}

	@Override
	public void buildAssistans() {
		hospital.setAssistants(8);
	}

	@Override
	public void buildOperation_theater() {
		hospital.setOperation_theater(true);
	}

	@Override
	public void buildMorgue() {
		hospital.setMorgue(false);
	}

	@Override
	public void buildIntensive_cares() {
		hospital.setIntensive_cares(true);
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
