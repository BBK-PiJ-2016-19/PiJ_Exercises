public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		// code creating and using SmartPhone here...
		SmartPhone smtPhone = new SmartPhone();
		
		smtPhone.call("075234567");
		
		smtPhone.browseWeb("http://www.bbc.co.uk/");
		String position = smtPhone.findPosition();
		System.out.println(position);
		
		smtPhone.sayGreeting("Good morning");
		
	}
}