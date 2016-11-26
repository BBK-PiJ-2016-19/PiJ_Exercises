//one way of creating arrays
int[] array1 = new int[4]; //symmetrical
array1[0] = 1;
array1[1] = 2;
array1[2] = 2;
array1[3] = 1;

int[] array2 = new int[4]; //nonSymmetrical
array2[0] = 1;
array2[1] = 2;
array2[2] = 3;
array2[3] = 4;

/*
//another way of creating arrays in Java. It doesn't work in Groovy!
int[] array1 = {1, 2, 2, 1}; //symmetrical
*/


//auxiliary methods
int[] checkAndReverse(int[] theArray) {
	
	ArrayChecker myChecker = new ArrayChecker();
	
	if (!myCheker.isSymmetrical(theArray)) {
		int[] reversedArray = myChecker.reverse(theArray);
		return reversedArray;
		 
	} else {
		return theArray;
	}
}

void printArray(int[] theArray) {
	for(int i = 0; i < theArray.length(); i++) {
		print theArray[i];
	}
}

println "First array: "
printArray(checkAndReverse(array1));
println "Second array: "
printArray(checkAndReverse(array2));




//we are duplicating code --> So, it's a symptom that we have to build a method! :)
/*
//verifying the symmetry of the arrays
if (!myCheker.isSymmetrical(array1)) {
	
	int[] reversedArray = myChecker.reverse(array1);
	
	for(int i = 0; i < reversedArray.length() ; i++) {	
		print reversedArray[i];	
	}
	
} else {
	for(int i = 0; i < array1.length() ; i++) {	
		print array1[i];	
	}
}

if (!myCheker.isSymmetrical(array2)) {
	
	int[] reversedArray = myChecker.reverse(array2);
	
	for(int i = 0; i < reversedArray.length() ; i++) {	
		print reversedArray[i];	
	}
	
} else {
	for(int i = 0; i < array2.length() ; i++) {	
		print array2[i];	
	}
}
*/
