// 19/11/16

/*
Problem statement
Q1. Singly-linked lists
Create a linked list following the "hospital and patients example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. Check that you can delete the first element too.
*/

public class Q1 {

	public static void main (String[] args) {
	
		// Here be the code to lunch the program
		
		HospitalManager hospitalManager = new HospitalManager();
		
		// Creating patients and adding them to the hospital list
		Patient newPatient1 = new Patient("Mary", 30, "Headache");
		//System.out.println(newPatient1);
		//System.out.println(newPatient1.getNextPatient());
		hospitalManager.addPatient(newPatient1);
		Patient newPatient2 = new Patient("John", 28, "Flu");
		//System.out.println(newPatient2);
		//System.out.println(newPatient1.getNextPatient());
		hospitalManager.addPatient(newPatient2);
		Patient newPatient3 = new Patient("Doli", 31, "Cold");
		//System.out.println(newPatient3);
		hospitalManager.addPatient(newPatient3);
		Patient newPatient4 = new Patient("Peter", 33, "In love");
		hospitalManager.addPatient(newPatient4);
		Patient newPatient5 = new Patient("Jen", 25, "Swollen toe");
		hospitalManager.addPatient(newPatient5);
		
		/*System.out.println(newPatient1.getName());
		System.out.println(newPatient2.getName());
		System.out.println(newPatient3.getName());
		System.out.println(newPatient1.getNextPatient());
		*/
		
		// Printing each element of the list after their addition
		System.out.println("");
		hospitalManager.printEachPatientFromList();
		System.out.println("");
		System.out.println(Integer.toString(Patient.getListLength())); //var estatica e como se fosse global
		
		// Deleting elements
		hospitalManager.removePatient("Mary");
		
		System.out.println("");
		hospitalManager.printEachPatientFromList();
		System.out.println("");
		System.out.println(Integer.toString(Patient.getListLength())); //verificar melhor o conceito de boxing/autoboxing.
		
	}
	

}

//batch file
//path!!!