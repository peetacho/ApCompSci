 /**
 * 
 * Subclass that extends Homework, an abstract class.
 *
 * @author Peter Chow
 * @version 04/30/20
 */

public class APCS3 extends Homework3 implements Processing{

	private int pagesRead, pagesLeft;
	private String hwType;


	public APCS3(){
		super();
		
	}

	public void doingHW(){
		pagesLeft = getNumPages() - 9;
	}

	//getter method for getting pages left after doing HW
	public int getPagesLeft(){
		return pagesLeft;
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Computer Science";
	}

	public String toString(){
		
		String one = "Before reading: " + hwType + " - read " + getNumPages() + " pages.\n" 
					+ "After reading: " + hwType + " - read " + getPagesLeft() + " pages.";

		return one;
	}
}