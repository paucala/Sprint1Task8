package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambdas1 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Paco");
		array.add("Laura");
		array.add("Lola");
		array.add("Albert");
		array.add("Fernando");
		genericTester(array, a -> a.contains("o"));

	}
	public static <T> void genericTester(List<T> list, Predicate<T> tester) {
		ArrayList<T> newArray = new ArrayList<T>();
		for (T t : list) {
			if(tester.test(t)) {
				newArray.add(t);
			}
		}
		printList(newArray);
		
	}
	public static  <T> void printList(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
		
	}

}
