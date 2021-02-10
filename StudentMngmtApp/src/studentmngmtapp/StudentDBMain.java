package studentmngmtapp;

import java.util.Scanner;

public class StudentDBMain
{
  public static void main(String[] args)
  {    
    //Prompt for number of students to e added 
    System.out.println("Number of students to be enrolled: ");
    Scanner input = new Scanner(System.in);
    final int NUM_STUDENTS = Integer.parseInt(input.nextLine()); 
    StudentDB[] newStudents = new StudentDB[NUM_STUDENTS];
    
    //Create new student objects
    for(int i = 0; i < NUM_STUDENTS; i++) {
      newStudents[i] = new StudentDB(); 
      newStudents[i].stuEnroll();
      newStudents[i].payTuition();
      System.out.println(newStudents[i].toString());  
    }
    
  }//end main   
}//end class
