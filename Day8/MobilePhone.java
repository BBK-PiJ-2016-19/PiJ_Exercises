public class MobilePhone extends OldPhone {
	
	private String[] calledNumbers; //keeps a list of the last ten numbers
	
	
	public void sayGreeting(String greeting) {
		System.out.println(greeting);
	}
	
	public void ringAlarm(String alarm) {
		System.out.println(alarm);
	}
	
	public void playGame(String game) {
		System.out.println(game);
	}
	
	public void printLastNumbers() {
		// need to be implemented
	}
}
