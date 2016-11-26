// 19/11/16

/*
Problem statement
Q1. Singly-linked lists
Create a linked list following the "hospital and patients example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again.
   Check that the deleted elements have been deleted. Check that you can delete the first element too.
*/

public class Q1 {

	public static void main (String[] args) {
		
		HospitalManager hospitalManager = new HospitalManager();
		
		// Creating patients and adding them to the hospital list
		Patient newPatient1 = new Patient("Mary", 30, "Headache");
		hospitalManager.addPatient(newPatient1);
		Patient newPatient2 = new Patient("John", 28, "Flu");
		hospitalManager.addPatient(newPatient2);
		Patient newPatient3 = new Patient("Doli", 31, "Cold");
		hospitalManager.addPatient(newPatient3);
		Patient newPatient4 = new Patient("Peter", 33, "In love");
		hospitalManager.addPatient(newPatient4);
		Patient newPatient5 = new Patient("Jen", 25, "Swollen toe");
		hospitalManager.addPatient(newPatient5);
		
		// Printing each element of the list after their addition
		System.out.println("");
		hospitalManager.printEachPatientFromList();
		
		// Print out the length of the list
		System.out.println("");
		System.out.println(Integer.toString(hospitalManager.listLength()));
			
		// Deleting elements
		hospitalManager.removePatient("Mary");
		
		// Printing each element of the list after the delection of one element
		System.out.println("");
		hospitalManager.printEachPatientFromList();
		
		// Print out the length of the list
		System.out.println("");
		System.out.println(Integer.toString(hospitalManager.listLength()));
	
	}
	
}
