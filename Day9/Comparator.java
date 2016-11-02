// Q1
/* 
class Comparator {
	
	public int getMax(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	
	public double getMax(double d1, double d2) {
		if ( d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		
		if (n1 > n2) {
			return number1;
		} else {
			return number2;
		}
	}
	
} */


// New, better version :)
/*
public class Comparator {
	
	public double getMax( double Double.parseDouble(num1), double Double.parseDouble(num2) {
		// Can't do this! Only in the call, not in the method's definition
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
}
*/

public class Comparator {
	
	public double getMax(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
}

