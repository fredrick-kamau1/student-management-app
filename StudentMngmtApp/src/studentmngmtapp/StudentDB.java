package studentmngmtapp;

import java.util.Scanner;

public class StudentDB
{
  private String firstName;
  private String lastName;
  private String enrollYear;
  private int stuID;
  private String courses;
  private int balance;
  private int courseCost = 600;
  
  
  public StudentDB(String enrollYear)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First name: ");
    this.firstName = input.nextLine();
    System.out.print("Enter Last name: ");
    this.lastName = input.nextLine();
    System.out.print("Enter student class level");
    this.firstName = input.nextLine();
    this.enrollYear = enrollYear;
    
    System.out.println(name + " " + enrollYear);
  }
  
  //Generate a students ID
  private String studentID()
  {
    
  }
  
  //Enroll in courses
  private String stuEnroll()
  {
    
  }
  
}//end class
