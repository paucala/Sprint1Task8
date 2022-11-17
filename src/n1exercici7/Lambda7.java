package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;

public class Lambda7 {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Pala");
		arr.add(3);
		arr.add(45);
		arr.add("Cotxe");
		arr.sort(Comparator.comparing(s -> s.toString().length()).reversed());
		arr.forEach(System.out::println);
	}

}
