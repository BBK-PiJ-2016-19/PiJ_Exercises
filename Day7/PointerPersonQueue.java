public class 
PointerPersonQueue implements PersonQueue {
	
	private Person lastInTheQueue = null;
	
	// I've got to know when I need or not to implement a constructor!
	// Need to do at least an example of every type of containers and one example of every type of list!
	
	public void insert(Person person) {
		if (lastInTheQueue = null) {
			lastInTheQueue = person;
			return;
		}
		// see the order of the assignemts
		person.setNextPerson(lastInTheQueue); // Gets the value null, right?!
		lastInTheQueue = person;
	}
	
	public Person retrieve() {
		if (lastInTheQueue = null) {
			system.out.println ("No person in the queue.");
			return null;
		}
		
		if (lastInTheQueue.getNext() == null) {
			Person result;
			result = lastInTheQueue;
			lastInTheQueue = null;
			return result;
		}
		
		Person current = lastInTheQueue;
		while(current.getNext().getNext() != null) {
			 current = current.getNext();
		}
		 
		Person result = current.getNext();
		current.setNext(null);
		return result;
	}
	
}