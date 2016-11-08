//08/11/16

//Q3 - Binary and decimal

//1st method: power(int, int)
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