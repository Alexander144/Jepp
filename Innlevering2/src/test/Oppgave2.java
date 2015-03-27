package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Oppgave2 {
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Person> personer = setPerson();
		System.out.println("Alle personene: ");
		showPersons(personer);
		ArrayList<Person> students = getStudent();
		System.out.println("Alle studentene: ");
		showPersons(students);
}
	public static ArrayList<Person> setPerson() throws FileNotFoundException{	
		Scanner input = new Scanner(new File("personer.txt"));
		ArrayList<Person> Personer = new ArrayList<Person>();
		while(input.hasNext()){
			String person = input.next();
			if(person.startsWith("S")){
				String studentnummer = person.split(",")[1];
				String personnummer = person.split(",")[2];
				String fornavn = person.split(",")[3];
				String etternavn = person.split(",")[4];
				int studiepoeng = Integer.parseInt(person.split(",")[5]);
				Student elev = new Student(studentnummer, personnummer, fornavn, etternavn, studiepoeng);
				Personer.add(elev);
			}
			else if(person.startsWith("E")){
				String ansattnummer = person.split(",")[1];
				String personnummer = person.split(",")[2];
				String fornavn = person.split(",")[3];
				String etternavn = person.split(",")[4];
				int lonn = Integer.parseInt(person.split(",")[5]);
				Employee ansatt = new Employee(ansattnummer, personnummer, fornavn, etternavn, lonn);
				Personer.add(ansatt);
			}
		}
		input.close();
		return Personer;
	}		
	public static void showPersons(ArrayList<Person>personer){
		for(Person p : personer){
				System.out.println(p);
			}
	}
	public static ArrayList<Person> getStudent() throws FileNotFoundException{
		Scanner input = new Scanner(new File("personer.txt"));
		ArrayList<Person> student = new ArrayList<Person>();
		while(input.hasNext()){
			String person = input.next();
			if(person.startsWith("S")){
				String studentnummer = person.split(",")[1];
				String personnummer = person.split(",")[2];
				String fornavn = person.split(",")[3];
				String etternavn = person.split(",")[4];
				int studiepoeng = Integer.parseInt(person.split(",")[5]);
				Student elev = new Student(studentnummer, personnummer, fornavn, etternavn, studiepoeng);
				student.add(elev);
			}
		}
		input.close();
		return student;
	}
}
