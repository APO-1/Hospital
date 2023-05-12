package model;

public class Controller {

	public static final int SIZE = 10; 
	private Patient[] patients;

	public Controller() {

		this.patients = new Patient[SIZE];
		testCases();

	}

	public void testCases() {

		patients[0] = new Patient("John Doe", "Cali", "Cra 4 # 57 - 23");
		patients[1] = new Patient("Sarah Davis", "Palmira", "Calle 6 # 4 - 12");
	}

}
