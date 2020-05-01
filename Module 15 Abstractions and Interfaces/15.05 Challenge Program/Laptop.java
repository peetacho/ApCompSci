 /**
 * 
 * An abstract class that implements Product and Comparable
 *
 * @author Peter Chow
 * @version 04/30/20
 */

public abstract class Laptop implements Product, Comparable<Laptop>{

	private String name;
	private double cost;

	public Laptop(String name, double cost){

		this.name = name;
		this.cost = cost;
	}

	public void message(){
		// messages ppl
	}

	public String getName(){
		return name;
	}

	public double getCost(){
		return cost;
	}	

	public int compareTo(Laptop obj){

		if(cost < obj.cost)
			return -1;
		else if(cost == obj.cost)
			return 0;
		else
			return 1;
	}

}