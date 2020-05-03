
/**
 * Purpose: Class that defines a product object with parameters name, number, price, and quantity.
 *
 * @author Peter Chow
 * @version 05/03/20
 *
 */
public class Product{

	private int number, quantity;
	private double price;
	private String name;

	public Product(String name, int number, double price, int quantity){

		this.name = name;
		this.number = number;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getNumber(){
		return number;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int quanity){
		this.quantity = quantity;
	}

	public String toString(){
		String str = String.format("%-15s%-10d$%-10.2f%-10d", 
							name, number, price, quantity);
		return str;
	}

}