public class Patient {
	
	//fields
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	//constructor
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient (to come!)
	}
	
	//other methods - getters and setters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public Patient getNextPatient() {
		return nextPatient;
	}
	
	public void setNextPatient(Patient nextPatient) {
		this.nextPatient = nextPatient;
	}
	
}