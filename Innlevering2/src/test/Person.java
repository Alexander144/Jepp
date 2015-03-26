package test;

public class Person implements Comparable<Person> {
private String firstName;
private String familyName;
private String socialSecurityNumber;
public Person() {
this("ukjent", "ukjent", "ukjent");
}
public Person(String firstName, String familyName, String socialSecurityNumber) {
setFirstName(firstName);
setFamilyName(familyName);
setSocialSecurityNumber(socialSecurityNumber);
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public void setFamilyName(String familyName) {
this.familyName = familyName;
}
public void setSocialSecurityNumber(String socialSecurityNumber) {
this.socialSecurityNumber = socialSecurityNumber;
}
public String getFirstName() {
return firstName;
}
public String getFamilyName() {
return familyName;
}
public String getSocialSecurityNumber() {
return socialSecurityNumber;
}
//Andre methoder
public String toString() {
return String.format("%10S%10S%10S", firstName, familyName, socialSecurityNumber);
}
public int compareTo(Person o) {
String s1 = getSocialSecurityNumber();
String s2 = o.getSocialSecurityNumber();
int value = s1.compareTo(s2);
return value;
}
}
