/*


*/

public abstract class Homework3 {

	private int pagesRead, pagesLeft;
	private String hwType;

	public Homework3(){

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