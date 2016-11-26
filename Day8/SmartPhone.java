public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String url) {
		System.out.println(url);
	}
	
	public String findPosition() {
		String position = "41°24'12.2";
		return position;
	}
	
}