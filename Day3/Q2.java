public class Q2 {

	public static void main(String[] args) {
		//Here be the code to launch the program
		
		//First version: without a for loop for this representation '+ 2 3'
		System.out.println("");
		System.out.println ("Calculator");
		System.out.println("");
		
		Calculator calculator = new Calculator();
		
		//System.out.println("Insert the operator: ");
		//String str = ...
		//calculator.setOperator(str);
		calculator.setOperator("+");
		
		//System.out.println("Insert the first number: ");
		String str1 = "6";
		calculator.setFirstNumber(Double.parseDouble(str1));
		
		//System.out.println("Insert the second number: ");
		String str2 = "3";
		//calculator.setSecondNumber() = Double.parseDouble(str2); Duh!
		calculator.setSecondNumber(Double.parseDouble(str2));
		
		//System.out.println("");
		System.out.println("The result is: " + calculator.operate());
	}

}