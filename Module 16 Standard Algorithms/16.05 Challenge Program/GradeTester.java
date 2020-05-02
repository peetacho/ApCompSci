/**
 * Main method
 *
 * @author Peter Chow
 * @version 05/02/20
 */

import java.util.*;

public class GradeTester{


	public static void printTable(List<Student> studentList){
		System.out.println();
		System.out.printf("%-17s%-8s%-8s%-8s%-8s%-8s%n", "Student Name","Q1","Q2","Q3","Q4","Q5");
		System.out.println("--------------------------------------------------------");
		
		for(Student item:studentList){
			System.out.printf("%-17s%-8d%-8d%-8d%-8d%-8d%n", 
							item.getName(),item.getGrade(1),item.getGrade(2),
							item.getGrade(3),item.getGrade(4),item.getGrade(5));
		}
	}

    public static void changeName(List<Student> studentList, String find, String replace)
    {
       for(int i = 0; i < studentList.size(); i++)
          if(studentList.get(i).getName().equals(find))
               studentList.get(i).setName(replace);
    }

    public static void changeGrade(List<Student> studentList,String name, int quizNum, int newQuizGrade)
    {
    	for(int i = 0; i < studentList.size(); i++){
        	if(studentList.get(i).getName().equals(name)){
            	studentList.get(i).setGrade(quizNum, newQuizGrade);
        	}
        }
    }

    public static void changeStudent(List<Student> studentList, String oldStudent, String newStudent,int q1,int q2,int q3,int q4,int q5)
    {
       for(int i = 0; i < studentList.size(); i++)
          if(studentList.get(i).getName().equals(oldStudent)){
               studentList.get(i).setName(newStudent);
               studentList.get(i).setGrade(1, q1);
               studentList.get(i).setGrade(2, q2);
               studentList.get(i).setGrade(3, q3);
               studentList.get(i).setGrade(4, q4);
               studentList.get(i).setGrade(5, q5);
          }
    }

    public static void insertStudent(List<Student> studentList, String studentBefore, String newStudent,int q1,int q2,int q3,int q4,int q5)
    {
        int location = 0;

        // find location of student you want to insert before
        for(int index = 0; index < studentList.size(); index++){
            if(studentList.get(index).getName().equals(studentBefore)){
                location = index;
            }
        }
        studentList.add(location, new Student(newStudent,q1,q2,q3,q4,q5));
    }

    public static void deleteStudentByName(List<Student> studentList, String find)
    {
        int location = 0;
        int index;

        // find location of student you want to delete
        for(index = 0; index < studentList.size(); index++)
        {
            if(studentList.get(index).getName().equals(find))
            {
                location = index;
                break;
            }
        }
        
        // delete student from ArrayList
        if (index != studentList.size()){
            studentList.remove(location);
        }
    }

	public static void main(String [] args){

        List<Student> studentList = new ArrayList<Student>();
        
        // create studentList
        studentList.add( new Student("Jonathan Ma",95,93,89,100,97));
        studentList.add( new Student("Timothy Lau",87,97,98,93,92 ));
        studentList.add( new Student("Freddy Szeto",95,91,90,95,85));
        studentList.add( new Student("Randal Cheng",66,69,96,69,96));
        studentList.add( new Student("Enoch Lam",3,13,24,0,14));

        // prints original results
        System.out.println();
        System.out.println("Original Results");
        printTable(studentList);
        System.out.println();

        // prints change student results
        System.out.println();
        System.out.println("<< Change Enoch Lam student to Peter Chow with scores of 95,95,92,91,69.>>");
        changeStudent(studentList, "Enoch Lam","Peter Chow",95,95,92,91,69);
		printTable(studentList);
        System.out.println();

        // prints insert student results
        System.out.println();
        System.out.println("<< Adding Madison Beer, a new student, before Timothy Lau >>");
        insertStudent(studentList, "Timothy Lau","Madison Beer",100,100,99,100,100);
		printTable(studentList);
        System.out.println();

        // prints change name results
        System.out.println();
        System.out.println("<< Change Madison Beer's name to Madison Chow  >>");
        changeName(studentList, "Madison Beer","Madison Chow");
		printTable(studentList);
        System.out.println();

        // prints change grade results
        System.out.println();
        System.out.println("<< Change Jonathan Ma's Q1 grade to 100  >>");
        changeGrade(studentList, "Jonathan Ma",1,100);
		printTable(studentList);
        System.out.println();

        // prints delete student results
        System.out.println();
        System.out.println("<< Delete Freddy Szeto >>");
        deleteStudentByName(studentList, "Freddy Szeto");
		printTable(studentList);
        System.out.println();

	}

}