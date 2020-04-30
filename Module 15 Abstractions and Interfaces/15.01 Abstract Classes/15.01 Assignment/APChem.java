/*


*/

public class APChem extends Homework{

	private int pagesRead;
	private String hwType;


	public APChem(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Chem";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

}