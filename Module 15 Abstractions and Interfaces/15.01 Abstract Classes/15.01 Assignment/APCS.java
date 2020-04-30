/*


*/

public class APCS extends Homework{

	private int pagesRead;
	private String hwType;


	public APCS(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Computer Science";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

}