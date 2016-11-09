class Calculator{
	
	/* private int number1;
	private int number2;
	
	public Calculator(int num1, int num2) {
		number1 = num1;
		number2 = num2;
	} */
	
	public void add(int num1, int num2) {
		int addition;
		addition = num1 + num2;
		System.out.println("The result of the addition is: " + Integer.toString(addition));
	}
	
	public void subtract(int num1, int num2) {
		int subtraction;
		subtraction = num1 - num2;
		System.out.println("The result of the subtraction is: " + Integer.toString(subtraction));
	}
	
	public void multiply(int num1, int num2) {
		int multiplication;
		multiplication = num1 * num2;
		System.out.println("The result of the multiplication is: " + Integer.toString(multiplication));
	}
	
	public void divide(int num1, int num2) {
		double division;
		division = num1 / num2;
		System.out.println("The result of the division is: " + division);
	}
	
	//Need to do the modulus(int, int) method!
}