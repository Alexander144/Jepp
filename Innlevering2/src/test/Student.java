package test;

public class Student extends Person {
private String studentNumber;
private int credits;
public Student(String studentNumber, String socialSecurityNumber,
 String firstName, String familyName,
 int credits) {
super(firstName, familyName, socialSecurityNumber);
setStudentNumber(studentNumber);
setCredits(credits);
}
public void setStudentNumber(String studentNumber) {
this.studentNumber = studentNumber;
}
public void setCredits(int credits) {
this.credits = credits;
}
public String getStudentNumber() {
return studentNumber;
}
public int getCredits() {
return credits;
}
public String toString() {
return super.toString() + String.format("%10S%10d", getStudentNumber(), getCredits());
}
}
