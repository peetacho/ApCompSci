 /**
 * 
 * Includes main method. This class uses objects as products and takes inventory of the products.
 * it also compares the prices of two similar products.
 * @author Peter Chow
 * @version 04/30/20
 */

import java.util.*;

public class ProductTester{

	public static List<Product> products = new ArrayList <Product>();

	public static void takeInventory(String name){

		double totalCost = 0;
		int counter = 0;
		
		for(Product p : products){
			if(p.getName().equals(name)){
				counter++;
				totalCost += p.getCost();
			}
		}
		System.out.println(name + ": Quantity = " + counter + 
				", Total Cost = $" + totalCost);
	}

	public static void main(String [] args){

		Nokia n1 = new Nokia("Nokia 8110 4G", 267.59);
		Nokia n2 = new Nokia("Nokia 2720 Flip", 299.99);
		Macbook m1 = new Macbook("Macbook Pro", 10539.30);
		Macbook m2 = new Macbook("Macbook Pro", 8599.99);
		Samsung s1 = new Samsung("Galaxy J2 Core", 4672.00);

		products.add(n1);
		products.add(n2);
		products.add(m1);
		products.add(m2);
		products.add(s1);

		System.out.printf("%29s%n","Inventory");
        System.out.println("--------------------------------------------------");

		takeInventory(n1.getName());
		takeInventory(n2.getName());
		takeInventory(m1.getName());
		takeInventory(s1.getName());

		System.out.println();
		System.out.printf("%35s%n","Comparing the Laptops");
        System.out.println("--------------------------------------------------");

		if(m1.compareTo(m2) == 0)
			System.out.println("The first " + m1.getName() + " and the second " + m2.getName() + " has the same price.");
		else if(m1.compareTo(m2) == 1)
			System.out.println("The first " + m1.getName() + " is MORE expensive than the second " + m2.getName() + ".");
		else
			System.out.println("The first " + m1.getName() + " is LESS expensive than the second " + m2.getName() + ".");

		System.out.println();

	}
}

