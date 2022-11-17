package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> students = createStudents();
		//Mostra per pantalla el nom i l’edat de cada alumne/a. 
		students.forEach(s -> System.out.println("Nom: " + s.getName() + " | Edat: " + s.getAge()));
		System.out.println("----------------------");
		//Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. 
		//Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes).
		students.stream()
				.filter(s -> s.getName().startsWith("A"))
				.collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("----------------------");
		//Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
		students.stream()
				.filter(s -> s.getGrade() >= 5)
				.forEach(System.out::println);
		System.out.println("----------------------");
		//Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.
		students.stream()
				.filter(s -> s.getGrade() >= 5)
				.filter(s -> !s.getCourse().equals("PHP"))
				.forEach(System.out::println);
		System.out.println("----------------------");
		// Mostra tots els alumnes que fan JAVA i són majors d’edat.
		students.stream()
				.filter(s -> s.getCourse().equals("JAVA"))
				.filter(s -> s.getAge() >= 18)
				.forEach(System.out::println);
	

	}
	public static ArrayList<Student> createStudents() {
		Student s1 = new Student ("Laura", 17, "PHP", 9.4);
		Student s2 = new Student ("Martina", 25, "JAVA", 7.6);
		Student s3 = new Student ("Ali", 16, "NODEJS", 8.4);
		Student s4 = new Student ("Marc", 56, "PHP", 6.1);
		Student s5 = new Student ("Amanda", 18, "PHP", 4.5);
		Student s6 = new Student ("Pere", 32, "JAVA", 8.5);
		Student s7 = new Student ("Lua", 17, "JAVA", 3.3);
		Student s8 = new Student ("Christian", 24, "NODEJS", 4.6);
		Student s9 = new Student ("Guillem", 30, "JAVA", 8.4);
		Student s10 = new Student ("Bimba", 35, "NODEJS", 9);
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		return students;
	}

}
