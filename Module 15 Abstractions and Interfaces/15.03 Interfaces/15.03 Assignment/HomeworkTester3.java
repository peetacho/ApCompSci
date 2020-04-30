/*


*/

import java.util.*;

public class HomeworkTester3{

	public static void main(String [] args){
		APCalc3 calc = new APCalc3();
		APPhysics3 physics = new APPhysics3();
		APCS3 compsci = new APCS3();
		APChem3 chem = new APChem3();

		calc.createAssignment(10);
		physics.createAssignment(7);
		compsci.createAssignment(13);
		chem.createAssignment(12);

		calc.doingHW();
		physics.doingHW();
		compsci.doingHW();
		chem.doingHW();
		
		List<Homework3> hwArray = new ArrayList<Homework3>();
		hwArray.add(calc);
		hwArray.add(physics);
		hwArray.add(compsci);
		hwArray.add(chem);


		System.out.println("\t\tMy Homework");
        System.out.println("-------------------------------------");
		for (Homework3 i: hwArray){
			System.out.println(i);
			System.out.println();
		}

	}

}