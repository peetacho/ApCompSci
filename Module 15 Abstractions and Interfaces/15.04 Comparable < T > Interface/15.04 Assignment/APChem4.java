/*


*/

public class APChem4 extends Homework4{

	private int pagesRead;
	private String hwType;


	public APChem4(){
		super();
		
	}

	public void createAssignment(int pr){
		setNumPages(pr);
		hwType = "AP Chem";
	}

	public String toString(){
		return hwType + " - read " + getNumPages() + " pages.";
	}

	public String getType(){
		return hwType;
	}


}