/*


*/

public class Samsung extends Phone{

	private String name;
	private double cost;

	public Samsung(String name, double cost){
		super(name, cost);
		
	}

	public void message(){
		// messages ppl
	}

	public String toString(){
		return getName();
	}
}