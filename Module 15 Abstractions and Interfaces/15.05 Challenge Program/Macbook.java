/*


*/

public class Macbook extends Laptop{

	private String name;
	private double cost;

	public Macbook(String name, double cost){
		super(name, cost);
		
	}

	public void message(){
		// messages ppl
	}

	public String toString(){
		return getName();
	}


}