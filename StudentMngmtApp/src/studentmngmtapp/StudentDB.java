package studentmngmtapp;

import java.util.Scanner;

public class StudentDB
{
  public static int studentId = 7700; 
  public static int courseCost = 700; 
  private String firstName;
  private String lastName;
  private int enrollYear;
  private String stuId;
  private String courses = null;
  private int balance = 0;
  
  
  
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
    
    setStuId(); 
    System.out.println(firstName + " " + lastName + " " + enrollYear + " " + stuId);
    
  }
  
  //Generate a students ID
  private void setStuId()
  {
    //Grade level + ID
    studentId++; 
    this.stuId = enrollYear + "" + studentId; 
  }
  
  //Enroll in courses
  public void stuEnroll()
  {
    //loop that terminates when user hits 0
    String course = "";
    
    do {  
      System.out.print("Enter course to enroll (Q to quit): ");
      Scanner input = new Scanner(System.in);
      course = input.nextLine();
      if(!course.equalsIgnoreCase("Q")) 
      {
        courses = courses + "\n" + course; 
        balance = balance + courseCost; 
      }
    }while(!course.equalsIgnoreCase("Q"));
    
    System.out.println("Enrolled In: " + courses);
    System.out.println("Tuition balance: " + balance);
  }
  //View balance
  public void viewBalance()
  {
    String.format("$,.2f", balance); 
  }
  
  
}//end class
