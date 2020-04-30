/*


*/

public class APCalc extends Homework{

	private int pagesRead;
	private String hwType;


	public APCalc(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Calculus";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

}