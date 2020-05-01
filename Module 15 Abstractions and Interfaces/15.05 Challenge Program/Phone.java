 /**
 * 
 * An abstract class. Implements Product, an interface.
 *
 * @author Peter Chow
 * @version 04/30/20
 */

public abstract class Phone implements Product{

	private String name;
	private double cost;

	public Phone(String name, double cost){

		this.name = name;
		this.cost = cost;
	}

	public abstract void message();

	public String getName(){
		return name;
	}

	public double getCost(){
		return cost;
	}


}