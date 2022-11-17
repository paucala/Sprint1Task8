package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;

public class Lambda6 {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Pala");
		arr.add(3);
		arr.add(45);
		arr.add("Cotxe");
		arr.sort(Comparator.comparing(s -> s.toString().length()));
		arr.forEach(System.out::println);
	}

}
