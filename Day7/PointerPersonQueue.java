public class PointerPersonQueue implements PersonQueue {
	
	private Person lastInTheQueue = null;
	
	// I've got to know when I need or not to implement a constructor!
	// Need to do at least an example of every type of containers and one example of every type of list!
	
	public void insert(Person person) {
		if (lastInTheQueue = null) {
			lastInTheQueue = person;
			return;
		}
		person.setNextPerson(lastInTheQueue); // Gets the value null, right?!
		lastInTheQueue = person;
	}
	
	public Person retrieve() {
		
	}
	
}