package studentmngmtapp;

import java.util.Scanner;

public class StudentDB {
  public static int studentId = 7700;
  public static int courseCost = 700;
  private String firstName;
  private String lastName;
  private int enrollYear;
  private String stuId;
  private String courses = "";
  private int balance = 0;

  public StudentDB() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First name: ");
    this.firstName = input.nextLine();
    System.out.print("Enter Last name: ");
    this.lastName = input.nextLine();
    System.out.print("1. Freshman\n2. Sorphomore\n3. Junior\n4. Senior\n\n"
        + "Enter student class level: ");
    this.enrollYear = Integer.parseInt(input.nextLine());
    setStuId();
  }

  // Generate a students ID
  private void setStuId() {
    // Grade level + ID
    studentId++;
    this.stuId = enrollYear + "" + studentId;
  }

  // Enroll in courses
  public void stuEnroll() {
    // loop that terminates when user enters "q"
    String course = "";

    do {
      System.out.print("Enter course to enroll (Q to quit): ");
      Scanner input = new Scanner(System.in);
      course = input.nextLine();
      if (!course.equalsIgnoreCase("Q")) {
        courses = courses + "\n  " + course;
        balance = balance + courseCost;
      }

    } while (!course.equalsIgnoreCase("Q"));

  }

  // View balance
  public void viewBalance() {
    System.out.println("\nYour balance is: $ " + balance);
  }

  // pay tuition
  public void payTuition() {
    viewBalance();
    System.out.print("How much will you be paying today? ");
    Scanner input = new Scanner(System.in);
    int payment = Integer.parseInt(input.nextLine());
    balance -= payment;
  }

  @Override
  public String toString() {
    return "\nName: " + firstName + " " + lastName + "\nStudet ID#: " + stuId
        + "\nEnrollment Year: " + enrollYear + "\nCourses Enrolled in: "
        + courses + "\nBalance: $" + balance + "\n";
  }

}// end class
