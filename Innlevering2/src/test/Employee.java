package test;

public class Employee extends Person {
private String employeeNumber;
private int salary;
public Employee(String employeeNumber, String socialSecurityNumber,
 String firstName, String familyName,
 int salary) {
super(firstName, familyName, socialSecurityNumber);
setEmployeeNumber(employeeNumber);
setSalary(salary);
}
public void setEmployeeNumber(String employeeNumber) {
this.employeeNumber = employeeNumber;
}
public void setSalary(int salary) {
this.salary = salary;
}
public String getEmployeeNumber() {
return employeeNumber;
}
public int getSalary() {
return salary;
}
public String toString() {
return super.toString() + String.format("%10S%10d", getEmployeeNumber(), getSalary());
}
}
