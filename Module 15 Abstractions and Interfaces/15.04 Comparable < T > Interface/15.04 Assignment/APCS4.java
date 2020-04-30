/*


*/

public class APCS4 extends Homework4{

	private int pagesRead;
	private String hwType;


	public APCS4(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Computer Science";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

	public String getType(){
		return hwType;
	}


}