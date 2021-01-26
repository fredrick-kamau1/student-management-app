package studentmngmtapp;

import java.util.Scanner;

public class StudentDB
{
  private String firstName;
  private String lastName;
  private int enrollYear;
  private int stuID;
  private String courses;
  private int balance;
  private int courseCost = 600;
  
  
  public StudentDB()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First name: ");
    this.firstName = input.nextLine();
    System.out.print("Enter Last name: ");
    this.lastName = input.nextLine();
    System.out.print("1. Freshman\n2. Sorphomore\n3. Junior\n4. Senior\n"
        + "Enter student class level: ");
    this.enrollYear = Integer.parseInt(input.nextLine());
    
    System.out.println(firstName + " " + lastName + " " + enrollYear);
  }
  
  //Generate a students ID
  //private String studentID()
  {
    
  }
  
  //Enroll in courses
  //private String stuEnroll()
  {
    
  }
  
}//end class
