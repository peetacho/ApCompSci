/**
 * Purpose:  This class defines a student by its name and 5 quiz grades.
 *
 * @author Peter Chow
 * @version 05/02/20
 */

public class Student{

	private int q1, q2, q3, q4, q5;
	private String name;

	public Student(String name, int q1, int q2, int q3, int q4, int  q5 ){

		this.name = name;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
	}

	public String getName(){
		return name;
	}

	public void setName(String n){
		name = n;
	}

	public void setGrade(int quizNum, int quizScore){
		if (quizNum == 1){
			q1 = quizScore;
		}
		else if (quizNum == 2){
			q2 = quizScore;
		}
		else if (quizNum == 3){
			q3 = quizScore;
		}
		else if (quizNum == 4){
			q4 = quizScore;
		}
		else{
			q5 = quizScore;
		}
	}

	public int getGrade(int quizNum){
		if (quizNum == 1){
			return q1;
		}
		else if (quizNum == 2){
			return q2;
		}
		else if (quizNum == 3){
			return q3;
		}
		else if (quizNum == 4){
			return q4;
		}
		else{
			return q5;
		}
	}

	public String toString(){
		String s = name + q1 + q2 + q3 + q4 + q5;
		return s;
	}

/*
	public String toString(){
		return String.format("%-25d%-15d%-15d%-15d%-15d%-15d%n", 
							name, q1,q2,q3,q4,q5);
	}
*/
	
}