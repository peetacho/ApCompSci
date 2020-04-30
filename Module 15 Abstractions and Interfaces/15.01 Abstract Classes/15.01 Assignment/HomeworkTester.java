
import java.util.ArrayList;

public class HomeworkTester{

	public static void main(String [] args){
		APCalc calc = new APCalc();
		APPhysics physics = new APPhysics();
		APCS compsci = new APCS();
		APChem chem = new APChem();

		calc.createAssignment(5);
		physics.createAssignment(5);
		compsci.createAssignment(3);
		chem.createAssignment(12);
		
		ArrayList<Homework> hwArray = new ArrayList<Homework>();
		hwArray.add(calc);
		hwArray.add(physics);
		hwArray.add(compsci);
		hwArray.add(chem);


		System.out.println("My Homework Reading To-Do");
        System.out.println("-------------------------------------");
		for (Homework i: hwArray){
			System.out.println(i);
		}

	}

}