/**
 * This class defines a student and its basic functions.
 *
 * @author Peter Chow
 * @version 05/04/20
 */

import java.util.*;

public class StudentData{

	private String first, last, letterGrade;
	private String stringD, str;
	private double[] grades;
	private int average;

	public StudentData(String first, String last, double[] grades){
		
		if(first.compareTo("") == 0){
			str = "Error: First Name cannot be empty. ";
			throw new IllegalArgumentException(str);
		}
		else{
			this.first = first;
		}

		if(last.compareTo("") == 0){
			str = "Error: Last Name cannot be empty. ";
			throw new IllegalArgumentException(str);
		}
		else{
			this.last = last;
		}

		if(grades.length == 0){
			str = "Error: Grade list cannot be empty. ";
			throw new RuntimeException(str);
		}
		else{
			this.grades = grades;
		}
	}

	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}

	public String getLetterGrade(){
		int total = 0;
		int average;
		String letter = "";
		for(int i = 0; i<grades.length; i++){

			total += grades[i];
		}

		average = (total / grades.length);

		if(average >= 90){
			letter = "A";
		}
		else if(average >= 80){
			letter = "B";
		}
		else if(average >= 70){
			letter = "C";
		}
		else if(average >= 60){
			letter = "D";
		}
		else{
			letter = "F";
		}

		letterGrade = letter;

		return letterGrade;
	}

	public double[] getGrades(){
		
		return grades;
	}

	public String listGrades(){
		for(int d=0; d<grades.length; d++){
			stringD = String.valueOf(grades[d]);
			str += stringD + " ";
		}
		return str.substring(4);
	}

	public String toString(){

		String str = String.format("%-10s %-8s - %-5s: %-25s", first, last, getLetterGrade(), listGrades());
		return str;
		
	}

}