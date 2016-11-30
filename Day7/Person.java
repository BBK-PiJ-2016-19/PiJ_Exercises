public class Person {
	
	private String name = null;
	private Person nextPerson = null;
	
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getNextPerson() {
		return nextPerson;
	}
	
	public void setNextPerson(nextPerson) {
		this.nextPerson = nextPerson;
	}
	
}