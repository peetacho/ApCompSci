 /**
 * 
 * An abstract class.
 *
 * @author Peter Chow
 * @version 04/30/20
 */

public abstract class Homework{

	private int pagesRead;
	private String hwType;

	public Homework(){

		// initialize variables
		pagesRead = 0;
		hwType = "none";
	}
	
	// abstract method
	public abstract void createAssignment(int pr);

	// getter method for number of pages read
	public int getNumPages(){
		return pagesRead;
	}

	// setter method for number of pages read
	public void setNumPages(int pages){
		
		pagesRead = pages;
	} 

}