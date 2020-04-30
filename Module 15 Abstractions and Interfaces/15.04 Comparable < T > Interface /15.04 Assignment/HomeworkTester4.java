
import java.util.*;

public class HomeworkTester4{

	public static void performComparisonWith(Homework4 obj1, Homework4 obj2){

		if(obj1.compareTo(obj2) == 0)
			System.out.println(obj1.getType() + " and " + obj2.getType() + " has the same amount of pages.");
		else if(obj1.compareTo(obj2) == 1)
			System.out.println(obj1.getType() + " has MORE pages to read than " + obj2.getType() + ".");
		else
			System.out.println(obj1.getType() + " has LESS pages to read than " + obj2.getType() + ".");

	}	

	public static void main(String [] args){
		APCalc4 calc = new APCalc4();
		APPhysics4 physics = new APPhysics4();
		APCS4 compsci = new APCS4();
		APChem4 chem = new APChem4();

		calc.createAssignment(5);
		physics.createAssignment(5);
		compsci.createAssignment(3);
		chem.createAssignment(12);
		
		List<Homework4> hwArray = new ArrayList<Homework4>();
		hwArray.add(calc);
		hwArray.add(physics);
		hwArray.add(compsci);
		hwArray.add(chem);


		System.out.printf("%29s%n","My Homework");
        System.out.println("--------------------------------------------------");
		for (Homework4 i: hwArray){
			System.out.println(i);
		}
		System.out.println();

		System.out.printf("%35s%n","Comparing my Homework");
        System.out.println("--------------------------------------------------");

        for(Homework4 i:hwArray){
        	for(Homework4 j:hwArray){
        		
        		if(i == j){
        			//literally do nothing
        		}
        		else
        			performComparisonWith(i,j);
        		
        	}
        	System.out.println();
        }

	}

}