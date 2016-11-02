//import java.io.Console; //we haven't covered this bit yet!
//So i was advised to put the values directly in

public class Q1 {
	
	public static void main(String [] args) {
		
		Comparator comp = new Comparator();
		
		System.out.println("");
		System.out.println("This program determines the max between two numbers.");
		int int1 = 1;
		int int2 = 2;
		double dbl1 = 2.0;
		double dbl2 = 7.0;
		//Console console = System.console();
		//System.out.println("Enter the first number: ");
		String str1 = "5";
		//System.out.println("Enter the second number: ");
		String str2 = "3";
		
		double resultInt = comp.getMax(Double.parseDouble(int1), Double.parseDouble(int2));
		double resultDbl = comp.getMax(Double.parseDouble(dbl1), Double.parseDouble(dbl2));
		double resultStr = comp.getMax(Double.parseDouble(str1), Double.parseDouble(str2));
	}
	
}