public class OldPhone implements Phone {

	private String number;

	public OldPhone(String number) {
		this.number = number;
	}

	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}

}