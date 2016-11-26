public class HospitalManager {
	
	//fields
	private Patient firstPatient = null; //? Why we don't have to initialize this fild of a complex type?!
										// Pq a ideia n é criar um obhj novo, é usar o mesmo!
	
	
	// member method
	// Ao que parece, ao inserir um novo elemento, a lista é lida desde o início!
	public void addPatient(Patient newPatient) {
		
		if (firstPatient == null) {
			firstPatient = newPatient;
			return;
		}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		
		current.setNextPatient(newPatient);
	}

	public void printEachPatientFromList() {
		
		if (firstPatient == null) {
			System.out.println("There is no patients in this list.");
			return;
		}
		
		Patient current = firstPatient; //? Has the firstPatient var still have the rught "value"?
		do { 
			System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
			current = current.getNextPatient();
		} while (current != null);
	}
	
	public boolean removePatient(String name) {
		if (firstPatient == null) {
			return false;
		}
		
		//System.out.println(firstPatient.getName());
		
		if (firstPatient.getName().equals(name)) {
			firstPatient = firstPatient.getNextPatient();
			return true;
		}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				current.setNextPatient(current.getNextPatient().getNextPatient());
				return true;
			}
			current = current.getNextPatient();
		}
		return false;
	}

}
