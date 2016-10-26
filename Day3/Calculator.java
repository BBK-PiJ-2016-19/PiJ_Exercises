class Calculator {
	
	
	private String operator;
	private double firstNumber;
	private double secondNumber;
	
	public Calculator(){
		this.operator = "";
		this.firstNumber = 0.0;
		this.secondNumber = 0.0;
	}
	
	/* public Calculator(String operator, int firstNumber, int secondNumber){
		this.operator = operator;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	} */
	
	
	public void setOperator(String operator){
		this.operator = operator;
	}
	
	public String getOperator(){
		return this.operator;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public double getFirstNumber() {
		return this.firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getSecondNumber() {
		return this.secondNumber;
	}
	
	
	//public double operate(this.getOperator(), this.getFirstNumber(), this.getSecondNumber()){
	//Despite being a good practice getting the data from fields via methods, it is very expensive in terms of memory!
	//So I don't really need the parameters in the operate method definition.
		
	public double operate(){
		
		//String operator = this.getOperator;
		//double firstNumber = this.getFirstNumber;
		//double secondNumber = this.getSecondNumber;
		
		double result = 0.0;
		
		if (operator.equals("+")){
			result = firstNumber + secondNumber;
		} else if (operator.equals("-")){
			result = firstNumber - secondNumber;
		} else if (operator.equals("*")){
			result = firstNumber * secondNumber;
		} else {
			result = firstNumber / secondNumber;
		}
		
		return result;
	}

}