//08/11/16

//Q3 - Binary and decimal

//1st method: power(int, int) // Fazer à mão!
int power(int base, int exponent) { 
	int result;
	result = base ** exponent;
	return result;
}

//2nd method: power2(int)
int power2(int exponent) {
	int result;
	result = power(2, exponent);
	return result;
}

//3rd method: binaryToDecimal(String)
int binaryToDecimal(String number) {

	int result = 0;
	
	for (i = 0; i < number.length(); i++) {
		result += Integer.parseInt(number[i]) * power2(number.length()-(i+1));
	}
	
	return result;
}

//4th method: decimalToBinary(int) 
String decimalToBinary(int number) {
	// To implement
}	




//Testing the binaryToDecimal()
int result;
String binaryNumber1 = "10000001"
result = binaryToDecimal(binaryNumber1)
println ""
println "Binary number: " + binaryNumber1
println "The correspondent decimal: " + result