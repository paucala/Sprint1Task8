package n2exercici4;

import java.util.ArrayList;
import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;

public class Lambdas12 {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Pala");
		arr.add(3);
		arr.add(45);
		arr.add("Elvis");
		arr.add("emana");
		//ordena alfabeticament pel primer caracter (si es numeric va abans)
		arr.sort(Comparator.comparing(s -> s.toString().charAt(0)));
		arr.forEach(System.out::println);
		System.out.println("----------------------");
		//imprimeix primer tots els que comencin per una "e"
		arr.stream().filter(s -> s.toString().toLowerCase().startsWith("e")).forEach(System.out::println);
		arr.stream().filter(s -> !s.toString().toLowerCase().startsWith("e")).forEach(System.out::println);
		System.out.println("----------------------");
		//converteix les "a" en "4"
		arr.forEach(s -> System.out.println(s.toString().replace("a", "4")));
		System.out.println("----------------------");
		// mostra elements numerics
		arr.stream().filter(s -> StringUtils.isNumeric(s.toString())).forEach(System.out::println);;
	}

}
