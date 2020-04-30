/*


*/

public class APPhysics extends Homework{

	private int pagesRead;
	private String hwType;


	public APPhysics(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Physics";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

}