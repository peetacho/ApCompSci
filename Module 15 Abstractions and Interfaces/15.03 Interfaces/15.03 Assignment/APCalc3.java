/*


*/

public class APCalc3 extends Homework3 implements Processing{

	private int pagesRead, pagesLeft;
	private String hwType;


	public APCalc3(){
		super();
		
	}

	public void doingHW(){
		pagesLeft = getNumPages() - 5;
	}

	//getter method for getting pages left after doing HW
	public int getPagesLeft(){
		return pagesLeft;
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Calculus";
	}

	public String toString(){
		
		String one = "Before reading: " + hwType + " - read " + getNumPages() + " pages.\n" 
					+ "After reading: " + hwType + " - read " + getPagesLeft() + " pages.";

		return one;
	}

}