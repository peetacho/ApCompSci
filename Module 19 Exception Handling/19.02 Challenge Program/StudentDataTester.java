/**
 * This class defines a student and its basic functions.
 *
 * @author Peter Chow
 * @version 05/04/20
 */
public class StudentDataTester{

	public static void main(String[] args){
		
		double[] grades1 ={95.00,92.50,82.00,95.00,100.00};
		double[] grades2 ={67.60,32.50,54.00,55.00,};
		double[] grades3 ={85.00,75.00,95.00};

		StudentData student1 = new StudentData("Peter","Chow", grades1);
		StudentData student2 = new StudentData("Enoch","Lam", grades2);
		StudentData student3 = new StudentData("Madison","Beer", grades3);

		System.out.println("<<<<<<< Succesful Method Calls >>>>>>>");
		System.out.println("Student with letter grade and scores:");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println();
/*
		System.out.println("<<<<<<< Empty First Name >>>>>>>");
		double[] grades4 ={89.00,92.50,82.00,95.00,100.00};
		StudentData student4 = new StudentData("","Chee", grades4);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student4);
		System.out.println();
*/
		
		System.out.println("<<<<<<< Succesful First Name >>>>>>>");
		double[] grades4 ={89.00,92.50,82.00,95.00,100.00};
		StudentData student4 = new StudentData("Lily","Chee", grades4);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student4);
		System.out.println();


/*
		System.out.println("<<<<<<< Empty Last Name >>>>>>>");
		double[] grades5 ={95.00,32.50,95.00};
		StudentData student5 = new StudentData("Kim","", grades5);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student5);
		System.out.println();
*/

		System.out.println("<<<<<<< Sucessful Last Name >>>>>>>");
		double[] grades5 ={95.00,32.50,95.00};
		StudentData student5 = new StudentData("John","Cena", grades5);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student5);
		System.out.println();

/*
		System.out.println("<<<<<<< Empty Grades List >>>>>>>");
		double[] grades6 ={};
		StudentData student6 = new StudentData("Leslie","Kim", grades6);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student6);
		System.out.println();
*/

		System.out.println("<<<<<<< Sucessful Grades List >>>>>>>");
		double[] grades6 ={69.00,69.00,69.00};
		StudentData student6 = new StudentData("Leslie","Kim", grades6);
		System.out.println("Student with letter grade and scores:");
		System.out.println(student6);
		System.out.println();

	}
}