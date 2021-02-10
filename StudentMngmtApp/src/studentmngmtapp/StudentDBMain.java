package studentmngmtapp;

public class StudentDBMain
{
  public static void main(String[] args)
  {
    StudentDB newStudent = new StudentDB(); 
    newStudent.stuEnroll();
    newStudent.payTuition(500);
  }

}
