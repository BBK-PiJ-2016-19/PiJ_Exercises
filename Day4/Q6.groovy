class Integer2 {
	
	int value;

	int getValue() {
		return this.value;
	}
	
	void setValue(int value) {
		this.value = value;
	}
	
	boolean isEven() {
		if (this.value % 2 == 0) {
		 return true;
		} 
	}
	
	boolean isOdd() {
		if (this.value % 2 != 0) {
			return false;
		}
	}
	
	void prettyPrint() {
		println this.value;
	}
	
	String toString() {
		// To implement
	}
}

