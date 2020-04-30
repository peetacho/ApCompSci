/*

*/

public abstract class Homework4 implements Comparable<Homework4>{

	private int pagesRead;
	private String hwType;

	public Homework4(){

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

	public String getType(){
		return hwType;
	}

	// setter method for number of pages read
	public void setNumPages(int pages){
		
		pagesRead = pages;
	} 

	public int compareTo(Homework4 obj){

		if(pagesRead < obj.pagesRead)
			return -1;
		else if(pagesRead == obj.pagesRead)
			return 0;
		else
			return 1;
	}





}