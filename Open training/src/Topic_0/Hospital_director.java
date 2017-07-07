package Topic_0;

public class Hospital_director {

	private Hospital_builder hospital_builder = null;

	public Hospital_director(Hospital_builder hospital_builder) {
		this.hospital_builder = hospital_builder;
	}

	public void constructHospital() {
		hospital_builder.buildAssistans();
		hospital_builder.buildDoctors();
		hospital_builder.buildFloors();
		hospital_builder.buildIntensive_cares();
		hospital_builder.buildMorgue();
		hospital_builder.buildNurses();
		hospital_builder.buildOperation_theater();
		hospital_builder.buildType();
	}

	public Hospital getHospital() {
		return hospital_builder.getHospital();
	}

	public static void main(String[] args) {

		highHospital hospital_builder = new highHospital();
		Hospital_director hospital_director = new Hospital_director(hospital_builder);
		hospital_director.constructHospital();
		Hospital hospital = hospital_director.getHospital();
		System.out.println(hospital.my_hospital());
	}

}
