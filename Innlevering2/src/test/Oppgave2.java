package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Oppgave2 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("personer.txt"));
		ArrayList<Person> Personer = new ArrayList<Person>();
		while(input.hasNext()){
			String person = input.next();
			if(person.startsWith("S")){
				System.out.println(person);
				String studentnummer = person.split(",")[1];
				String personnummer = person.split(",")[2];
				String fornavn = person.split(",")[3];
				String etternavn = person.split(",")[4];
				int studiepoeng = Integer.parseInt(person.split(",")[5]);
				Student elev = new Student(studentnummer, personnummer, fornavn, etternavn, studiepoeng);
				Personer.add(elev);
			}
			else if(person.startsWith("E")){
				System.out.println(person);
				String ansattnummer = person.split(",")[1];
				String personnummer = person.split(",")[2];
				String fornavn = person.split(",")[3];
				String etternavn = person.split(",")[4];
				int lonn = Integer.parseInt(person.split(",")[5]);
				Employee ansatt = new Employee(ansattnummer, personnummer, fornavn, etternavn, lonn);
				Personer.add(ansatt);
			}
		}
		for(Person p : Personer){
			System.out.println(p);
		}
		input.close();
	}		
}
