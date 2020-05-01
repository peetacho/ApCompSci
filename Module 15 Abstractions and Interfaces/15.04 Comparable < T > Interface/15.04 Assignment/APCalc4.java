 /**
 * 
 * Subclass that extends Homework, an abstract class.
 *
 * @author Peter Chow
 * @version 04/30/20
 */
 
public class APCalc4 extends Homework4{

	private int pagesRead;
	private String hwType;


	public APCalc4(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Calculus";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

	public String getType(){
		return hwType;
	}

}