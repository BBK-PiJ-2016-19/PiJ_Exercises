import org.junit.Test;
import static org.junit.Assert.*;

public class BookShould { //We can call this class as BookTest as well - that's another style
  
  // -------------------------------Version One---------------------------------------
  // Where we put this line: Book book = new BookImpl("Shakespeare", "Macbeth");
  // in every single test method.
  
  @Test
  public void returnItsTitleIfItIsMacbeth() {
	 Book book = new BookImpl("Shakespeare", "Macbeth");
	 //Version 1
     String expected = "Macbeth";
     String actual = book.getTitle();
     assertEquals(expected, actual);
	 /*
	 //Version 2
	 assertEquals("Macbeth", book.getTitle());
	 */
  }

  @Test
  public void returnItsTitleIfItIsHamlet() {
	 Book book = new BookImpl("Shakespeare", "Hamlet");
     String expected = "Hamlet";
     String actual = book.getTitle();
     assertEquals(expected, actual);
  }

  @Test
  public void returnAuthorName(){
	 Book book = new BookImpl("Shakespeare", "Macbeth");
     String expected = "Shakespeare";
     String actual = book.getAuthorName();
     assertEquals(expected, actual); 
	 //Another version
	 assertEquals("Shakespeare", book.getAuthorName());
  }
}
  
  
  
  
  /*
  //ATTENTION PLEASE: We need to declare another var book2!
  //------------------------------Version Two--------------------------------------
  //Other way of declaring and creating the object
  //Avoids repeating this line: Book book = new BookImpl("Shakespeare", "Macbeth");
  
  //this is a field and it is here(outside the method setUp) 
  //just to be visible to other methods.
  Book book1;
  Book book2;

  //This method is read by the program before anything else. 
  //That's why we have this annotation: '@Before'
  //This method creates and initialize the variable 'book' 
  //and its value will be visible to other methods
  @Before       
  public void setUp(){
	  book1 = new BookImpl("Shakespeare", "Macbeth");
	  book2 = new BookImpl("Shakespeare", "Hamlet");
  } 
  
  @Test
  public void returnItsTitleIfItIsMacbeth() {
	 //Version 1
     String expected = "Macbeth";
     String actual = book.getTitle();
     assertEquals(expected, actual);
	 
	 //Version 2
	 //assertEquals("Macbeth", book.getTitle());
	 
  }

  @Test
  public void returnItsTitleIfItIsHamlet() {
     String expected = "Hamlet";
     String actual = book.getTitle();
     assertEquals(expected, actual);
  }
  
  @Test
  public void returnAuthorName(){
	 //Version 1
     String expected = "Shakespeare";
     String actual = book.getAuthorName();
     assertEquals(expected, actual); 
	 //Version 2
	 assertEquals("Shakespeare", book.getAuthorName);
  }
  */
  
  
  
  
  //When Stephen was explaning why we should use the name of the interface
  //and not the class itself.
  /*
  @Test 
  public void testAdvanceBook(){
	  book = new AdvanceBookImpl();
  }
  */

  
  

//Proposed exercise by Stephen: User Interface, test and implementation